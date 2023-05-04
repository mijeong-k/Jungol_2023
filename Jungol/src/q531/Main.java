package q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dweight= sc.nextDouble();
		sc.close();

		if (dweight > 88.45) {
			System.out.println("Heavyweight");
		} else if (dweight <= 50.80) {
			System.out.println("Flyweight");
		} else if (dweight <= 61.23) {
			System.out.println("Lightweight");
		} else if (dweight <= 72.57) {
			System.out.println("Middleweight");
		} else if (dweight <= 88.45) {
			System.out.println("Cruiserweight");
		}

	}
}

//		88.45 초과는 if로 조건달지 않고, 마지막 else로 풀어도됨.



