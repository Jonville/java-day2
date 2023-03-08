package day2_project;

public class ex_1 {
	public static void main(String[] args) {
		int age = 8;
		double height = 130;
		boolean parent = true;
		boolean hearchDease = false;

		if (hearchDease == true) {
			System.out.println("!!! 심장관련 질환자 탑승 불가 !!!");

		} else {

			if (age >= 6) {
				System.out.println("6세이상 탑승 가능");

				if (height < 120) {
					System.out.println("키가 120cm 미만 이므로 탑승불가");
				}

			} else {
				System.out.print("6세 미만 탑승 불가능");
				if (height >= 120 && parent == true) {
					System.out.println("이지만 ! 키가 120cm 이상이고, 부모 동반시 탑승가능");
				}
			}

		}
	}
}
