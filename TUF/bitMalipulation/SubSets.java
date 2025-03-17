package bitMalipulation;

import java.util.ArrayList;
import java.util.*;

public class SubSets {

//123
	
public ArrayList<ArrayList<Integer>> subsets(int[] nums){
	
        
	ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	 
	 
	for(int i=1;i<=nums.length;i++) { 
		for(int j=1;j<=nums.length;j++) {
			ArrayList<Integer> arr2 =new ArrayList<Integer>();
			for(int k=j;k<=i;k++) {
				arr2.add(k);
			}
			arr.add(arr2);
		}
	}
	
	return arr;
}



public List<List<Integer>> subsets2(int[] nums){
 
	 List<List<Integer>> subsets = new ArrayList<>();
     int n = nums.length;
     int noOfSubsets = 1 << n; // Total subsets = 2^n

     // Iterate over all binary numbers from 0 to 2^n - 1
     for (int i = 0; i < noOfSubsets; i++) {
         List<Integer> subset = new ArrayList<>();
         // Check each bit of 'i' to decide whether to include arr[j]
         for (int j = 0; j < n; j++) {
             if ((i & (1 << j)) != 0) {
                 subset.add(nums[j]); // Include arr[j] in the subset
             }
         }
         subsets.add(subset); // Add the generated subset to the list of subsets
     }

     return subsets;
     
     
     
	  }



}
