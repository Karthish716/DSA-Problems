package stackdsa;

import java.util.ArrayList;

public class DemoStacksKDig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	   /* RemoveKDigiti d = new RemoveKDigiti();
		String s = "10";
		String g = d.removekdig(s, 1);
		System.out.println(g);
		*/
		int[] arr = {1,3,-1,-3,5,3,2,1,6};
		int[] arr3 = {1};
		
		MaximumOfSlidingWindow ms = new MaximumOfSlidingWindow();
		
		 
		  int[] arr2 =  ms.sliding2(arr3, 1);
		  for(int i : arr2) {
			  System.out.print(i+" ");
		  }
	}

}


