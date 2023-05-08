package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		sc.close();

		int result = inp1++ * --inp2;
		System.out.printf("%d %d %d", inp1, inp2, result);

	}

}