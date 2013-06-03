/**  
 * @Title: Main.java 
 * @Package org.zhangge.main 
 * @Description: TODO
 * @author zhgeaits@gmail.com
 * @date 2013-5-19 下午12:17:43 
 * @version V1.0
*/ 
package org.zhangge.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.zhangge.compress.HuffmanEncode;
import org.zhangge.uncompress.HuffmanDecode;

/**
 * @project Compress
 * @file org.zhangge.main.Main.java
 * @author zhangge
 * @email zhgeaits@gmail.com
 * @date 2013-5-19
 * @description
 *
 *
 */

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		HuffmanEncode encode = new HuffmanEncode();
		HuffmanDecode decode = new HuffmanDecode();
		encode.compress(new FileInputStream(new File("i.exe")), new FileOutputStream(new File("i.exe.zip")));
		//System.gc();
		decode.uncompress(new FileInputStream(new File("i.exe.zip")), new FileOutputStream(new File("w.exe")));
	}
}
