package arrayProblems;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuplicateElement a = new DuplicateElement();
		int arr[]= {3,4,4,4,5,7,7,8,9,9,9};
		int rs = a.dup(arr);
		System.out.print(rs);
	}

	
	public int dup(int arr[]) {
		
	    
		int i = 0;
		
		for(int z=1;z<arr.length;z++) {
			if(arr[i]<arr[z]) {
				arr[i+1]=arr[z];
				i++;
			}
		}
		return i+1;
	}
}
