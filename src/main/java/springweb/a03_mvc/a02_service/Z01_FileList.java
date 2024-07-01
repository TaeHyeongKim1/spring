package springweb.a03_mvc.a02_service;

import java.io.File;

public class Z01_FileList {
		
	public static void main(String[] args){
		String path = "C:\\a00_javaexp\\workspace1\\springweb\\src\\main\\webapp\\z01_upload";
		File fold = new File(path);
		for(File file:fold.listFiles()){
			System.out.println(file.getName());
			
		}
	
		
	}
}
