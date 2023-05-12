package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//1.
		while (true) {
			int num = sc.nextInt();
			if (num % 3 == 0) {
				System.out.println(num / 3);
			} else if (num == -1) {
				break;
			}
		}
		sc.close();
		
		
		//2.
		int num;

	      do {
	         num = sc.nextInt();
	         if (num % 3 == 0)
	            System.out.println(num / 3);
	      } while (num != -1);

	      sc.close();
	}

}

