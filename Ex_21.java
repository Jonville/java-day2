/*
 * 2중 for ..
 * 
 *  for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
 * 
 * 						i 가 0 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 1 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 2 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 3 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 4 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 5 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 6 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 7 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 8 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 * 						i 가 9 일때 / j  는 0,1,2,3,4,5,6,7,8,9
 */

package day2_project;

import java.util.Scanner;

public class Ex_21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 2; i < 10; i++) {
			System.out.println("======" + i + "단======");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}

		}
	}
}
