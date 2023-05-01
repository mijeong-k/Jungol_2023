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
		for(int n3 = 1; n3 < 16; n3++) {
			System.out.printf("%d ", n3);
		}
		System.out.println();		
		
		
		//4. for문 마지막 공백 없애기
		for(int n4 = 1; n4 < 16; n4++) {
			System.out.print(n4);
			if(n4<15) {
			System.out.print(" ");
			}
		}
		System.out.println();			
		
		
		//5. for문 마지막 공백 없애기
		int n5 = 1;

	    while (n5 <= 15) {
	         System.out.print(n5 + " ");
	         n5++;
	         if (n5 == 15) {
	            System.out.print(n5);
	            break;
	         }
	    }
	 	System.out.println();		
		
		
		//6. do while문
		int n6 = 1;
		do {
			System.out.printf("%d ", n6++);
		}while(n6<16);
		System.out.println();	
		
	
		
		//7. while, break문
		int n7 =1;
		while (true) {
			System.out.print(n7+" ");
			
			if(n7==15)
				break;			
				
			n7+=1;
			
		}
		System.out.println();			
		
		
		//8. while, continue문
		int n8=1;
		while (n8<16) {
			System.out.print(n8+" ");
			n8++;
			if(n8>=1)
			continue;			
		}
		


			
		}

		
	}


	
	
	

