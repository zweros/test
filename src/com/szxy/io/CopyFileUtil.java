package com.szxy.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyFileUtil {

	private CopyFileUtil() {
		throw new AssertionError();
	}

	public static void main(String[] args) {
		String source = "file.dat";
		String target = "file.dat3";
		//CopyFileUtil.copyFileIO(source, target);
		CopyFileUtil.copyFileNIO(source, target);
	}

	public static void copyFileIO(String source, String target) {
		InputStream bis = null;
		OutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(source));
			bos = new BufferedOutputStream(new FileOutputStream(target));
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = bis.read(buf)) != -1) {
				bos.write(buf, 0, len);
				bos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void copyFileNIO(String source, String target) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(target);
			int len = 0;
			FileChannel inChannel = fis.getChannel();
			FileChannel outChannel = fos.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(4096);
			while(inChannel.read(buffer) != -1){
				buffer.flip();
				outChannel.write(buffer);
				buffer.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
