package com.mo.tree;

import java.util.List;

/**
 * ���Ĳ�����
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
		
		
		System.out.println("��������ܶ����ǣ�" + bTree.getCount());
		System.out.println("��������ܽڵ����ǣ�" + (bTree.getCount()+1));
		for(TreeNode t:list){
			System.out.print(t.getNodeValu() + " ");
		}
	}

}
