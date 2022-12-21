package Practise;

public class Stack {
	public static void main(String[] args) {
		MyStack theStack = new MyStack(4);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		
		System.out.println("\n Current element on top is : " +theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("\n Current Element at top is : " +theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
	}
}

class MyStack{
	int index = -1;
	int size;
	int array[];
	
	MyStack(int size){
		System.out.println("MyStack created with size: " +size);
		this.size = size;
		array = new int[size];
	}
	void push (int item) {
		System.out.println("Pushin" +item + "to the stack..");
		if (index > size-2) {
			throw new MyStackOverflowException("stack size is overflow..");
		}
		array[++index] = item;
	}
	int pop() {
		if (index < 0) {
			throw new MyStackEmptyException("Stack is empty");
			
		}
		System.out.println("Poping item from the stack..");
		return array[index--];
	}
	int peek() {
		return array[index];
	}
}
class MyStackOverflowException extends RuntimeException{
	public MyStackOverflowException(String str) {
		super(str);
	
	}
	
}
class MyStackEmptyException extends RuntimeException {
	public MyStackEmptyException(String str) {
		super(str);
	}
}