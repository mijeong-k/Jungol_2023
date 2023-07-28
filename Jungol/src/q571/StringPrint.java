package q571;

public class StringPrint {
	String str;
	int num;

	StringPrint(){
		str = "~!@#$^&*()_+|";
		num = 0;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	void printStr() {
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
}
