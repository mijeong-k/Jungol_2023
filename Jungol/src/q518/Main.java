package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int inp1 = sc.nextInt();
//		int inp2 = sc.nextInt();
//		int inp3 = sc.nextInt();
//		sc.close();
//
//		int result = inp1 + inp2 + inp3;
//		System.out.println("sum : " + result);
//		System.out.println("avg : " + (result / 3));

		int cnt = 0;
		int sum = 0;
		while (cnt<3) {
			int inp4 = sc.nextInt();
			sum += inp4;			
			cnt++;
		}
		System.out.println("sum : "+sum);
		System.out.println("avg : " + (sum / cnt));
		sc.close();
		
//		int[] num = new int[3];
//		int sum=0;
//		int cnt=0;
//		for(int i=0;i<num.length;i++) {
//			num[i]=sc.nextInt();
//			sum+=num[i];	
//			cnt++;
//		}
//		System.out.println("sum : "+sum);
//		System.out.println("avg : "+(sum/cnt));
//		sc.close();
		
	}

}
