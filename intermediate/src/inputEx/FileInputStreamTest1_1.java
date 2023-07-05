package inputEx;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1_1 {

	public static void main(String[] args) {
		
		// try with resources 구문을 사용하면 굳이 안 닫아도 됨
		try(FileInputStream fis = new FileInputStream("D:/ex/test2.txt")) {
			int i;
			while( (i = fis.read()) != -1) {   // read로 파일을 읽는 경우 파일의 끝에 도달하면 -1을 반환
				System.out.print((char)i);
			}
		}catch(Exception e){
			System.out.println("파일 경로가 잘못됬거나, 파일명이 틀림");
		}
		
//		FileInputStream fis=null;
//		try {
//			fis=new FileInputStream("D:/ex/test.txt");
//
//		   
//		   int i;
//			while( (i = fis.read()) != -1) {   // read로 파일을 읽는 경우 파일의 끝에 도달하면 -1을 반환
//				System.out.print((char)i);
//			}
//			
//		   
//		   
//		} catch (Exception e) {
//			System.out.println("파일 경로가 잘못됬거나, 파일명이 틀림");
////			e.printStackTrace();
//		}
//	}
	}
}
