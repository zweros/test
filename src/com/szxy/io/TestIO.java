package com.szxy.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class TestIO {
	
	@Test
	public void write() throws FileNotFoundException{
		File file = new File("file.dat");
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		for(int i=1;i<10;i++){
			ps.print("HelloWorld 123\n");			
		}
		ps.flush();
		ps.close();
	}
	
	@Test 
	public void read() throws IOException{
		File file = new File("file.dat");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fis);
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = bs.read(buf))!= -1){
			System.out.println(new String(buf,0,len));
		}
	}
	
	@Test
	public void skip() throws IOException{
		File file = new File("file.dat");
		FileInputStream fis = new FileInputStream(file);
		
		fis.skip(5); 
		byte[] buf = new byte[1024];
		fis.read(buf,0,10);
		System.out.println(new String(buf));
	}
	
}
