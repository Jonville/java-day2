package day2_project;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("값을 입력하세요.");
		int num = sc.nextInt();
		
		int result = num / 100 * 100;
		
		System.out.println(result);
		
		
	}

}
