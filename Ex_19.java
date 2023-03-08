/* do ~ while 문법
 * 
 *  do에서 무조건 한번은 실행. (최초 한번은 실행)
 *  
 *  하고 
 *  
 *  while 문으로 넘어간다.
 * 
 * while(true) 무한루프 탈출하기
 * 
 * if ~ break; 문으로 종료시킨다.
 * 
 */

package day2_project;

import java.util.Scanner;

public class Ex_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("구구단 단수를 선택해주세요.");

			int num = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(num + " x " + i + " = " + (num * i));
			}

			System.out.println("계속 하시겠습니까? 계속(1) , 종료(0)");

			int again = sc.nextInt();

			if (again == 0) {
				break; // <- 빠져나가기
			}
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}
