package basic.switch_;

import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[] isSubmit = new boolean[10];
		
		for(int i=1; i<=8; i++) {
			System.out.println("제출한 학생의 번호를 입력: ");
			isSubmit[sc.nextInt()-1] = true;
		}
		for(int j=0; j<isSubmit.length; j++) {
			if(!isSubmit[j]) {
				System.out.println(j+1);
			}
		}
		
		sc.close();
	}
	

}
