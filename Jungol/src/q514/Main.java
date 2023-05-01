package q514;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "height = ";
		System.out.print(s1);

		int inp = sc.nextInt();
		sc.close();

		s1 = "Your height is ";
		String s2 = "cm.";
		System.out.printf("%s%d%s\n", s1, inp, s2);

	}

}
