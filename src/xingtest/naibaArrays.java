package xingtest;

import java.util.Random;

public class naibaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println(num);
		
		int num2 = (int) Math.random();
		 
		double a = 1.5;
		int b = (int)a;
		System.out.println(b);
		System.out.println("---111111111-----------");
		int c1 = 1;
		int c2 = 1;
		int c3 = c1++;
		c2 = ++c2;
		System.out.println(c3);
		System.out.println(c2);
		System.out.println("---22222222-----------");
		int x = 12;
		int y = 4;
		x*=++y;
		System.out.println(x + "ºÍ" +  y);
	}

	
	
	
}
