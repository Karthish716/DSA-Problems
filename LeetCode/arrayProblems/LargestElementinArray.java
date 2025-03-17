package arrayProblems;

public class LargestElementinArray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LargestElementinArray l = new LargestElementinArray();
		int arr[]= {3,5,6,2,90,7,87,102,103,111,110,110,11,102,104,106,106};
		int result = l.large(arr);
	System.out.print(result);
	}

	public int large(int arr[]) {
		int max=arr[0];
		
		
		for(int i = 1;i<=arr.length-1;i++) {
			
			if(max<arr[i]) {
				
				max=arr[i];
			}
			
		}
		return max;
	}
}
