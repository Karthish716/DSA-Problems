package arrayProblems2;

import java.util.ArrayList;
import java.util.*;

public class LargeSortingNum {

	
	
	
	
	public String larges(int[] nums) {
		
		ArrayList<Integer> ls = new ArrayList<Integer>();
		
		for(int i=0;i< nums.length; i++) {
		
			int sn = nums[i];
			
			if(sn==0){
				ls.add(sn);
			}else {
			while(sn!=0) {
			int res = sn%10;
			ls.add(res);
			sn = sn/10;
			}
			}
			
		}
		Collections.sort(ls);
         Collections.sort(ls, Collections.reverseOrder());
         String ds ="";
        for(int i = 0; i <ls.size();i++) { 
        	ds= ds+ ls.get(i);
        }
         
         return ds;
		}
		
	}

