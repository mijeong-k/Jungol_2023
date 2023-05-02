package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cha = new char[10];

		for (int i = 0; i < cha.length; i++) {
			cha[i] = sc.next().charAt(0);
			System.out.printf("%c", cha[i]);
		}
		sc.close();
	}

}

