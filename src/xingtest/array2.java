package xingtest;

import java.sql.Array;
import java.util.Arrays;

public class array2 {
	
	public static void main(String[] args) {
		
		
		int arrayScore [] = {76,87,69,90,100,70};
		
		System.out.println("没有排序前输出数组的值:");
		for(int i = 0; i < arrayScore.length; i++){
			
			System.out.print(arrayScore[i] + "\t");
		}
		
		
		System.out.println("\n" + "进行排序输出结果");
		Arrays.sort(arrayScore);
		for(int i = 0; i<arrayScore.length; i++){
			
			System.out.print(arrayScore[i] + "\t");
		}
		
	}

}
