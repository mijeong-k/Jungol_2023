package q575;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		Num calcuration = new Num(n1, n2);
		
		calcuration.calcu();
	}

}
