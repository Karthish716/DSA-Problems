package arrayProblems;

public class ZerosatEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZerosatEnd z = new ZerosatEnd();
		int[] arr= {0,1,0,3,12};
		int[] f = z.zerosend(arr);
		for(int i=0;i<=f.length-1;i++) {
	System.out.print(f[i]+" ");
		}
	}
	
	// 0 , 1 , 0 , 3, 12 
	
	public int[] zerosend(int[] arr) {
		int z=1;
		int i = 0;
	while(z<arr.length) {
		if(arr[i]==0) {
			if(arr[z]!=0) {
			int temp=arr[i];
			 arr[i]=arr[z];
			arr[z]=temp;
			i++;
			z++;
		}
		else {
			z++;
		}
		}
		else {
		i++;
		z++;
		}	
		}
		return arr;
	}	  
	
}
