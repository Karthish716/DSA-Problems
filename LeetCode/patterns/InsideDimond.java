package patterns;

import java.util.Scanner;

public class InsideDimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N : ");
		int n= s.nextInt();
		
		for(int i=1;i<=n*2;i++) {
			
			int rc = i>n? (n*2)-(i-1) : i;
			
			for(int j = 1;j<=n*2;j++) {
				
				if(j<=n-rc+1 || j>n+rc-1) {
					System.out.print("*");				
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		s.close();
	}

}
