package q573;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		SquareInfo s1 = new SquareInfo(inp);
		s1.squaremake();
	}

}
