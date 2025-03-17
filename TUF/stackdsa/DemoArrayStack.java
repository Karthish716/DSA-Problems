package stackdsa;

public class DemoArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayStack as = new ArrayStack();
		
		as.push(4);
		as.push(6);
		System.out.println(as.pop());
		System.out.println(as.peek());
	}

}
