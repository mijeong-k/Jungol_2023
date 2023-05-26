package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		
		//case 1
		if (str.length() <= 100) {
			for (int i = 0; i < str.length(); i++) {
				if (64 < str.charAt(i) && str.charAt(i) < 91) {
					System.out.printf("%c", str.charAt(i));
				} else if (96 < str.charAt(i) && str.charAt(i) < 123) {
					System.out.printf("%c", str.charAt(i) - 32);
				}
			}
		} else {System.out.println("문자열 길이가 100을 넘습니다.");}

		//case 2
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('A' <= c && c <= 'Z') {
				System.out.print(c);
			} else if ('a' <= c && c <= 'z') {
				System.out.print((char) (c - 32));
			}
		}
		
		//case 3
		str = str.toUpperCase();
	      String sco = "";

	      for (int i = 0; i < str.length(); i++) {
	         if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
	            sco += str.charAt(i);
	         }
	      }
	      System.out.println(sco);
	   }
	}


