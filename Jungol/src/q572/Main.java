package q572;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		sc.close();
		
		CircleWidth cw = new CircleWidth();
		
		cw.setRadius(r);
		cw.printWidth();

	}

}
