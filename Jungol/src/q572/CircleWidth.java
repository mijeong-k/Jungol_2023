package q572;

public class CircleWidth {
	int r;

	CircleWidth() {
		r = 0;
	}

	void setRadius(int r) {
		this.r = r;
	}
	
	double getWidth() {
		return r * r * 3.14;
	}

	void printWidth() {
		System.out.printf("%.2f", getWidth());
	}
	
	
//	double width(double pie) {
//	double result = num * num * pie;
//	return result;
//}
	
//	void printWidth() {
//		System.out.printf("%.2f", width(3.14));
//	}
	


}
