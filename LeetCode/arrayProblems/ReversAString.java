package arrayProblems;

public class ReversAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char arr[]= {'H','e','l','l','o'};
		ReversAString r = new ReversAString();
	   r.Reversestr(arr);
	    for(int i=0;i<arr.length;i++) {
	    	System.out.print(arr[i]);
	    }
	}

	
	public char[] Reversestr(char arr[]) {
		
	
		   
			int st =0;
			int l=arr.length-1;
			while(l>st) {
				char tem = arr[st];
				arr[st]=arr[l];
				arr[l]=tem;
			 st++;
			 l--;
				}
	      return arr;
	}
}
