package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt(), weight = sc.nextInt();
		sc.close();

		int result = weight + 100 - height;
		System.out.println(result);

//		System.out.printf("%d\n", weight+100-height);

		if (result > 0) {
			System.out.println("Obesity");
		}

	}

}
