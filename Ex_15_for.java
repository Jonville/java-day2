package day2_project;

public class Ex_15_for {

	public static void main(String[] args) {

		int oddSum = 0;

		int evenSum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}

		}
		System.out.println("홀수의 합은 : " + oddSum);
		System.out.println("짝수의 합은 : " + evenSum);

	}
}
