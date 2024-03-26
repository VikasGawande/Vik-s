package anu.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class File {

	void FileOperataion1() throws Exception {
		System.out.println("Implementing Byte Streams");
		FileInputStream fis= new FileInputStream("C:\\Anudip\\File.txt");
		System.out.println("Connection created");
		int i;
		while((i=fis.read())!=-1){
			System.out.print((char)i);
		}
		System.out.println();
		
		System.out.println("Data Reterived");
		fis.close();	
	}
	
	void FileOperation2()throws Exception{
		System.out.println("Writting data in file");
		FileOutputStream fos=new FileOutputStream("C:\\Anudip\\File.txt",true);
		System.out.println("connection create");
		String data =", jay bajarang bali";
		byte arr[]=data.getBytes();
		fos.write(arr);
		System.out.println("data written");
		fos.close();
		
	}
	public static void main(String[] args) throws Exception {
		File f=new File();
		f.FileOperataion1();
		f.FileOperation2();
	}




}
