package com.mo.tree;

import java.util.List;

/**
 * 树的测试类
 * @author mo
 *
 */
public class TreeTest {
	public static void main(String[] args) {
		TreeNode a,b,c,d,e,f,g;
		g = new TreeNode("g");
		f = new TreeNode("f");
		e = new TreeNode("e",f,g);
		d = new TreeNode("d");
		b = new TreeNode("b",d,e);
		c = new TreeNode("c");
		a = new TreeNode("a",b,c);
		BinaryTree bTree = new BinaryTree(a);
		
		List<TreeNode> list = bTree.rootFirst(a);
		
		
		System.out.println("这颗树的总度数是：" + bTree.getCount());
		System.out.println("这颗树的总节点数是：" + (bTree.getCount()+1));
		for(TreeNode t:list){
			System.out.print(t.getNodeValu() + " ");
		}
	}

}
