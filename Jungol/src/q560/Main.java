package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}	
		sc.close();
		
		int min=1000;
//		int min=Integer.MAX_VALUE;
		for(int i=0; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		
		System.out.println(min);
		
//		int min = num[0];		
//		for (int i = 1; i < num.length; i++) {
//			min=min<num[i]?min:num[i];
//		}
		
		
//		for (int i = 1; i < num.length; i++) {
//		if (min > num[i]) {
//			min = num[i];
//		}
//	}
		
		
//		int min=num[0];
//		min = min < num[1] ? min : num[1];
//		min = min < num[2] ? min : num[2];
//		min = min < num[3] ? min : num[3];	

		
	}

}
