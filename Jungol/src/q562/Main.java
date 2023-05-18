package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[10];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		sc.close();
//
//		int sumOdd = 0, sumEven = 0;
//		for (int i = 1; i < arr.length; i += 2) {
//			sumOdd += arr[i];
//			sumEven += arr[i - 1];
//		}
//		System.out.printf("sum : %d\navg : %.1f", sumOdd, (double) sumEven / 5);

		
		 int[] arr = new int[10];
	     int sum = 0, cnt=0;
	     double avg = 0.0;
		 for (int i = 0; i < arr.length; i++) {
	         arr[i] = sc.nextInt();
	         if (i % 2 != 0) {
	            sum += arr[i];
	         } else {
	            avg += arr[i];
				cnt++;
	         }
	      }sc.close();
	      System.out.println("sum : " + sum);
	      System.out.printf("avg : " + "%.1f", avg / cnt);


		
//		int sum=0;		
//		for(int k=1; k<arr.length; k+=2) {
//		sum=sum+arr[k];
//		}		
//		System.out.println("sum : "+sum);
//	
//	
//		sum=0;
//		for(int k=1; k<arr.length; k+=2) {
//		sum=sum+arr[k-1];
//		}	
//		System.out.printf("avg : %.1f", (double) sum/5);
	}

}
