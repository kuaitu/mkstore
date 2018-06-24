package com.mkstore.mk.util;

import java.io.*;
import com.aspose.words.*;

public class Doc2Pdf {
	
	public static void main(String[] args){
		String sourceFile = "D:\\TestPdf\\工程管理部周交班会汇报材料.docx";
		String destFile = "D:\\TestPdf\\工程管理部周交班会汇报材料.pdf";
		Doc2Pdf.doc2pdf(sourceFile,destFile);
	}
	
	public static boolean getLicense() {
		boolean result = false;
		try {
             InputStream is = Doc2Pdf.class.getClassLoader().getResourceAsStream("license.xml"); //  license.xml应放在..\WebRoot\WEB-INF\classes路径下
             License aposeLic = new License();
             aposeLic.setLicense(is);
             result = true;
		} catch (Exception e) {
             e.printStackTrace();
		}
	         return result;
	}
		     
     public static void doc2pdf(String sourceFile, String destFile) {
         
         if (!getLicense()) {          // 验证License 若不验证则转化出的pdf文档会有水印产生
             return;
         }
         try {
              long old = System.currentTimeMillis();
             File file = new File(destFile);  //新建一个空白pdf文档
             FileOutputStream os = new FileOutputStream(file);
             Document doc = new Document(sourceFile);                    //Address是将要被转化的word文档
             doc.save(os, SaveFormat.PDF);//全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF, EPUB, XPS, SWF 相互转换
             delete(sourceFile);
             long now = System.currentTimeMillis();
             System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒");  //转化用时
         } catch (Exception e) {
             e.printStackTrace();
         }
     }
     
     public static boolean delete(String fileName) {
         File file = new File(fileName);
         if (!file.exists()) {
             System.out.println("删除文件失败:" + fileName + "不存在！");
             return false;
         } else {
             if (file.isFile())
             	 if (file.delete()) {
                      System.out.println("删除单个文件" + fileName + "成功！");
                      return true;
                  } else {
                      System.out.println("删除单个文件" + fileName + "失败！");
                      return false;
                  }
             else
             	System.out.println("删除单个文件失败：" + fileName + "不存在！");
             	return false;
         }
     }
}
