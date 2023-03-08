package day2_project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);

		System.out.println("수학 점수는 입력하세요.");
		int math = sc.nextInt();

		System.out.println("영어 점수는 입력하세요.");
		int eng = sc.nextInt();

		if (math >= 60 && eng >= 60) {
			System.out.println("합격");
		} else if (math >= 60 && eng < 60) {
			System.out.println("영어 점수 과락");
		} else if (math < 60 && eng >= 60) {
			System.out.println("수학 점수 과락");
		} else {
			System.out.println("전체 과락");
		}
		
		
		

	}

}
