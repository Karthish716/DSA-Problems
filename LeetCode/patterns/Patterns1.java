package patterns;

import java.util.Scanner;

public class Patterns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int n = s.nextInt();
		int pt= 1;
		for(int i =1;i<=n;i++)
		{		
			for(int j=1;j<=i;j++) {
				System.out.print(i +" ");
			}
			System.out.println("");
		}
		s.close();
	}

	
}
