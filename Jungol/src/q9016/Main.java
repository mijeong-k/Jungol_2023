package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("키를 입력하세요. ");
		int height = sc.nextInt();

		System.out.print("몸무게를 입력하세요. ");
		double weight = sc.nextDouble();

		System.out.print("이름을 입력하세요. ");
		char fname = sc.next().charAt(0);
//		String fname1 = sc.next();		
//		String fname2 = sc.nextLine();

		sc.close();

		System.out.println("키 = " + height);
		System.out.printf("몸무게 = %.1f\n", weight);
		System.out.println("이름 = " + fname);
//		System.out.printf("이름 = %s\n", fname1);		
//		System.out.printf("이름 = %s\n", fname2);

	}

}
