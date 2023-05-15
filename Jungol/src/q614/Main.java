package q614;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
		int num = sc.nextInt();
		sc.close();
		
		//1. (필드)첫번째 데이터
		Student s1 = new Student("Jejuelementary", 6);	
		System.out.println(s1.grade + " grade in " + s1.school + " School");
		
		//2.(필드)두번째 데이터
		Student s2 = new Student();
		s2.school = str;
		s2.grade = num;		
		System.out.println(s2.grade + " grade in " + s2.school + " School");
				
	}

}
