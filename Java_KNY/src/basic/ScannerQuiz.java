package basic;

import java.util.Scanner; 

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		String name = sc.next();
		System.out.println("나이를 입력하세요:");
		int age = sc.nextInt();
		System.out.printf("이름: %s\n나이: %d세\n출생년도: %d년"
				, name, age, 2023 - age + 1);
		sc.close();
		
		
		
		
		
				

	}

}
