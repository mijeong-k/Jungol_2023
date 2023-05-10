package q1291;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0, e = 0;
		while (true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if (2 <= s && s <= 9 && 2 <= e && e <= 9) {
				if (s >= e) {
					for (int i = s; i >= e; i--) {
						for (int m = 1; m <= 9; m++) {
							System.out.printf("%d * %d = %2d\n", i, m, (i * m));
						}
					}break;

				} else{
					for (; s <= e; s++) {
						for (int m = 1; m <= 9; m++) {
							System.out.printf("%d * %d = %2d\n", s, m, (s * m));
						}
					}break;

				}
			} else {
				System.out.println("INPUT ERROR!");
			}
		}sc.close();

	}
}

//for(; s>=e; s--) 
//break가 있어야 하고, sc.close도 있어야 함.