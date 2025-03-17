package patterns;

import java.util.ArrayList;
import java.util.List;

public class TeatInsta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();
	     for(int i=0;i<5;i++) {
	    	 l.add(i);
	    	 System.out.println(l.get(i));
	     }
	     System.out.println(l.get(2)+l.get(3));
	
	}

}
