package com.ita;

public class BinaryTree<T extends Number> {
		private Node root;
		
		class Node
		{
			Node left;
			Node right;
			T value;
			
			Node(T value)
			{
				this.value = value;
			}
		
	}
		
		private void insert(T value, Node node)
		{
			if (root == null)
			{
				root = new Node(value);
				System.out.println("Root " + root.value);
				return;
			}
			if (node.value.doubleValue() > value.doubleValue())
			{
				if(node.left == null)
				{
					node.left = new Node(value);
					System.out.println("Root " + node.value + " left " + value);
				}
				else insert(value, node.left);
				}
			else
			{
				if(node.right == null)
				{
					node.right = new Node(value);
				System.out.println("Root " + node.value + " rigth " + value);
				}
				else insert(value, node.right);
			}
		}
		
		public void add(T value)
		{
			insert(value, root);
		}

		private void show_private(Node node)
		{
			if(node == null) return;
			String left = (node.left == null ? "No " : node.left.value + "");
			String right = (node.right == null ? "No " : node.right.value + "");
			System.out.println("Root " + node.value + " left node: " + left + " right parent: " + right);
			show_private(node.left);
			show_private(node.right);
		}
		
		public void show()
		{
			show_private(root);
		}
		
		private void showLeaves(Node node)
		{
			if(node != null)
			{
				if(node.left == null && node == null)
					System.out.println(node.value);
				else
				{
					showLeaves(node.left);
					showLeaves(node.right);
				}
			}
		}
		public void getLeaves()
		{
			showLeaves(root);
		}
}
