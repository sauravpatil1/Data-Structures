import java.util.*;
class MyQueue<T>{
	Node<T> front=null;
	Node<T> rare=null;
	class Node<T>{
		T data;
		Node<T> next;
		public Node(T data){
			this.data = data;
			next = null;
		}
	}
	public void push(T data){
		Node<T> node = new Node(data);
		if(rare==null){
			front = node;
			rare = node;
		}
		else{
			rare.next = node;
			rare = node;
		}
		
	}
	public T pop(){
		Node<T> temp=front;
		front = front.next;
		return temp.data;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		MyQueue<Integer> stack = new MyQueue<>();
		int exit = 1;
		while(exit!=0){
			System.out.println("1.push\n2.Pop\n0.exit\nEnter your choice");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					int data = sc.nextInt();
					stack.push(data);
					break;
				case 2:
					System.out.println(stack.pop());
					break;
				default:
					exit=0;
			}
		}
	}

}