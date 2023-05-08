package q519;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) /*throws IOException*/ {
		
		
		
		//1.Scanner 사용
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		num1 += 100;
		num2 %= 10;

		System.out.println(num1 + " " + num2);
		
		
		//2.BufferedReader 사용
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		String str1 = st.nextToken();
//		String str2 = st.nextToken();
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(st.nextToken());
		
		
		
	}

}
