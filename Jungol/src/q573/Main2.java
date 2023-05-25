package q573;

import java.util.Scanner;

public class Main2 {

	public static void squaremake(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}

	}
//		int k;
//		int cut=1;
//		      for (int j = 0; j < k; j++) {
//		         for (int i = 0; i < k; i++) {
//		            System.out.print(cut + " ");
//		            cut++;
//
//		         }
//		         System.out.println();
//		      }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		squaremake(inp);
	}

}
