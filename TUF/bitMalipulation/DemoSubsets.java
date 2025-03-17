package bitMalipulation;

import java.util.ArrayList;
import java.util.List;

import slidingWindowTP.LargestSubstringNonRepeating;

public class DemoSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	SubSets s = new SubSets();
		int[] arrs = {1,2,3};
		List<List<Integer>> st = s.subsets2(arrs);
		
		for(int i=0;i<st.size();i++) {
		  for(int j = 0; j<st.get(i).size();j++) {
			  System.out.print(st.get(i).get(j)+" ");
		  }
		  System.out.println();
		}
	
	*/
		String haystack = "sadbutsad";
		String needle = "sad";
		LargestSubstringNonRepeating ls = new LargestSubstringNonRepeating();
		int s =ls.strStr(haystack,needle);
		System.out.print(s);
	}

}
