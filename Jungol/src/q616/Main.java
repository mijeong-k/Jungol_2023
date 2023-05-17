package q616;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] darr = new int[6];

		for (int i = 0, k = 1; i < darr.length && k < darr.length; i += 2, k += 2) {
			darr[i] = sc.nextInt();
			darr[k] = sc.nextInt();
		}
		sc.close();

		Point p1 = new Point(darr[0], darr[1]);
		Point p2 = new Point(darr[2], darr[3]);
		Point p3 = new Point(darr[4], darr[5]);

		double resX = ((p1.X) + (p2.X) + (p3.X)) / 3;
		double resY = ((p1.Y) + (p2.Y) + (p3.Y)) / 3;
		System.out.printf("(%.1f, %.1f)", resX, resY);

		
//		double darrX = GravityX(new double[] { p1.X, p2.X, p3.X });
//		double darrY = GravityY(new double[] { p1.Y, p2.Y, p3.Y });
//		System.out.printf("(%.1f, %.1f)", darrX, darrY);
	}

//	public static double GravityX(double[] darrXsum) {
//		double sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += darrXsum[i];
//		}
//		return sum / 3;
//	}
//
//	public static double GravityY(double[] darrYsum) {
//		double sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum += darrYsum[i];
//		}
//		return sum / 3;
//
//	}
}