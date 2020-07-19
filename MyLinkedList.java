import java.util.*;
class TestLinkedList{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	MyLinkedList<Integer> myLL = new MyLinkedList<>();
	int n = sc.nextInt();
	for(int i=0;i<n;i++){
		int temp = sc.nextInt();
		myLL.add(temp);
	}
	myLL.print();
	System.out.println(myLL.get(2));
    }
}
class MyLinkedList<T>{
    Node start = null;
    Node end = null;

    class Node{
	T data;
	Node next;
	Node prev;
	public Node(T data){
		this.data = data;
		next = null;
		prev = null;
	}
    }

    public void add(T data){
	Node node = new Node(data);
	if(start == null){
		end = node;
		start = node;
		return;
	}
	start.prev = node;
	node.next = start;
	start = node;
    }

    public void reverse(){
	Node temp = start;
	while(temp!=null){
		System.out.print(temp.data + " ");
		temp = temp.next;
	}
    }

    public void print(){
	Node temp = end;
	while(temp!=null){
		System.out.print(temp.data + " ");
		temp = temp.prev;
	}
    }

    public T get(int i){
	Node temp = end;
	while(i--!=1){
		temp = temp.prev;
	}
	return temp.data;
    }
}