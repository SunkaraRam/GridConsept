package multiplE;

import java.util.Scanner;

public class Raghu2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[1];
		
		System.out.println("Enter Values : ");
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();		
		
		}
		
		for (int ch:a) {
			
			System.out.println("Entered Values : " +ch);
			
			int rem;
			
			int res=0;
			
			while (ch!=0) {

				 rem = ch%10;
				 
				 if (rem%2!=0) {
				
					 System.out.println(ch + "It is Not divisible by 2");
					 
					 break;
					 
				}
				 else if (rem%2==0) {
					 
					 System.out.println(ch + "It is divisible by 2");
					
					 break;
					
				}
				 
				
			}
			
		}
		
	}
	
}
		
	
				
				
				 
//				// System.out.println(rem);
//			
//				 if (rem%2==0) {
//				
//					 System.out.println("rem " + rem);
//					 System.out.println(ch + "It is Divisible by : 2");
//					 break;
//					
//				}
				 
					
			
			
			
//			}
//			int res1=0;
//			while (ch>=0) {
//				
//				int rem1 = res%10;
//				
//				res1 = res1+rem1;
//				
//			}
//			
//			if (res1%3==0) {
//				
//				System.out.println("It is divisible by 3");
//
//				break;
//				
//			}