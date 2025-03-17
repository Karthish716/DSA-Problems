package binarySearchProblems;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]= {2,4,5,6,7};
		int arr2[]= {1,3,4,8,9};
	   double a = medianmerge(arr1,arr2);
	   System.out.println(a);
	}
	
	
	
	 public static double medianmerge(int[] first,int[] second) {
  	   
         int[] joined= new int[first.length+second.length];
          int i=0,j=0,k=0;
       	 while(i<first.length && j<second.length) {
     		 if(first[i]<second[j]) {
       			 joined[k++]=first[i++];
        		 }
        		 else {
        			 joined[k++]=second[j++];
        		 } 
        	    }
        	 
        	 while(i<first.length) {
        	    	joined[k++]=first[i++];
        	    }
        	    while(j<second.length) 
        	    {
        	    	joined[k++]=second[j++];
        	    }
        	  
        	   int n= first.length + second.length;
        	   if(n%2==1) {
        		   return joined[n/2];
        	   }
        	   
        	   
        	   return (double) ((double)(joined[n/2]) + (double)(joined[n/2-1]));
           }

}
