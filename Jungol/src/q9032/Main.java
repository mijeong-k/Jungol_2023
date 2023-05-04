package q9032;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		if (inp >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println("나는 \"자바\"를 좋아합니다.");

	}

}
