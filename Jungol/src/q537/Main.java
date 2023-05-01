package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		//1. while,do,if
		int num1 = 0;
		int sum1 = 0;
		if (inp < 101) {
			do {
				num1++;
				sum1 += num1;
			} while (num1 != inp);	
				System.out.println(sum1);			
		} else {
			System.out.println("100이하만 출력");
		}
	}
	
		//2. while문
//		int i=0;         
//	    int hap = 0;     
//	    if(inp<=100) {
//	    while(i<inp) {           
//	       i++;
//	       hap=hap +i;
//	    }
//	    System.out.println(hap);
//	    }	
	

		// 3.for
//		int sum1 = 0;
//		for (int i = 1; i <= inp; i++) {
//			sum1 += i;
//		}
//		System.out.println(sum1);

		// 4.while
//		int sum2 = 0;
//		int i2 = 0;
//		while (i2 <= inp) {
//			sum2 += i2++;
//		}
//		System.out.println(sum2);

		// 5.do~while
//		int sum3 = 0;
//		int i3 = 0;
//		do {
//			sum3 += i3++;
//		} while (i3 <= inp);
//		System.out.println(sum3);
//
//		}

		// 6.while~if
//		int num = 0;
//		int sum = 0;
//		while (inp < 101) {
//			num++;
//			sum += num;
//	
//			if (num == inp) {
//				System.out.println(sum);
//				break;
//			}
//		}

	}




