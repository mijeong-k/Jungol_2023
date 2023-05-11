package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cinp = sc.next().charAt(0);
		String str = sc.next();
		sc.close();

		//1. switch-char 문
		switch (cinp) {
		case 65:
			System.out.println("Excellent");
			break;
		case 66:
			System.out.println("Good");
			break;
		case 67:
			System.out.println("Usually");
			break;
		case 68:
			System.out.println("Effort");
			break;
		case 70:
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
		}

		//2. if문
		if (cinp == 'A') {
			System.out.println("Excellent");
		} else if (cinp == 'B') {
			System.out.println("Good");
		} else if (cinp == 'C') {
			System.out.println("Usually");
		} else if (cinp == 'D') {
			System.out.println("Effort");
		} else if (cinp == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
		
		//3. switch-string문
		switch (str) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Good");
			break;
		case "C":
			System.out.println("Usually");
			break;
		case "D":
			System.out.println("Effort");
			break;
		case "F":
			System.out.println("Failure");
			break;
		default:
			System.out.println("error");
		}
		
		
	}
}
