package q574;

public class MaxCalcu {
	private int[] maxarr;

	//Set
	void setMaxarr(int[] maxarr) {
		this.maxarr = maxarr;
	}

	//Run
	void print() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < maxarr.length; i++) {
			max = (max < maxarr[i]) ? maxarr[i] : max;
		}
		System.out.println(max);
	}
}


