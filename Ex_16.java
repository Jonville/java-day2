// for 문의 활용 1


package day2_project;

import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요. ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 0 ; i <= num ; i++) {
			System.out.println(i);

			sum += i;
		}

		System.out.println(sum);
	}

}
