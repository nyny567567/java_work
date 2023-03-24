package chap03;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart ct = new MyCart(2100);
		Product p1 = new Tv();
		ct.buy(p1);
		Product p2 = new Radio();
		ct.buy(p2);
		Product p3 = new Computer();
		ct.buy(p3);
		
		ct.info();
		System.out.println();
		System.out.println("==================");
		System.out.println("재산 10원일때");
		MyCart ct2 = new MyCart(10);
		ct2.buy(p1);
		ct2.info();

		
		

	}

}
