package q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dinp = sc.nextDouble();
		sc.close();

		if (0 <= dinp && dinp <= 4.5) {
			switch ((int) dinp) {
			case 2:
				System.out.println("seasonal semester");
				break;
			case 3:
				System.out.println("next semester");
				break;
			case 4:
				System.out.println("scholarship");
				break;
			default:
				System.out.println("retake");
			}
		}
	}

}
