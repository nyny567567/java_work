package oop.abs.good;

public class MainClass {

	public static void main(String[] args) {
		/*
		 - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에
		 프로그래머의 오버라이딩 실수를 방지할 수 있ㄱ. 
		 */
//		HeadStore h = new HeadStore(); (x)
		
		HeadStore s = new SeoulStore();
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderWaterMelon();

	}

}
