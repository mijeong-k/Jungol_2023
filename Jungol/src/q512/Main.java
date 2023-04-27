package q512;

public class Main {

	public static void main(String[] args) {
		int iWeight = 49;
		double dRatio = 0.2683;		
		
		System.out.printf("%d * %f = %f\n", iWeight, dRatio, iWeight*dRatio);
		
		
		int x = 49;
		double y = 0.2683;	

//		System.out.printf("%s%f\n", "49 * 0.268300 = ", x*y);
//		System.out.printf("%s%.6f", "49 * 0.268300 = ", x*y);		
//		System.out.print(x + " * " +y+ " = "+(x*y));				
		System.out.print(x + " * ");
		System.out.printf("%f = %f\n", y, (x*y));
		
		
//		float fRatio = 0.2683f;
//		자바에서는 소수점(실수)은 기본적으로 double 타입으로 인식
		
		
	}

}
