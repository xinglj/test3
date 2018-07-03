package xingtest;

import java.util.Arrays;

public class WhileTestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void sum(){
		int count = 1;
		int sum = 0;
		
		while(count <=100){
			
			sum = sum + count;
			count ++;
		}
		System.out.println(sum);
	}
	
	
	public static void array(){
		
		int arr[] = new int[10];
		int arr2[] ={1,2,3};
		
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
	
	public static void array2(){
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = new int[5];
		
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		
		
	}
	
	
	public static void array3(){
		
		String str[] = {"张三","李四"};
		
		for(String s:str){
			if(s.equals("张三")){
				System.out.println(s);
				continue;
			}
			
			if(s=="李四"){
				System.out.println(s);
				break;
			}
		}
		
	}
	
	
	//冒泡排序
	
	//冒泡排序
	public static void array4(){
		
		int arr4[] = {6,4,5,2,1};
//		Arrays.sort(arr);
		
		for(int i=0; i<arr4.length;i++){
			for(int j=0; j<arr4.length-1; j++){
				if(arr4[j]>arr4[j+1]){
					int tmp = arr4[j];
					arr4[j] = arr4[j+1];
					arr4[j+1]=tmp;	
			}
			
			}		
		}
		
		
		for(int i:arr4){
			System.out.println(arr4[i]);
		}
		
	}

	
	//选择排序
	public static void array5(){
		
		int arr5[] = {6,5,2,4,1};
		
		for(int i=0; i<arr5.length; i++){
			for(int y = i+1; y<arr5.length; y++){
				
			}
		}
		
	}
	
	
	//二位数组的表示
	public static void arr6(){
		int arr[][] = new int[3][4];
	}
	
}
