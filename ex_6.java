/* 
 * 
 * import 한번에 하는 방법 ===> ctrl + shift + o
 * 
 * Scanner scanner = new Scanner(System.in);
 * int i = scanner.nextInt();
 * 
 * 
*/


package day2_project;

import java.util.Scanner;

public class ex_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학점을 입력하세요 ");
	
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("학점 : A");
		} else if (score >= 80) {
			System.out.println("학점 : B");
		} else if (score >= 70) {
			System.out.println("학점 : C");
		} else if (score >= 60) {
			System.out.println("학점 : D");
		} else {
			System.out.println("학점 : F");
		}
	}
}