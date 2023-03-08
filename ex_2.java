package day2_project;

public class ex_2 {
	public static void main(String[] args) {

		int year = 2020;

		boolean leapYear = true;

		if ((year % 4) == 0 && !((year % 100) == 0) || (year % 400) == 0) {
			System.out.println(leapYear);

		} else {
			System.out.println(!leapYear);
		}
	}

}
