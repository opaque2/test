package variable;

public class Test3 {

	public static void main(String[] args) {

		int i1 = 1234;
		
		// long타입 l1 변수에 i1에 값을 저장
//		long l1;
//		l1 = i1; // int -> long으로 자동 형 변환
		long l1 = i1; // 위의 두줄을 한줄로 작성
		
		System.out.println(i1);
		System.out.println(l1);
		
		// byte타입 b1 변수에 i1에 값을 저장
		byte b1 = (byte) i1; // int -> byte로 자동형변환 불가! 명시적(강제) 형 변환 필수!
		System.out.println(b1); // -46 출력!
		// => 변환 과정에서 오버플로우가 발생하므로 다른 값이 저장!
		
		double d1 = i1; // int -> double로 자동 형 변환
		System.out.println(d1); // 소수점 .0 추가됨!
		
		double d2 = 3.14;
		
		// int타입 i2 변수에 d2에 값을 저장
		int i2 = (int) d2; // int 타입으로 명시적(강제) 형 변환 필수!
		System.out.println(i2); // i2는 정수 부분인 3만 저장
		
		
	}

}
