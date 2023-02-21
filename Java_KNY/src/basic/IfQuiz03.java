package basic;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력해주세요");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("0입니다.");
		} else if(num % 7 == 0) {
			System.out.println("7의 배수입니다.");
		
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
			
		
//		 if(num % 7 == 0 && num != 0) {
//	       System.out.println(num + "은 7의 배수입니다.");
	       
		 
		
		sc.close();

	}

}
