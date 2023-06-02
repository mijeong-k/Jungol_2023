package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		String inp2 = inp + inp; // 한바퀴 도는거라 한번 +

		// case1
		for (int i = inp.length() - 1; i >= 0; i--) {
			System.out.println(inp2.substring(i, i + inp.length()));
		}

		// case2
		for (int i = inp.length() - 1; i >= 0; i--) {
			for (int j = i; j < inp.length(); j++) {
				System.out.print(inp.charAt(j));
			}
			for (int j = 0; j <= i - 1; j++) {
				System.out.print(inp.charAt(j));
			}
			System.out.println();
		}
	}

}
