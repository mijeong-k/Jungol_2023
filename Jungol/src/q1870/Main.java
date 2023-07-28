package q1870;

import java.util.Scanner;

public class Main {
	private int inp1;
	private int inp2;
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp1 = sc.nextInt();
		int inp2 = sc.nextInt();
		int n = 0;
		int num[][] = new int[inp1][inp2];
		System.out.println();
		for (int i = 0; i < inp1; i++) {
			for (int k = 0; k < inp2; k++) {
				num[i][k] = sc.nextInt();
				System.out.print(num[i][k]);
			}
			System.out.println();
		}
		sc.close();
	}
}



