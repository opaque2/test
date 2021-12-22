package variable;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * 형 변환(Type Casting)
		 * - 묵시적(암시적) 형 변환 = 자동 형 변환
		 * - 명시적 형 변환 = 강제 형 변환
		 * 
		 * 기본 타입의 허용 범위 순
		 * byte  ->  short  ->  int  -> long  ->  float  ->  double  
		 *           char
		 */
		
		int a1 = 999;
		short a2 = 100;
		
		System.out.println(a1);
		System.out.println(a2);
		
		// short 타입 변수 a2의 데이터를 int 타입 변수 a1에 저장
		a1 = a2;
		// => 이 때, 작은 타입인 short 타입 변수 a2의 데이터가
		//    큰 타입인 int 타입으로 변환되는것을 묵시적 형 변환(자동 형 변환)이라고 한다!
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println("==================================");
		
		int b1 = 99999;
		short b2 = 100;
		
		System.out.println(b1);
		System.out.println(b2);
		
		// int 타입 변수 b1의 데이터를 short 타입 변수 b2에 저장
//		b2 = b1; // 오류 발생!
		// => 큰 타입(int) 데이터를 작은 타입(short) 에 저장할 때
		//    값에 대한 넘침(Overflow)이 발생할 수 있으므로 자동 형변환을 수행하지 않음
		// => 형변환 연산자를 사용하여 명시적 형 변환(강제 형 변환을)을 수행해야함!
		b2 = (short) b1;
		// => 강제 형 변환 후에는 Overflow에 의해 원래의 데이터가 아닌 
		//    다른 변형된 데이터가 저장될 수 있으므로 주의!
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println("==================================");
		
		int c1 = 256;
		byte c2 = 10;
		
		System.out.println(c1);
		System.out.println(c2);
		
		// c2에 데이터를 c1에 저장
		c1 = c2; // 작은 타입(byte) -> 큰 타입(int)로 변환
		System.out.println(c1);
		System.out.println(c2);
		
		int d1 = 256;
		byte d2 = 10;
		
		// d1에 데이터를 d2에 저장
//		d2 = d1; // 오류 발생! 강제 형 변환 필요!
		d2 = (byte) d1; // 형 변환 연산자를 사용하여 byte 타입으로 강제 형변환
		System.out.println(d1);
		System.out.println(d2);
		// => int형 변수에 저장된 정수가 byte 타입 변수에 저장 될 때 값 넘침이 발생하여 
		//    변형된 값이 저장
		
		
	}

}








