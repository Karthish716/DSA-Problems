package patterns;

import java.util.Scanner;

public class PatternOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(count++ + " ");
			}
			System.out.println("");
		}
		s.close();
	}

}
