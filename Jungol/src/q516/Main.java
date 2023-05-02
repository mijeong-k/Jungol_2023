package q516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc; 
		sc = new Scanner(System.in);
		double dinp1 = sc.nextDouble(), dinp2 = sc.nextDouble();
		char cinp = sc.next().charAt(0);
		sc.close();

		System.out.printf("%.2f\n%.2f\n%c\n", dinp1, dinp2, cinp);

	}

}
