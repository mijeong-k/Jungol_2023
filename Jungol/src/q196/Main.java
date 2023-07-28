package q196;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s1 = new String[3];
		String[] s2 = new String[3];
		String[] s3 = new String[3];

		for (int i = 0; i < s1.length; i++) {
			s1[i] = sc.next();
		}
		for (int i = 0; i < s2.length; i++) {
			s2[i] = sc.next();
		}
		for (int i = 0; i < s3.length; i++) {
			s3[i] = sc.next();
		}
		sc.close();

		PeopleInfo p1 = new PeopleInfo(s1[0], s1[1], s1[2]);
		PeopleInfo p2 = new PeopleInfo(s2[0], s2[1], s2[2]);
		PeopleInfo p3 = new PeopleInfo(s3[0], s3[1], s3[2]);
		
//		PeopleInfo[] people = new PeopleInfo[3];
//		people[0] = p1;
//		people[1] = p2;
//		people[2] = p3;

		if (p1.getFirstName() < p2.getFirstName() && p1.getFirstName() < p3.getFirstName()) {
			p1.print();
		} else if (p2.getFirstName() < p1.getFirstName() && p2.getFirstName() < p3.getFirstName()) {
			p2.print();
		} else {
			p3.print();
		}
	}
}
