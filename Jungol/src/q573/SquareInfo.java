package q573;

public class SquareInfo {
	private int num;

	SquareInfo(int num) {
		setNum(num);
	}

	//Set
	public void setNum(int num) {
		if (num < 100) {
			this.num = num;
		} else {
			System.out.print("100미만의 정수만 입력하세요.");
		}
	}

	//get
	public int getNum() {
		return num;
	}

	//Run
	public void squaremake() {
		for (int i = 1; i <= getNum() * getNum(); i++) {
			System.out.print(i + " ");
			if (i % getNum() == 0) {
				System.out.println();
			}
		}
	}
	
}

