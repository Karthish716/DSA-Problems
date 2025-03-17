package stackdsa;

import java.util.ArrayList;
import java.util.List;

public class MaximumOfSlidingWindow {

	
	
	public int[] sliding(int[] arr ,int k){
	    
		ArrayList<Integer> ls = new ArrayList<Integer>();
		for(int i =0 ; i<=arr.length-k;i++) {
			int temp=Integer.MIN_VALUE;
			for(int j =i ;j<=i+k-1;j++) {
				if(temp<arr[j]) {
					temp=arr[j];
				}
			}
			ls.add(temp);
		}
	  int [] arrs = new int[ls.size()];
	      for(int i = 0;i<arrs.length;i++) {
	    	  arrs[i]=ls.get(i);
	      }
	     
	   
		return arrs;
	}
	
	
public int[] sliding2(int[] arr ,int k){
	    
	int n = arr.length<2?1 : arr.length-k+1;
	int[] arr1 =new int[n];
		for(int i =0 ; i<=arr.length-k;i++) {
			int maxi=arr[i];
			for(int j =i ;j<=i+k-1;j++) {
				maxi= Math.max(maxi, arr[j]);
			}
		   arr1[i]=maxi;
		}
	 /* int [] arrs = new int[ls.size()];
	      for(int i = 0;i<arrs.length;i++) {
	    	  arrs[i]=ls.get(i);
	      }
	     
	   */
		return arr1;
	}
	
	
	/*
	 class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length-k+1];
        int i=0,j=0;
        Deque<Integer> deque = new ArrayDeque<>();
        while(j<nums.length){
          while(deque.size()>0 && deque.peekLast()<nums[j]) deque.removeLast();
          deque.add(nums[j]);
            if(j-i+1 == k){
                ans[i] = deque.peekFirst();
                if(deque.peekFirst() == nums[i]) deque.removeFirst();
                i++;
                j++;
            }else{
                j++;
            }
        }
        return ans;
    }
}
	 */
}
