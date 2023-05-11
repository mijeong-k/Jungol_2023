package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[] num = new int[10];
//		int cnt = 0;
//		for (int i = 0; i < num.length; i++) {
//			int inp = sc.nextInt();
//			num[i] = inp;
//			cnt++;
//			if (inp == 0) {
//				for (int j = 2; j <= cnt; j++) {
//					System.out.print(num[cnt - j] + " ");
//				}
//				break;
//			}
//		}
//		sc.close();

//		int[] ar = new int[100];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = sc.nextInt();
//			if (ar[i] == 0) {
//				for (int j = i - 1; j >= 0; j--) {
//					System.out.print(ar[j] + " ");
//				}
//				break;
//			}
//		}sc.close();
		

	
		
//		int num[] = new int[100];
//		int i = 0;
//		while (i <= 100) {
//			num[i] = sc.nextInt();
//			if (num[i] == 0) {
//				for (int j = i - 1; j >= 0; j--) {
//					System.out.printf("%d", num[j]);
//				}
//				break;
//			}
//			i++;
//		}
//		sc.close();
		
		
		 int[] ar=new int[100];
		 int input=0, idx=0;
		 do {
			 input=sc.nextInt();
			 ar[idx++] = input;
		 }while(input!=0);
		 sc.close();
		 
		 for(int i=0; i<idx; i++) {
			 System.out.print(ar[i]+" ");
		 }
		 System.out.println();
		 for(int i=idx-2; i>=0;i--) {
			 System.out.print(ar[i]+" "); 
		 }
	}
}


