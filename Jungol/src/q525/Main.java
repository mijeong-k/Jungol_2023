package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		if (n1 > n2 && n1 > n3) {
			System.out.print(true + " ");
		} else if (n1 <= n2 || n1 <= n3) {
			System.out.print(false + " ");
		}

		if (n1 == n2 && n2 == n3 && n1 == n3) {
			System.out.println(true);
		} else if (n1 != n2 || n2 != n3 || n1 != n3) {
			System.out.println(false);
		}

//		System.out.print((n1>n2 && n1>n3)+" ");
//		System.out.println(n1 == n2 && n2 == n3);
	}

}
