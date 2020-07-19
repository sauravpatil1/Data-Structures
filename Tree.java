import java.util.*;
class TestMyTree{
    public static void main(String [] args){
	MyTree tree = new MyTree();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n--!=0){
		int data = sc.nextInt();
		tree.insert(data);
	}
	tree.print();
    }
}

class MyTree{
    Node root = null;

    class Node{
	int data;
	Node left = null;
	Node right = null;
	public Node(int data){
		this.data = data;
	}
    }

    public void insert(int data){
	this.root = insert (root, data);
    }

    public Node insert(Node root,int data){
	if(root==null){
		Node node = new Node(data);
		return node;
	}
	if(data < root.data){
		root.left = insert(root.left,data);
	}else{
		root.right = insert(root.right, data);
	}
	return root;
    }
	
    public void print(){
	print(root);
    }
    public void print(Node root){
	if(root == null)return;
	print(root.left);
	System.out.print(root.data + " ");
	print(root.right);
    }    
}