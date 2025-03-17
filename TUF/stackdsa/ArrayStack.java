package stackdsa;

public class ArrayStack {
static final int MAX_SIZE = 30;
int arr[] = new int[MAX_SIZE];
int top;

ArrayStack() {
	top=-1;
}
void push(int val) {
	if(top==MAX_SIZE ) 
		throw new IndexOutOfBoundsException("Stack over full");
	arr[++top]=val;
}

int pop() {
	if(top==-1) 
		throw new IndexOutOfBoundsException("Stack over full");
	return arr[top--];
	
}

int peek() {
	return arr[top];
}

}
