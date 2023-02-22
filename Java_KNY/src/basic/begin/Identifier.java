package basic.begin;

public class Identifier {

	public static void main(String[] args) {
		
		//꼭 지켜야 할 규칙 (안 지킬 시 에러가 발생할 수 있습니다.)
		//1. 식별자의 이름은 중복을 허용하지 않습니다.
		//그리고, 대/소문자를 철저하게 구분합니다.
		
		int age = 35;
//		int age = 40; (x)
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하시면 안됩니다.
//		int 700 = 365; (x)
//		int 7number = 7; (x)
	    int number7111 = 7; 
	    int num7ber = 7;
	    
	    
	    //3. 식별자 이름에 공백을 포함할 수 없습니다.
//	    int my birth day = 19921013; (x)
	    int mybirthday = 19921013;
	    int myBirthDay = 19921013; 	    
	    //연결 단어의 첫글자를 대문자로 작성하는 것이 관례 camel case
	    
	    //4. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($)
	    //뿐입니다. 하지만 사용을 권장하지는 않습니다.
	    //저 특수문자들은 사용하기로 약속한 곳이 지정되어 있습니다.
	    String $hello_ = "안녕";
	    
	    //5. 키워드(예약어)는 식별자 이름으로 사용이 불가능합니다.
	    //키워드는 이미 어떠한 기능을 내포하고 있는 지정 문자입니다.
//	    String class = "클래스"; (x)
	    String Class = "클래스"; //(권장하지 않습니다.)
	    String className = "클래스";
	    
	    //6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
	    //하지만 사용을 권장하지는 않습니다.
	    int 숫자 = 10;
	    String 名 = "홍길동";
	    System.out.println(숫자);
	    System.out.println(名);
	    //클래스는 항상 대문자로 시작, 연결단어도 대문자로
	    //변수 이름은 소문자가 원칙, 연결단어는 대문자로
	    //변수이름을 지을 때는 명사의 느낌이 나도록 짓는게 좋다
	    //함수 메서드는 동사적인 의미가 나타날 수 있도록 짓는게 좋다 
	    //함수 이름도 소문자가 원칙
	    //변수 이름을 너무 대충지으면 나중에 헷갈린다
	    //https://www.curioustore.com/ 변수명 지어주는 사이트
	    //기본 데이터 타입 종류(8개) :논리형(Boolean(1bit)), 문자형(char(2)), 
	    //정수형(byte(1byte,-128~127), short(2, -32678~32677), 
//	    int(4,대표형), long(8)), 
	    //실수형(float(4바이트), double(8, 대표형))
	    //string은 기본 데이터 타입은 아니지만 기본 데이터 타입처럼 사용할 수 있다
	    //short 거의 안씀, byte는 기계코딩에서 많이 씀
	    
	    
	    
	    
	    
	    
	    

	}

}
