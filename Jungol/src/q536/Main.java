package q536;

public class Main {

	public static void main(String[] args) {

		//1. while문
		int n1 = 1;
		while (n1 <= 15) {
			System.out.print(n1++ + " ");
		}
		System.out.println();
		
		//2. for배열문
		int[] scores = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int n2:scores) {
			System.out.print(n2++ +" ");
		}
		System.out.println();		
		
		
		//3. for문
		for(int i = 1; i < 16; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println();		
		
		
		//3. for문 마지막 ? 없애기
		for(int i = 1; i < 16; i++) {
			System.out.print(i);
			if(i<15) {
			System.out.print("?");
			}
		}
		System.out.println();			
		
		
		//3. for문 마지막 ? 없애기2
		int sum = 1;

	    while (sum <= 15) {
	         System.out.print(sum + "?");
	         sum++;
	         if (sum == 15) {
	            System.out.print(sum);
	            break;
	         }
	 	System.out.println();		
		
		
		//4. do while문
		int n3 = 1;
		do {
			System.out.printf("%d ", n3++);
		}while(n3<16);
		System.out.println();	
		
	
		
		//5. while, break문
		int n4 =1;
		while (true) {
			System.out.print(n4+" ");
			
			if(n4==15)
				break;			
				
			n4+=1;
			
		}
		System.out.println();			
		
		
		//6. while, continue문
		int i=1;
		while (i<16) {
			System.out.print(i+" ");
			i++;
			if(i>=1)
			continue;			
		}
		


			
		}

		
	}
}

	
	
	

