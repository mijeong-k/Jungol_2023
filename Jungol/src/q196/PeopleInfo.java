package q196;

public class PeopleInfo {
	private String name;
	private String tel;
	private String addr;

	PeopleInfo(String name, String tel, String addr) {
		setName(name);
		setTel(tel);
		setAddr(addr);
	}

	// Set
	public void setName(String name) {
		if (name.length() <= 15) {
			this.name = name;
		}
	}

	public void setTel(String tel) {
		if (tel.length() <= 15) {
			this.tel = tel;
		}
	}

	public void setAddr(String addr) {
		if (addr.length() <= 15) {
			this.addr = addr;
		}
	}

	// Get
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAdrr() {
		return addr;
	}

	public char getFirstName() {
		return name.charAt(0);
	}

	// Run
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
	}

}
