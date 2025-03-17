package patterns;

import java.util.Scanner;

public class Pattern01s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the num : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			if(i==1) {
				System.out.print("1 ");
			}
			else if(i%2==0) {
				for(int j=1;j<=i;j++) {
					if(j%2==0) {
						System.out.print("1 ");
					}
						else {
						System.out.print("0 ");
						}
				}
			
			}
			
			else {
				for(int j=1;j<=i;j++) {
					if(j%2==0)
					{
						System.out.print("0 ");
					}
						else
						{
						System.out.print("1 ");
						}
					}
				
			}
				System.out.println("");
			}
			
			
			s.close();
		}
		
	}


