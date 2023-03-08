// for문의 활용 2 ( 구구단 )

package day2_project;

import java.util.Scanner;

public class Ex_17 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 입력하세요 . ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i < 10 ; i++) {
			int sum = num * i ;
			
			System.out.println(num + " x " + i + " = " + sum);
		}
		
	}

}
