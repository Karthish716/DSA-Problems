package arrayProblems;

import java.util.ArrayList;
import java.util.List;

public class UnionofTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {1,1,3,3,8,9};
		int[] arr2= {5,6,6,7,9,10,10,11};
		UnionofTwoArray u = new UnionofTwoArray();
		List<Integer> j = u.UnionArr(arr1, arr2);
		for(int f : j) {
			System.out.print(f+" ");
		}
	}
	
	public List<Integer> UnionArr(int[] arr1,int[] arr2) {
		//int[] arr3 = new int[arr1.length+arr2.length];
		List<Integer> arr3 = new ArrayList<>();
		int i=0;
		int z=0;
		int k=0;
		while(i<arr1.length & z<arr2.length) {
			
			if(arr1[i]<=arr2[z]) {
				if(k==0) {
					arr3.add(arr1[i]);
					k++;
				}
				if(arr3.get(k-1)!=arr1[i]) {
				arr3.add(arr1[i]);
				k++;
				}
				i++;
			}	
				
	        	else {
	        		if(k==0) {
	        			arr3.add(arr2[z]);
						k++;
					}
					if(arr3.get(k-1)!=arr2[z]) {
						arr3.add(arr2[z]);
						k++;
					}
					z++;	  
			}
		
			}
		
		while(i<arr1.length) {
			if(arr3.get(k-1)!=arr1[i]) {
				arr3.add(arr1[i]);
			k++;
			}
			i++;
		}
		
		while(z<arr2.length) {
			if(arr3.get(k-1)!=arr2[z]) {
				arr3.add(arr2[z]);
			    k++;
			}
			z++;
		}		
		
		return arr3;
	}	
	
}
