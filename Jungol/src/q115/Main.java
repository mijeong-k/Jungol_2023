package q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mh = sc.nextInt();
		int mw = sc.nextInt();
		int kh = sc.nextInt();
		int kw = sc.nextInt();
		sc.close();

		if (mh > kh && mw > kw) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
