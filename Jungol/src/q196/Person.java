package q196;

public class Person implements Comparable{
	private String name;
	private String tel;
	private String addr;
	
	public Person(String name, String tel, String addr){
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}
	
	public char getFirstName() {
		return name.charAt(0);
	}
	
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		if(this.getFirstName() < p.getFirstName() ) {
			return -1;
		}else if(this.getFirstName() == p.getFirstName()) {
			return 0;
		}else {
			return 1;
		}
	}
}
