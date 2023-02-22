package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력해주세요 :");
		double hei = sc.nextDouble();
		System.out.println("나이를 입력해주세요 :");
		int age = sc.nextInt();
		
		if(hei >= 140 && age >= 8) {
			System.out.println("탑승이 가능합니다.");
		} else {
			System.out.println("탑승이 불가능합니다.");
		}

		System.out.println("오늘 하루 즐거운 시간 되세요!");
		sc.close();
	}

}
