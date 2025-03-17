package patterns;

import java.util.Scanner;

public class PatternSpaceStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j = 1; j<=n-i;j++) {
				
				System.out.print("r ");
				
			}
            for(int k = 1; k<=i;k++) {
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
