package q195;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addres = sc.next();
		sc.close();

		Contact person = new Contact();
		
		person.setName(name);
		person.setTel(tel);
		person.setAddress(addres);
		
//		System.out.println("name : "+person.getName());
//		System.out.println("tel : "+person.getTel());
//		System.out.println("addr : "+person.getAddress());
		
		person.print();
	}

}
