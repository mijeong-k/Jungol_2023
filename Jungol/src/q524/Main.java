package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();


		boolean c3 = num1 != 0;
		boolean c4 = num2 != 0;
//		boolean c5 = num1+num2 !=0;
//		boolean c6 = num1*num2 !=0;
		
//		System.out.print((num1*num2 != 0)+" ");
//		System.out.println(num1+num2 != 0);
		
		
//		int c1 = (num1 != 0)? 1:0;
//		int c2 = (num2 != 0)? 1:0;
//		System.out.print((c1*c2 != 0)+" ");
//		System.out.println(c1+c2 != 0);
		
		System.out.print((c3 && c4)+" "+(c3 || c4));

	}

}
