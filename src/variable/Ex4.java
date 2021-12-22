package variable;

public class Ex4 {

	public static void main(String[] args) {

		/*
		 * char 타입
		 * 
		 * ASCII 코드 - American Standard Code(미국 표준 문자 코드)
		 * - 7bit 구성 = 2^7 = 128가지 문자 표현 가능
		 * - 10진수 형태로 표현
		 * 
		 * Unicode(유니코드)
		 * - 전 세계 모든 문자 표현
		 * - 2Byte(16bit) 로 구성 = 2^16 = 65536가지 문자 표현 가능(0 ~ 65535)
		 * - 16진수 형태로 표현(자바에서는 10진수로도 표현 가능)
		 * - '\ 기호와 u를 쓰고 뒤에 16진수 4자리(XXXX)을 붙여서 표현'
		 * 
		 */
		
		char ch = 'A'; // 대문자 A를 변수 ch에 저장
		System.out.println(ch);
		
//		ch = ''; // 오류 발생! 작은 따옴표 사이에는 반드시 1글자 필수!
		ch = ' '; // 공백 가능
		
//		ch = 'ab'; // 오류 발생! 작은따옴표 사이에 2글자 이상 사용 불가!
		// => 2글자 이상의 문자는 문자열 형태로 큰따옴표 ""를 사용!
		
		char ch2 = 65; // 아스키코드를 사용
		System.out.println(ch2);
		
		char ch3 = 0x41; // 16진수를 사용
		System.out.println(ch3);
		
		char ch4 = '\u0041'; // 유니코드를 사용하는 방법
		// => '\u0000' 형식으로 u뒤에 16진수 4자리 표기
		System.out.println(ch4);
		
		// char 타입은 정수형태로 관리되므로 정수 데이터 처럼 연산 가능
		System.out.println('A' + 3); // 65 + 3 = 68 출력됨!
		
		/*
		 * 문자열
		 * - 큰 따옴표("")로 둘러싸서 표기하는 문자
		 * - 1개 이상의 문자를 사용할 수 있으며, 아무것도 없는 빈 문자("" = 널스트링)도 표현 가능하다
		 * - 문자열을 저장할 수 있는 데이터타입은 String 타입
		 *   => String 타입은 기본 데이터타입이 아닌 참조 데이터타입
		 * 
		 */
		
		// String 타입 변수 str에 문자열 "Hello, World!" 저장
		String str = "Hello, World!";
		System.out.println(str);
		
		// 1글자 표기가 가능
		str = "A";
		System.out.println(str);
		
		str = ""; // 큰따옴표 사이에 아무 문자도 없는 널스트링도 사용 가능
		System.out.println(str);
		
		
	}

}











