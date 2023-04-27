package q513;

public class Main {

	public static void main(String[] args) {
		double yd = 91.44, in = 2.54, ydput = 2.1, input = 10.5;
			
		System.out.printf("%4.1fyd = %5.1fcm\n", ydput, yd*ydput);
		System.out.printf("%4.1fin = %5.1fcm\n", input, in*input);
		
	}

}


//System.out.printf("%.1fyd = %.1fcm\n", 2.1, yd*2.1);
//System.out.printf("%.1fin = %.1fcm\n", 10.5, in*10.5);