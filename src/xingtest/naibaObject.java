package xingtest;

import java.awt.Color;

public class naibaObject {
	
	int num;
	String color;
	
	
	public static void main(String[] args) {
		naibaObject c1 = new naibaObject();
		naibaObject c2 = new naibaObject();
		show(c1);
		
	}
	
	
	
	public static void show(naibaObject c){
		c.num = 2;
		c.color = "red";
		System.out.println(c.num + c.color);
		
	}
	
	
	public static void show2(){
		System.out.println("------");
	}
	
	

}
