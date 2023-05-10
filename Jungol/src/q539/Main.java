package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int sum = 0;
//		double cnt = 0;
//		while (true) {
//			int inp = sc.nextInt();
//			sum += inp;
//			cnt++;
//			if (inp >= 100) {
//				break;
//			}
//		}
//		sc.close();
//		System.out.printf("%d\n%.1f\n", sum, (sum / cnt));
		
		
		int[] arr = new int [10];
		int arrsum=0;
		for(int i=0; i<arr.length; i++) {
			int arrinp = sc.nextInt();
			arr[i]=arrinp;
			arrsum+=arr[i];
			if(arrinp>=100) {
				break;
			}
		}sc.close();
		System.out.println(arrsum/arr.length);
	}

}




