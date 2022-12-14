
public class BinaryTree {
	public Node root = null;
	int count = 0;
	public int[]listOrder;
	int index = 0;
	
	public void insert(int keyvalue) {
		Node p = new Node(keyvalue);
		root = InsertNode(root,p);
	}
	
	private Node InsertNode(Node root, Node t) {
		if (root ==null) return t;
		if (t.key< root.key) {
			root.left = InsertNode(root.left, t);
		}else {
			root.right = InsertNode(root.right, t);
		}
		count++;
		return root;
	}
	
	public void iterativeInsert(int keyvalue) {
		Node t = new Node(keyvalue);
		Node p = root;
		if(root ==null) {
			root = t;
			return;
		}
		while(p!=null) {
			if(keyvalue<p.key) {

				if (p.left ==null) {
					p.left = t;
					//System.out.println(p.key);
					return;
				}else {
					p = p.left;
				}
			}else if(keyvalue>=p.key){
				if(p.right ==null) {
					p.right = t;
					//System.out.println(p.key);
					return;
				}else {
					p = p.right;
				}
			}
			count++;
		}
		
	}
	
	public int height(Node root) {
		int lh, rh;
		if(root ==null) return 0;
		lh = height(root.left);
		rh = height(root.right);
		if(lh>rh)return lh+1;
		else return rh+1;
	}
	
	public void array(Node root) {
		listOrder = new int[count];
		index=0;
		inOrder(root);
	}
	
	public void inOrder(Node root) {
			if(root==null)return;
			inOrder(root.left); //traverse left
			listOrder[index++] =root.key;
			//System.out.println(listOrder[index]);
			inOrder(root.right); //traverse right
	}
	
	public boolean search(int keyvalue) {
		Node p = root;
		while(p!=null && keyvalue!=p.key) {
			if(keyvalue<p.key) {

				if (p.left ==null) {
		
					return false;
				}else {
					p = p.left;
				}
			}else if(keyvalue>=p.key){
				if(p.right ==null) {
					return false;
				}else {
					p = p.right;
				}
			}
		}
		return true;
	}
	
	
	
	private static class Node{
		int key;
		Node left=null, right=null;
		
		public Node(int n) {
			key= n;
		}
	}

}
