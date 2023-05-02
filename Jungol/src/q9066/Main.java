package q9066;

public class Main {

	public static void main(String[] args) {
//		char cha[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//		for(int i=25;i>=0;i--) {
//			System.out.print(cha[i]+" ");
//		}

		char cha[] = new char[26];		
		for(int i=25; i>=0; i--) {
			cha[i] = (char) ((char) i+65);
			System.out.print(cha[i]+" ");
		}
	}

}
