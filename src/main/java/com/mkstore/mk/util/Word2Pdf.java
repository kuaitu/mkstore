package com.mkstore.mk.util;

import java.io.File;
import java.io.IOException;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;

public class Word2Pdf {
	public static void jacobWord2Pdf(String wordFile, String pdfFile){
		 ActiveXComponent app = null;
	       System.out.println("开始转换...");
	       // 开始时间
	       long start = System.currentTimeMillis();  
	       try {
	        // 打开word
	        app = new ActiveXComponent("Word.Application");
	        // 设置word不可见,很多博客下面这里都写了这一句话，其实是没有必要的，因为默认就是不可见的，如果设置可见就是会打开一个word文档，对于转化为pdf明显是没有必要的
	        //app.setProperty("Visible", false);
	        // 获得word中所有打开的文档
	        Dispatch documents = app.getProperty("Documents").toDispatch();
	        System.out.println("打开文件: " + wordFile);
	        // 打开文档
	        Dispatch document = Dispatch.call(documents, "Open", wordFile, false, true).toDispatch();
	        // 如果文件存在的话，不会覆盖，会直接报错，所以我们需要判断文件是否存在
	        File target = new File(pdfFile);  
	         if (target.exists()) {  
	            target.delete();
	         }
	        System.out.println("另存为: " + pdfFile);
	        // 另存为，将文档报错为pdf，其中word保存为pdf的格式宏的值是17
	        Dispatch.call(document, "SaveAs", pdfFile, 17);
	        // 关闭文档
	        Dispatch.call(document, "Close", false);
	        // 结束时间
	        long end = System.currentTimeMillis();
	        System.out.println("转换成功，用时：" + (end - start) + "ms");
	       }catch(Exception e) {
	        System.out.println("转换失败"+e.getMessage());
	       }finally {
	            // 关闭office
	        app.invoke("Quit", 0);
	       }
	}
	
	public static void main(String args[]) {
		String wordFile = "D:\\TestPdf\\工程管理部周交班会汇报材料(2018年第17次）.docx";
		String pdfFile = "D:\\TestPdf\\工程管理部周交班会汇报材料(2018年第17次）.pdf";
		jacobWord2Pdf(wordFile,pdfFile);
		//doc2pdf(wordFile);
    }
	
	public static boolean doc2pdf(String filepath){
		boolean result=false;
		String filename=filepath.substring(0, filepath.lastIndexOf("."));
		String filetype=filepath.substring(filepath.lastIndexOf(".")+1);
		File file=null;
		String os=System.getProperties().getProperty("os.name");
		//如果当txt文档转换的时候，因为windows下的编码和linux下的文件编码格式不一样会造成 // 中文乱码所有要将txt文件转成utt-8格式的odt文件。
		if(!os.toLowerCase().startsWith("win") && "txt".equals(filetype.toLowerCase())){
		String odt="iconv -f gb2312 -t utf-8 "+filename+".txt -c -s -o "+filename+".odt";
		try {
		Process pro=Runtime.getRuntime().exec(odt);
		pro.waitFor();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		file=new File(filename+".odt");
		}else{
		file=new File(filepath);
		}
		File pdfFile=new File(filename+".pdf");
		System.out.println(filetype);
		if(file.exists()){
		if(!pdfFile.exists()){
		//openOffoceAddress是openoffice安装目录
		String command="C:\\Program Files (x86)\\OpenOffice 4\\"+"program/soffice -headless -accept=\"socket,host=127.0.0.1,port=8100;urp;\"";
		try {
		Runtime.getRuntime().exec(command);
		OpenOfficeConnection connection=new SocketOpenOfficeConnection("127.0.0.1",8100);
		connection.connect();
		DocumentConverter converter=new OpenOfficeDocumentConverter(connection);
		converter.convert(file,pdfFile);
		connection.disconnect();
		System.out.println("****pdf转换成功，PDF输出："+pdfFile.getPath()+"****");
		result=true;
		} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		System.out.println(file.getName()+"pdf转换失败");
		} 
		}
		}
		return result;
		}
}
