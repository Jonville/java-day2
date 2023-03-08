/*
 * for 문 무한루프 !
 * 
 * for(;;)		<<<<<< 무한루프!
 * 
 * 일반 반복문은 for 로 쓰고
 * 무한루프 같은건 while로 사용하자!
 * 
 * 
 * 		!! continue 는 건너뛰는 것 !!
 *  		: 이 반복은 건너뛰어라 라는 뜻
 * 
 */

package day2_project;

import java.util.Scanner;

public class Ex_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int i = 0 ; i < 10 ; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
