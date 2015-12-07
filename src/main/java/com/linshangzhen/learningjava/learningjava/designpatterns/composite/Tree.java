package com.linshangzhen.learningjava.learningjava.designpatterns.composite;

public class Tree {
	TreeNode root = null;
	
	public Tree(String name) {
		root = new TreeNode(name);
		
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		
	}

}
