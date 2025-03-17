package arrayProblems2;
import java.util.*;
public class DemoplargrNumsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	   LargeSortingNum ss = new LargeSortingNum();
		int[] arr = {3,30,34,5,9};
		//String s = ss.larges(arr);
		
	   TreeSet<Integer> s = new TreeSet<Integer>();
		
		s.add(34);
		s.add(34);
		s.add(89);
		s.add(12);
		s.add(12);
		
		for(int v : s) {
			System.out.println(v);
		}
		
		
	}

}
