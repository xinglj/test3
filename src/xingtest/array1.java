package xingtest;

public class array1 {
	
	
	public static void main(String args[]){
		//��������ķ�ʽ1
		int score[] ;
		score = new int [3];
		
		//��������ķ�ʽ2
		int score2[] = new int [3];
		
		//�������飬������5��ֵ
		int score3[] = {90,88,95,89,100};
		int max = score3[0];
		int min = score3[0];
		
		for (int i=0;i<score3.length;i++){
			
			System.out.print( score3[i] + "\t");
		}
		
		System.out.println();
		for (int i = 0; i<score3.length; i++){
			
			if(score3[i]>max){
				max = score3[i];
				
			}
			
			if(score3[i]<min){
				min = score3[i];
			}
	
		}
		
		System.out.println("���ֵ:" + max);
		System.out.println("��Сֵ:" + min);
		
		System.out.println("1111111111");
		
		
		
	}

}
