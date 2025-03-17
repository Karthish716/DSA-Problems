package stringss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BueatySubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans= subbue("aabcb");
		System.out.print(ans);
	}
	
	
	public static int subbue(String s) {
		int sum =0;
		for(int i=0;i<s.length();i++) {
			int[] fre=new int[26];	
			for(int j = i;j<s.length();j++) {
					fre[s.charAt(j)-'a']++;
					int bet = getMax(fre)-getMin(fre);
					sum=sum+bet;	
			}
		
		}
	return sum;	
	}
	
	public static int getMin(int[] arr) {
		int mincount= Integer.MAX_VALUE;
		for(int i=0;i<26;i++) {
			if(arr[i]!=0) {
				mincount= Math.min(mincount, arr[i]);
			}
		}
		return mincount;
	}
	
	public static int getMax(int[] arr) {
		int maxcount= Integer.MIN_VALUE;
		for(int i=0;i<26;i++) {
			if(arr[i]!=0) {
				maxcount= Math.max(maxcount, arr[i]);
			}
		}
		return maxcount;
	}
}
