package com.mkstore.mk.util;

import java.io.File;  
import java.io.FileNotFoundException;
import java.net.ConnectException;

import com.artofsolving.jodconverter.DocumentConverter;  
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;  
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;  
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

public class OfficeToPDF {
	
    public static int office2PDF(String sourceFile, String destFile) throws FileNotFoundException {    
        try {    
            File inputFile = new File(sourceFile);    
            if (!inputFile.exists()) {    
                return -1;// 找不到源文件, 则返回-1    
            }    
    
            // 如果目标路径不存在, 则新建该路径    
            File outputFile = new File(destFile);    
            if (!outputFile.getParentFile().exists()) {    
                outputFile.getParentFile().mkdirs();    
            }    
            
            // connect to an OpenOffice.org instance running on port 8100    
            OpenOfficeConnection connection = new SocketOpenOfficeConnection(    
                    "127.0.0.1", 8100);    
            connection.connect();    
    
            // convert    
            DocumentConverter converter = new OpenOfficeDocumentConverter(    
                    connection);    
            converter.convert(inputFile, outputFile);    
    
            // close the connection    
            connection.disconnect();    
            delete(sourceFile);
            return 0;    
        } catch (ConnectException e) {    
            e.printStackTrace();    
        }   
    
        return 1;    
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
