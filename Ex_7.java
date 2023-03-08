package day2_project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	
		System.out.println("숫자를 입력해 주세요.");
			
		try {
		int value = sc.nextInt();

		if (value % 2 == 0) {
			System.out.println("value 는 짝수입니다.");
		} else
			System.out.println("value 는 홀수입니다.");
		
		}catch( InputMismatchException e) {
			System.out.println("!! 숫자를 입력하세요. !!");
		}

	}

}
