package arrayProblems;

public class ArrayisSortedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayisSortedorNot sA = new ArrayisSortedorNot();
		int arr[]= {3,5,6,2,90,7,87,102,103,111,110,110,11,102,104,106,106};
		int arr2[] = {1,2,4,67,78,89};
		boolean res = sA.issortedornot(arr2);
		System.out.print(res);
	}
	
	public boolean issortedornot(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
			
		}
		return true;
	}

}
