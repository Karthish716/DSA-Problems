package arrayProblems;

public class SecondLargestelarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SecondLargestelarray sl = new SecondLargestelarray();
		int arr[]= {3,5,6,2,90,7,87,102,103,111,110,110,11,102,104,106,106};
		int result = sl.slarge(arr);
	System.out.print(result);
	}
	
	public int slarge(int arr[]) {
		int f=arr[0];
		int s = -1;
		for(int i=1;i<=arr.length-1;i++) {
			if(f<arr[i]) {
				s=f;
				f=arr[i];
			}
			else if(s<arr[i]&arr[i]!=f) {
				s=arr[i];
			}
		}
		return s;
	}

}
