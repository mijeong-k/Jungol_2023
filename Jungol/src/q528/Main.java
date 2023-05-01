package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		System.out.println(num);

		if (num < 0) {
			System.out.println("minus");
		}
		

	}
}

//		char c = sc.next().charAt(0);  문자 타입쓰는 법

