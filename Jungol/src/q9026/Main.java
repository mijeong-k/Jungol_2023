package q9026;

public class Main {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 2;

		System.out.print(((a * b == a) ? 1 : 0) + " ");
		System.out.print(((a * c == a) ? 1 : 0) + " ");
		System.out.print(((b * c == a) ? 1 : 0) + " ");
		System.out.println((a * b * c == a) ? 1 : 0);
	}

}
