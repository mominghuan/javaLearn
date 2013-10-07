package com.mo.tree;
/**
 * 二叉树实体类
 * @author mo
 *
 */
public class TreeNode {
	private Object nodeValu;
	private TreeNode left,righ;
	public Object getNodeValu() {
		return nodeValu;
	}
	public void setNodeValu(Object nodeValu) {
		this.nodeValu = nodeValu;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRigh() {
		return righ;
	}
	public void setRigh(TreeNode righ) {
		this.righ = righ;
	}
	public TreeNode(Object nodeValu, TreeNode left, TreeNode righ) {
		this.nodeValu = nodeValu;
		this.left = left;
		this.righ = righ;
	}
	public TreeNode(Object nodeValu) {
		this(nodeValu,null,null);
	}
	
	
	
}
