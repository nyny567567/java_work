package basic.datatype;

public class TextualExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		System.out.println(c1);
		
		char c2 = 44032;
		System.out.println(c2);
		//아스키코드
		//유니코드 : 웬만한 전세계 언어 표현할 수 있다
		
		/*
		 # 문자열을 저장할 수 있는 데이터 타입 String
		 - 저장하고 싶은 문자열을 겹따옴표("")에 담아 대입합니다.
		 - String은 기본 데이터 타입은 아니지만 자주 쓰이기 때문에
		 기본 데이터 타입처럼 사용합니다. (사실은 객체 타입)
		 */
		
		String s1 = "my dream ";
		//""안에 들어간 공백, 숫자 모두 문자로 취급
		String s2 = "is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		
		//자바에서는 문자열의 덧셈 연산을 지원합니다.
		//연산 결과로는 문자열을 연결해서 결합한 결과가 도출됩니다.
		System.out.println(s1 + s2);
		
		
		//문자열과 다른 데이터 타입 간의 연산
		//결과는 무조건 문자열의 덧셈 연산과 같습니다.
		System.out.println("------------------------");
		
		System.out.println(100+100);
		System.out.println("100" + "100");
		System.out.println("100" + 100);
		System.out.println(3.14 + "hi");
		
		int month = 10;
		int day = 13;
		
		
		//내 생일은 10월 13일 입니다.
		System.out.println("내 생일은 " + month + "월 " + day + "일 입니다.");
	
	}

}
