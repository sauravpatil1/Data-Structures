import java.util.*;
class DStack{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		MyStack<Integer> stack = new MyStack<>();
		int exit = 1;
		while(exit!=0){
			System.out.println("1.push\n2.Pop\n3.peek\n4.print\n0.exit\nEnter your choice");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					int data = sc.nextInt();
					stack.push(data);
					break;
				case 2:
					System.out.println(stack.pop());
					break;
				case 3:
					System.out.println(stack.peek());
					break;
				case 4:
					stack.print();
					break;
				default:
					exit=0;
			}
		}
	}
}
class MyStack<T>{
	Node<T> top;
	class Node<T>{
		T data;
		Node<T> next;
		public Node(T data){
			this.data = data;
			next = null;
		}
	}
	public void push(T data){
		Node<T> node = new Node<T>(data);
		if(top == null){
			top = node;
		}
		else{
			node.next = top;
			top = node;
		}
	}
	public T pop(){
		Node<T> temp = top;
		top=top.next;
		return temp.data;
	}
	public T peek(){
		return top.data;
	}
	public void print(){
		Node<T> temp = top;
		while(temp != null){
			System.out.print(" "+temp.data);
			temp=temp.next;
		}
	}
}