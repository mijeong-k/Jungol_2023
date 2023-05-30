package q575;

public class Num {
	private int num;
	private int numcalcu;

	Num(int num, int numcalcu) {
		this.num = num;
		this.numcalcu = numcalcu;
	}

//	public void calcu() {
//		if (numcalcu == 0) {
//			System.out.println(1);
//		} else {
//			int[] result = new int[numcalcu];
//			result[0] = num;
//			for (int i = 1; i < numcalcu; i++) {
//				result[i] = result[i - 1] * num;
//			}
//			System.out.println(result[numcalcu - 1]);
//		}
//	}
	
	public void calcu() {
		double res = 0;
		res = Math.pow(num, numcalcu);
		System.out.println((int) res);
	}

}
