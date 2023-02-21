package basic;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력해주세요:");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요:");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + "이 큰 수 입니다.");
		} else if(num1 == num2) {
			System.out.println("같은 수 입니다.");
		} else {
			System.out.println(num2 + "이 큰 수 입니다.");
			}

	}

}
