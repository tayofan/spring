package com.jsp.fileTest;

import java.io.File;

import com.jsp.controller.GetUploadPath;

public class FileTest {

	public static void main(String[] args) {
		
		String uploadPath = GetUploadPath.getUploadPath("summernote.img"); 
		
		File file = new File(uploadPath);
		File[] fileList = file.listFiles();
		
		long totalSize = 0;
		
		for(int i = 0; i < fileList.length; i++) {
			System.out.println("file: " + fileList[i]);
			System.out.println("size: " + fileList[i].length());
			totalSize += fileList[i].length();
		}
		
		System.out.println(totalSize/1024);
		
	}

}
