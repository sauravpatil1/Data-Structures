import java.util.*;
class Tree<T>{
	class Node<T>{
		T data;
		Node<T> left=null;
		Node<T> right=null;
		public Node(T data){
			this.data = data;
		}
	}

	public Node<T> insert(Node<T> root,T data){
		if(root==null){
			Node<T> node = new Node<>();
			root = node;
			return root;
		}
		if(root.data<data){
			root = insert(root.left,data);
			return root;
		}else{
			root = insert(root.right,data);
			return root;
		}
	}

	public bool search(Node<T> root,T data){
		if(data=root.data)return true;
		if(root==null)return false;
		if(root.data<data)search(root.left,data);
		else search(root.right,data);
	}

	public void print(Node<T> root){
		if(root==null)return;
		print(root.left);
		System.out.println(" "+root.data);
		print(root.right);
	}

	public static void main(String [] args){
		Tree<Integer> tree = new Tree<>();
		int exit = 1;
		while(exit!=0){
			System.out.print("1.Insert\n2.Print\n3.Search\n0.exit\nEnter your choice\n");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					int data = sc.nextInt();
					Node<T> root=tree.insert(data);
					break;
				case 2:
					tree.print(root);
					break;
				case 3:
					System.out.println(tree.search());
					break;
				default:
					exit=0;
			}
		}
	}
}