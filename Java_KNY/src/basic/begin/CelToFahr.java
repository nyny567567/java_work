package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨 온도를 입력해주세요: ");
		double cel = sc.nextDouble();
		double fahr = cel * 1.8 + 32;
		System.out.printf("섭씨 온도: %.1f℃\n화씨 온도: %.1f℉"
						, cel, fahr);

		sc.close();
	}

}
