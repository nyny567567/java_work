package oop.obj_arr;

public class Score {

	/*
    - 이름, 국어, 영어, 수학, 총점, 평균(double)을
     담을 수 있는 객체를 디자인하세요.
     
    - 학생의 모든 정보를 한 눈에 확인할 수 있게
     scoreInfo() 메서드를 선언해 주세요.
     메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.
     
    - 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
    */
	
	String name;
	int kor;
	int eng;
	int math;
	int sum = kor + eng + math;
	double avg = sum / 3;
	double score[] = new double[6];
	arr[0] = name;
	arr[1] = kor;
	arr[2] = eng;
	
		
	void scoreInfo(){
		System.out.println("이름	국어	영어	수학	총점	평균");
		
		 
				
			}
				System.out.println();
		}
	}
	
}
