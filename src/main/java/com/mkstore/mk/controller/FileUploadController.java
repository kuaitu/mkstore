package com.mkstore.mk.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.mkstore.mk.util.Doc2Pdf;
import com.mkstore.mk.util.EasyUIReturns;
import com.mkstore.mk.util.ImageUtil;
import com.mkstore.mk.util.LogUtil;
import com.mkstore.mk.util.SystemConfig;

@Controller
@RequestMapping("/FileUpload/*")
public class FileUploadController {

	@Autowired
	private SystemConfig systemConfig;

	/**
	 * 方法说明:手机端师傅照片上传
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "upload.action")
	public @ResponseBody Map<String, ? extends Object> upload(
			MultipartHttpServletRequest request, Integer width, Integer height) {
		try {
			// 系统默认值
			String fileUploadPath = getFileUploadPath();

			MultipartFile multipartFile = request.getFile("annex");
			SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMM");
			/** 构建文件保存的目录 **/
			String newDir = dateformat.format(new Date());

			/** 得到文件保存目录的真实路径 **/
			String realPathDir = request.getSession().getServletContext()
					.getRealPath("");
			File tmpFile = new File(realPathDir);
			realPathDir = tmpFile.getParent() + File.separator + fileUploadPath
					+ File.separator + newDir;
			/** 根据真实路径创建目录 **/
			File saveFolder = new File(realPathDir);
			if (!saveFolder.exists()) {
				saveFolder.mkdirs();
			}

			/** 上传文件名称 **/
			String annexName = UUID.randomUUID().toString();

			/** 获取文件的后缀 **/
			String suffix = multipartFile.getOriginalFilename().substring(
					multipartFile.getOriginalFilename().lastIndexOf(".") + 1);
			String fileName = realPathDir + File.separator + annexName + '.'
					+ suffix;

			File file = new File(fileName);
			if (isImage(suffix) && null != width && null != height) {
				ImageUtil.makeSmallImage(multipartFile.getInputStream(),
						new FileOutputStream(file), width, height);
			} else {
				multipartFile.transferTo(file);
			}
			
			if("doc".equals(suffix.toLowerCase()) || "docx".equals(suffix.toLowerCase())){
				String destFile = realPathDir + File.separator + annexName + '.'
						+ "pdf";
				//OfficeToPDF.office2PDF(fileName,destFile);//OpenOffice方案，（跨平台，效果差，字体问题）
				Doc2Pdf.doc2pdf(fileName, destFile); //Aspose.Words方案，（跨平台，效果完美）
				String relativePath = systemConfig.getImageServerUrl() + ":"
						+ systemConfig.getImageServerPort() + "/images/" + newDir
						+ "/" + annexName + '.' + "pdf";
				return EasyUIReturns.mapOK(relativePath, "上传成功！");
			}

			// 相对路径
			String relativePath = systemConfig.getImageServerUrl() + ":"
					+ systemConfig.getImageServerPort() + "/images/" + newDir
					+ "/" + annexName + '.' + suffix;
			return EasyUIReturns.mapOK(relativePath, "上传成功！");
		} catch (Exception e) {
			LogUtil.error("上传失败！", e);
			return EasyUIReturns.mapError("上传失败！");
		}
	}

	private boolean isImage(String suffix) {
		return "gif".equals(suffix.toLowerCase()) || "jpeg".equals(suffix.toLowerCase()) || "jpg".equals(suffix.toLowerCase()) || "png".equals(suffix.toLowerCase());
	}

	private String getFileUploadPath() {
		return "images/";
	}

	/**
	 * 方法说明:手机端获取师傅施工照片
	 * 
	 * @param fileName
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "download.action")
	public ModelAndView download(String fileName, String renameTo,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// 系统默认值
		String fileUploadPath = getFileUploadPath();

		String fileNameUTF8 = new String(fileName.getBytes("ISO8859-1"),
				"UTF-8");

		request.setCharacterEncoding("UTF-8"); // 浏览器传过来的是iso8859-1的编码，需要转化下
		java.io.BufferedInputStream bis = null;
		java.io.BufferedOutputStream bos = null;

		String ctxPath = request.getSession().getServletContext()
				.getRealPath("../" + fileUploadPath);
		String downLoadPath = ctxPath + "/" + fileNameUTF8;
		LogUtil.info("下载：" + downLoadPath);
		try {
			File downLoadFile = new File(downLoadPath);
			if (!downLoadFile.exists()) {
				LogUtil.info("下载文件不存在：" + downLoadPath);
			}
			long fileLength = downLoadFile.length();
			response.setContentType("multipart/form-data");
			response.setHeader("Content-disposition", "attachment; filename="
					+ renameTo);
			response.setHeader("Content-Length", String.valueOf(fileLength));
			bis = new BufferedInputStream(new FileInputStream(downLoadPath));
			bos = new BufferedOutputStream(response.getOutputStream());
			byte[] buff = new byte[2048];
			int bytesRead;
			while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
				bos.write(buff, 0, bytesRead);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bis != null)
				bis.close();
			if (bos != null)
				bos.close();
		}
		return null;
	}
}
