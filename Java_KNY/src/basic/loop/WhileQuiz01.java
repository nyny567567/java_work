package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 입력하세요: ");
		int num  = sc.nextInt();
		System.out.println("*** 구구단 " + num + " 단 ***");
		int i=1;
		while(i <= 9) {
//			System.out.println(num + " X " + i + " = " + num * i );
			System.out.printf("%d X %d = %d\n", num, i, num*i);
			i++;
		
			
		}
		sc.close();
	}

}
