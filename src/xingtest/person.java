package xingtest;

public class person {
	
	
	person(){
		System.out.println("无参构造函数");
	}
	
	person(String n){
		System.out.println("有参构造函数：" + n);
	}
	

	
	
	
	public static void main(String[] args) {
		
		person p = new person("aaa");
		
	}

}


