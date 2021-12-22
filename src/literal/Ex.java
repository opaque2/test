package literal;

public class Ex {
	
	public static void main(String[] args) {
		/*
		 * 상수(Constant) vs 변수(Variable)
		 * 1. 상수 : 변하지 않는 데이터
		 *    => 자바에서 사용되는 실제 데이터는 리터럴(Literal) 이라고 함
		 *    ex) 정수형 리터럴 : 1, 10, 100L 등
		 *        실수형 리터럴 : 3.14, 1.5f 등
		 *        문자형 리터럴 : 'A'
		 *        문자열형 리터럴 : "홍길동"
		 *        논리형 리터럴 : true, false
		 * 
		 * 2. 변수 : 변하는 데이터
		 */
		
		// 기본형 리터럴
		// 1. 정수형 리터럴(소수점이 없는 수치 데이터)
		System.out.println(1); // 정수형 리터럴 1 을 화면에 출력 
		System.out.println(100);
		System.out.println(2147483647);
//		System.out.println(2147483648);	// 자바에서 기본적인 정수 리터럴은 2147483647 을 초과할 수 없음
		
		// 2. 실수형 리터럴(소수점이 있는 수치 데이터)
		// => 실수 데이터 중 소수점 18번째 자리에서 반올림하여 소수점 17자리로 표기
		System.out.println(3.14);
		System.out.println(0.12345678901234567890);
		
		// 3. 문자형 리터럴(1개의 문자 데이터를 작은따옴표('') 사이에 명시)
		System.out.println('A'); // 대문자 A 를 화면에 출력
		System.out.println('1'); // 문자데이터 1 을 화면에 출력(정수 1과는 다른 데이터)
//		System.out.println('이연태'); // 오류 발생! 작은따옴표 사이에는 반드시 1개 문자만 허용
		
		// 4. 논리형 리터럴(자바에서 논리 데이터 표현 방식인 true 또는 false 만 사용)
		System.out.println(true);
		System.out.println(false);
		
		
		// 확장형 리터럴
		// 1. long 형 리터럴(정수 데이터 뒤에 접미사 L 을 붙여서 표현 => 소문자는 혼동으로 인해 사용하지 X)
		// => 기본 정수형 리터럴보다 더 큰 범위의 정수를 표현 가능
		System.out.println(100L);
		System.out.println(2147483648L); // 2147483648 은 오류가 발생하지만 접미사 L 붙이면 오류 X
		
		// 2. float 형 리터럴(실수 데이터 뒤에 접미사 f 또는 F 를 붙여서 표현)
		// => 실수데이터의 소수점 9번째 자리에서 반올림하여 8자리로 표기
		System.out.println(3.14f);
		System.out.println(0.12345678901234567890f);
		
		// 3. 문자열형 리터럴(0개 이상의 문자 데이터를 큰따옴표("") 사이에 명시)
		System.out.println("이연태"); // 복수개의 문자 데이터 사용 가능
		System.out.println(""); // 큰따옴표 사이에 아무런 문자를 명시하지 않아도 사용 가능함
		
	}

}











