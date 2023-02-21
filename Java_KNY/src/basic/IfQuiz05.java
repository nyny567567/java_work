package basic;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수: ");
		int eng = sc.nextInt();
		System.out.println("수학 점수: ");
		int math = sc.nextInt();
		
		double avr = (kor + eng + math) / 3.0;
		System.out.printf("평균 점수: %.1f\n", avr);
		String grade;
		
		if(avr >= 90) {
			if(avr >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
			
		} else if(avr >= 80) {
			grade = "B";
			
		} else if(avr >= 70) {
			grade = "C";
			
		} else if(avr >= 60) {
			grade = "D";
			
		} else {
			grade = "F";
		}
		System.out.println("당신의 학점은 " + grade +" 입니다");
		
		sc.close();

	}

}
