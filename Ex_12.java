package day2_project;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요.");
		int price = sc.nextInt();
		
		int oman = price/50000; 
		int ilman = (price%50000)/10000; 
		int ochun = (price%10000)/5000;
		int ilchun = (price%5000)/1000;
		
		System.out.println("5만원권 : " + oman );
		System.out.println("1만원권 : " + ilman);
		System.out.println("5천원권 : " + ochun );
		System.out.println("1천원권 : " + ilchun);
	}

}
