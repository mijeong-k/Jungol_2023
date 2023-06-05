package q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();

		int min1 = (n1 < n2) ? n1 : n2;
		int min2 = (min1 < n3) ? min1 : n3;

		int res = (n1 < n2) ? (n1 < n3 ? n1 : n3) : (n2 < n3 ? n2 : n3);

		System.out.println(min2);
		System.out.println(res);
		
		
		//case2
//		int[] inp = new int[3];
//		for(int i=0; i<inp.length; i++) {
//			inp[i]=sc.nextInt();
//		}sc.close();
//		
//		int min = Integer.MAX_VALUE;
//		for(int i=0; i<inp.length; i++) {
//			if(inp[i]<min) {
//				min=inp[i];
//			}
//		}System.out.println(min);
	}

}
