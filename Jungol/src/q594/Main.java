package q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		if(str.length()<=100) {
			for(int i=0;i<2;i++) {
				System.out.print(str);
				}		
		}


	}

}
