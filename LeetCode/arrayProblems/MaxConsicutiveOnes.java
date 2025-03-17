package arrayProblems;

public class MaxConsicutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,1,0,1,1,1,0,1,1};
		MaxConsicutiveOnes m = new MaxConsicutiveOnes();
		int a =m.MaxOne(arr);
     System.out.print(a);
	}
	
	public int MaxOne(int[] arr) {
		int count=0;
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				if(count>max) {
					max=count;
				}
			}
			else {
				count=0;
			}
		}
		return max;
	}

}
