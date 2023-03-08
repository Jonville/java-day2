/*
 * 별찍기 2
 */

/*
 * 별찍기;
 */
package day2_project;

import java.util.Scanner;

public class Ex_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력");

		int num = sc.nextInt();

		String star = "";

		for (int i = 0; i < num; i++) {
			star += "*";
			System.out.println(star);
		}

	}
}