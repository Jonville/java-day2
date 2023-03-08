package day2_project;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("년도를 입력하세요.");
		int num = sc.nextInt();
		
		if (num % 4 == 0 && num % 100 != 0 || num % 400 ==0) {
			System.out.println("윤년 입니다.");
	
		} else {
			System.out.println("윤년이 아닙니다.");
		}
		
	}
}
