package xingtest;

import java.text.SimpleDateFormat;
import java.io.File;
import java.util.Date;

public class testDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		logcat2();
		File f = new File("/data/local/tmp/Screenshot.png") ;
		System.out.println(f) ;
		*/
		screenshot();
		
		logcat2();
	    
	}
	
	

	
	
	
	public static String getCurrentDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("_yyyyMMdd_HHmmss");
		String dataString = sdf.format(new java.util.Date());
		return dataString;
		
		
	}
	
	
	

	public static void screenshot() {  
		Date a = new Date();  
		SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		String c = b.format(a);  
		System.out.println(c);  
		
		/*
		
		SimpleDateFormat sdf = new SimpleDateFormat("_yyyyMMdd_HHmmss");
		String dataString = sdf.format(new java.util.Date());
		return dataString;
		 */
		
		File files = new File("camera" + c + ".png");  
		System.out.println(files);
		//   getUiDevice().takeScreenshot(files);  
		  
		}  
	
	
	public static void logcat() {

//		String fileName = "/mnt/sdcard/" + className + getCurrentTime() + ".txt";
		File files = new File("/mnt/sdcard"+getCurrentDate()+".txt");  
		String cmd = "adb logcat > " + files;
	

		try {

			Process process;
			process = Runtime.getRuntime().exec(cmd);
			process.waitFor();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}
	
	
	public static void logcat2() {

//		String fileName = "/mnt/sdcard/" + className + getCurrentTime() + ".txt";
		File files = new File("/mnt/sdcard"+getCurrentDate()+".txt");  
		String cmd = "adb logcat > " + files;
		System.out.println(cmd);
/* 
		try {

			Process process;
			process = Runtime.getRuntime().exec(cmd);
			process.waitFor();

		} catch (Exception e) {
			e.printStackTrace();
		}
*/
	}

	
	

	
	
	
	
	

}
