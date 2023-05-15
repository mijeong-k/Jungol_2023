package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		// 첫번째 데이터
		String n = sc.next();
		String s = sc.next();
		int g = sc.nextInt();
		MainDestination info1 = new MainDestination(n, s, g);
		System.out.println("Name : " + info1.NAME);
		System.out.println("School : " + info1.SCHOOL);
		System.out.println("Grade : " + info1.GRADE);


		// 두번째 데이터
		MainDestination info2 = new MainDestination();

		n = sc.next();
		s = sc.next();
		g = sc.nextInt();
		sc.close();
//		MainDestination info2 = new MainDestination(n,s,g);
		
		info2.NAME = n;
		info2.SCHOOL = s;
		info2.GRADE = g;

		System.out.println("Name : " + info2.NAME);
		System.out.println("School : " + info2.SCHOOL);
		System.out.println("Grade : " + info2.GRADE);
		

	}

}
