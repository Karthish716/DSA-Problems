package leetco;

public class LongestThreeCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=2540034;
       long[] arr3=longthree(num);
       for(int i=0;i<arr3.length;i++) {
       System.out.println(arr3[i]);
       }
	}
	
	public static long[] longthree(int num) {
	long arr[]= {};
		for(long i =0;i<num;i++) {
			if(i+i+1+i+2==num) {
				long[] arr2={i,i+1,i+2};
	          return arr2;
			}
	
		}	
	
		return arr;
	}

}
