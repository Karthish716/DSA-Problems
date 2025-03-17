package slidingWindowTP;

import java.util.HashMap;

public class LargestSubstringNonRepeating {

	
		
	 public int longestOnes(int[] nums, int k) {
	        int left = 0, maxLength = 0, zeroCount = 0;
	        for (int right = 0; right < nums.length; ++right) {
	            if (nums[right] == 0) {
	                zeroCount++;
	            }
	            while (zeroCount > k) {
	                if (nums[left] == 0) {
	                    zeroCount--;
	                }
	                left++;
	            }
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	        return maxLength;
	    }
	 
	 
	 
	 public int strStr(String haystack, String needle) {
	        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
	        	System.out.println(haystack.substring(i,j));
	            if(haystack.substring(i,j).equals(needle)){
	                return i;
	            }
	        }
	        return -1;
	    }
	 
	 
	 
}



