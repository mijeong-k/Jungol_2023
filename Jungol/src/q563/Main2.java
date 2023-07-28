package q563;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int j=0; j<arr.length; j++) {
		int max=Integer.MIN_VALUE;
		int idx=0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				idx=i;
			}
		}System.out.print(max + " : ");
		arr[idx]=-1;
		
//		for(int k=0; k<arr.length; k++) {
//			System.out.print(arr[k]+" ");
//		}
		System.out.println();
		}
		
		
	}

}
