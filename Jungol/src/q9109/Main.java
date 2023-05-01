package q9109;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.string
//		String str = sc.nextLine();
//		sc.close();
//
//		System.out.println(str);

		
		// 2. char-1
		String str1 = "";
		while (true) {
//			char = sc.next().charAt(0); 아래 두줄과 같은 말
			String inp = sc.next();
			char c = inp.charAt(0);

			if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
				str1 += c;
			} else {
				break;
			}
		}
		System.out.println(str1);

		
		// 2. char-2
		String str2 = "";
		while (true) {
			String inp = sc.next();
			char c = inp.charAt(0);

			if (Character.isAlphabetic(c)) {
				str2 += c;
			} else {
				break;
			}
		}
		System.out.println(str2);
		sc.close();
	}	

}
