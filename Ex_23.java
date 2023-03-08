/*
 * 별찍기;
 */
package day2_project;

import java.util.Scanner;

public class Ex_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력");

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) { // i 에 따라서 반복문이 변경이됨
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
