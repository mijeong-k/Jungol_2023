package q617;

public class People {
	private String[] name;
	private int[] height;
	
	void setName(String[] name) {
		this.name = name;
	}

	void setHeight(int[] height) {
		this.height = height;
	}

	void print() {
		int min = Integer.MAX_VALUE;
		int cnt = 0;
		for (int i = 0; i < height.length; i++) {
			min = (height[i] < min) ? height[i] : min;
			if (min == height[i]) {
				cnt = i;
			}
		}

		System.out.println(name[cnt] + " " + min);
	}
}
