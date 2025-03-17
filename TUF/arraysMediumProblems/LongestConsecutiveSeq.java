package arraysMediumProblems;

import java.util.HashSet;
import java.util.*;

public class LongestConsecutiveSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {102,4,100,101,103,104,117,3,5,2,1,0};
		int c = lon(arr);
		System.out.println(c);
	}

	
	public static int lon(int[] nums) {
		int n=nums.length;
		if(n==0)return 0;
		
        int longest=1;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++) {
        	set.add(nums[i]);
        }
      
        for(int it : set) {
        	  if(!set.contains(it-1)) {
        		  int count=1;
        		  int x=it;
        		  while(set.contains(x+1)) {
        			  x=x+1;
        			  count=count+1;
        		  }
        		  longest=Math.max(longest, count);
        	  }
        	
        }
	return longest;
}
}