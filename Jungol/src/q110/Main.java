package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("yard? ");
		Scanner sc = new Scanner(System.in);
		double dy = sc.nextDouble();
		sc.close();

		double dcm = 91.44;
		System.out.printf("%.1f%s = %.1fcm", dy, "yard", dy * dcm);

	}

}
