package com.mo.searchTree;

import com.mo.tree.BinaryTree;
import com.mo.tree.TreeNode;

/**
 * 树的二叉查找法的添加，删除，查询
 * @author mo
 *
 */
public class Search {

	
	public static void main(String[] args) {
		TreeNode a,b,c,d,e,f,g,h,j;
		g = new TreeNode(18);
		f = new TreeNode(13);
		e = new TreeNode(14,f,null);
		d = new TreeNode(9);
		b = new TreeNode(12,d,e);
		j = new TreeNode(23);
		h = new TreeNode(22,j,null);
		c = new TreeNode(19,g,h);
		a = new TreeNode(15,b,c); 
		BinaryTree bTree = BinaryTree.getInstance(a);
		
		java.util.List<TreeNode> list = bTree.rootFirst(a);
		for(TreeNode i:list){
			System.out.print(i.getNodeValu() + " ");
		}
		
		bTree.add(a, 17);
		bTree.add(a, 11);
		System.out.println();
		bTree.showTree(a);
		System.out.println();
		TreeNode findTree = bTree.find2(a, 13);
		System.out.println("查找13: " + findTree.getNodeValu());
		System.out.println();
	}
	
}
