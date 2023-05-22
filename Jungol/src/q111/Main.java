package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int sum=0;
		
		
		//case 1
		for(int i=0; i<4; i++) {
			int inp=sc.nextInt();
			sum=sum+inp;
		}
		
		//case 2
//		int[] score=new int[4];
//		for(int i=0; i<score.length; i++) {
//			score[i]=sc.nextInt();
//			sum=sum+score[i];
//		}
		sc.close();
		
		
		System.out.println("sum " + (sum));
		System.out.println("avg " + (sum / 4));

	}

}
