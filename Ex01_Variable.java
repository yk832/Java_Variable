package day01;

//클래스명 시작은 대문자
//Student 
//Student Number

public class Ex01_Variable {

		public static void main(String[] args) {
			//int = 정수를 뜻함
			int number=1;
       /* int 변수선언	 int(정수)  nmber(공간) = 1;(담을것) 		
		   변수를 선언하며 초기화 
		    (프로그램에서의 초기화는 처음 사용한 단계로 돌아가는것)	
*/
			int number2;
			//변수를 선언
			number2 = 5;
			//변수 초기화
			
			//변수 타입 
			//1. 정수형(byte, short, int, long)
			byte byte1 = 1; // -128~127
			short short1 =2; //2byte 만큼의 용량을 차지 = 16bit 
			int int1 = 3; //4byte 만큼 = 32bit
			long long1 = 4L; //8byte 만큼 = 64bit
			
			//2. 실수형(소수점)( float, double)
			float float1 = 1.4f;
			double double1 = 2.8;
			
		
			
			int num1 = 10;
			int num2 = 20;
			int result = num1 + num2;
			System.out.println(num1);			
			System.out.println(num2);			
			System.out.println(num1 + num2);			
			System.out.println("num1");
			System.out.println(result);
			
		
		}
}
