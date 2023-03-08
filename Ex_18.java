/* while  문법
 * 
 * while(조건문) {
 * 
 * 
 * 		증감식 !!!
 * }
 * 
 * */

package day2_project;

import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int i = 1;
		while (i <= 9) {

			System.out.println(num + " x " + i + " = " + (num * i));
			i++;

		}

	}

}
