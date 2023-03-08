/*
 * Random 클래스!
 * 
 * random.nextInt(  범위 숫자 입력  );
 * 
 * 
 * random.nextInt( 만약 10 이면 0 ~ 9 까지 );
 * 
 */

package day2_project;

import java.util.Random;

public class RadomEx_01 {

	public static void main(String[] args) {

		Random random = new Random();
		
		System.out.println(random.nextInt(10)+1);
		
	}

}
