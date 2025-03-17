package leetco;

public class NextGreatestLetterBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char[] arr={'c','d','f','j'};
	    char a= nextletter(arr,'d');
	    System.out.print(a);
	}

	
	public static char nextletter(char[] letters, char target) {
		int s=0;
		int e= letters.length-1;
		
		
		while(s<=e) {
			int mid = (e+s)/2;
			if(target<letters[mid]) {
				
				e=mid-1;
			}
			else{
				s=mid+1;
			}
		
			
		}
		return letters[s%letters.length];
	}
}
