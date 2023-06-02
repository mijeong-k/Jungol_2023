package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

//		int cnt = 1;
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == ' ') {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		
		
		//StringTokenizer
		StringTokenizer st = new StringTokenizer(str);
		int n= st.countTokens();
		System.out.println(n);
		
		//StringTokenizer 예시
		while(st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}

// 띄어쓰기 아스키코드는 32