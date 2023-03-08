package day2_project;

import java.util.Scanner;

public class Ex_14 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		int height = sc.nextInt();
		
		boolean parent = true;
		boolean hearchDease = false;
		
		
		if(age < 6) {
			System.out.println("탑승불가능");
			
		} else {
			System.out.println("탑승가능");
			if(!parent || hearchDease) {
				System.out.println("탑승불가능");
			}
		}
		
		
			
	
		
		
		
	}

}
