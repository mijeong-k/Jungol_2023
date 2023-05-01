package p530;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		sc.close();

		int cal = 20 - age;
		String str = "adult";
		if (age >= 20) {
			System.out.println(str);
		} else {
			str = " years later";
			System.out.printf("%d%s\n", cal, str);
		}
	}

}
