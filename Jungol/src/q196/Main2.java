package q196;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[3];
		
		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			p[i] = new Person(name, tel, addr);
		}
		sc.close();

		
		Arrays.sort(p);
		 for (int i = 0; i < p.length; i++) {
	         p[i].print();
	      }

	}

}
