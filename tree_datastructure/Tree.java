package tree_datastructure;
import java.util.Stack;

import java.util.ArrayList;

public class Tree {

	static Node root = null;
	static class Node{
		int data;
		Node right;
		Node left;
		public Node(int data)
		{
			this.data = data;
			right = left = null;
		}
	}
	
	Node insertRec(Node ptr, int data)
	{
		if(ptr==null)
		{
			Node node = new Node(data);
			return node;
		}
		else if(ptr.data<data)
			ptr.right = insertRec(ptr.right, data);
		else if(ptr.data>data)
			ptr.left = insertRec(ptr.left, data);
		return ptr;
	}
	
	void inorder(Node temp)
	{
		if(temp!=null)
		{
			inorder(temp.left);
			System.out.print(temp.data+" ");
			inorder(temp.right);
		}
	}
	
	static boolean printPath(Node temp, int f, ArrayList<Integer> arr)
	{
		if(temp==null)
			return false;
		
		arr.add(temp.data);
		
		if(temp.data == f)
			return true;
		
		if(printPath(temp.left, f, arr) || printPath(temp.right, f, arr))
			return true;
		
		arr.remove(arr.size()-1);
		return false;
		
	}
	
	static Node removeHalfNodes(Node temp)
	{
		if(temp == null)
			return null;
		temp.left = removeHalfNodes(temp.left);
		temp.right = removeHalfNodes(temp.right);
		if(temp.left == null && temp.right == null)
			return temp;
		else if(temp.left == null)
		{
			return temp.right;
		}
		else if(temp.right == null)
		{
			return temp.left;
		}
		return temp;
	}
	
	
	public static ArrayList<Integer> inorderTraversal(Node A) {
        Node curr = A;
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        Stack<Node> stack = new Stack<>();
        while(curr!=null || stack.size()>0)
        {
            while(curr!=null)
            {
                stack.push(curr);
                curr = curr.left;
            }
        
        curr = stack.pop();
        arr.add(curr.data);
        curr = curr.right;
        }
        return arr;
    }
	
	//@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Tree obj = new Tree();
		root = obj.insertRec(root, 4); 
        obj.insertRec(root, 7); 
        obj.insertRec(root, 2);
        obj.insertRec(root, 1); 
        obj.insertRec(root, 5); 
        obj.insertRec(root, 8); 
        obj.insertRec(root, 6);
        obj.inorder(root);
        System.out.println();
        root = removeHalfNodes(root);
        obj.inorder(root);
        System.out.println();
        ArrayList<Integer> arr = new ArrayList<>();
        Tree.printPath(root, 6, arr);
        for(Integer e: arr)
        	System.out.print(e+" ");
        System.out.println();
        ArrayList<Integer> tarr;// = new ArrayList<>();
        tarr = inorderTraversal(root);
        for(Integer e: tarr)
        	System.out.print(e+" ");
        
        
	}
}