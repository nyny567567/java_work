package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		//48 ~ 150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		//(48부터 숫자를 하나씩 올려가면서 8의 배수 판별을 반복하면 되겠죠?)
		
		int n = 48;
		while(n <= 150) {
			if(n % 8 ==0) {
				System.out.print(n + " ");
			}
			n++;
		
		}
		System.out.println();
		
		//1 ~ 100까지의 정수 중 4의 배수이면서
		//8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int m = 1;
		while(m <= 100) {
			if(m % 4 ==0 && m % 8 !=0) {
				System.out.print(m + " ");
			}
			m++;
		}
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 개수를 출력.
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int p = 1;
		int q = 0; //배수의 개수를 기억해 줄 변수.
		while(p <= 30000) {
			if(p % 258 == 0) {
				q++;				
			} p++;
			
		}
		System.out.println(q);
		
		
		
		int r = 1;
		int s = 0;
		while(r <= 1000) {
			if(1000 % r == 0) {
			s++;
			} r++;
		
			
		}
		System.out.println(s);
	}

}
