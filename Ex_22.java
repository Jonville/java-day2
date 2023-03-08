package day2_project;

public class Ex_22 {

	public static void main(String[] args) {

//		for (int i = 2; i < 10; i++) {
//			System.out.println("======" + i + "단======");
//			
//			for (int j = 1; j < 10; j++) {
//						System.out.println(i + " x " + j + " = " + (i*j));
//			}
//		}
		
		
		int i = 9;
		while(i > 1) {
			System.out.println("====" + i + "단====");
			
			int j = 1;			// 1부터 다시 되야하기때문에 ! 여기 배치해놔야한다.
			while(j < 10) {
				System.out.println(i + " x " + j + " = " + (i*j));
				j++;
			}
			
			i--;
			
		}

	}

}
