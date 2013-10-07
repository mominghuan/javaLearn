package com.mo.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	private int count = 0;//总度数
	private TreeNode root;
	private static BinaryTree tree = null;
	
	public static BinaryTree getInstance(TreeNode node){
		if(tree==null){
			tree = new BinaryTree(node);
		}
		return tree;
	}
	
	//二叉树的查询
/*	public TreeNode find(TreeNode tn, int data){
		if(tn==null){
			return tn;
		}
		if(tn!=null && data==(Integer)tn.getNodeValu()){
			System.out.println(tn.getNodeValu());
			return tn;
		}
		if(data>(Integer)tn.getNodeValu()){
			find(tn.getRigh(), data);
		}else{
			find(tn.getLeft(), data);
		}
		return null;
	}*/
	public TreeNode find(TreeNode tn, int data){
		TreeNode node = null;
		TreeNode tree = tn;
		//如果根为空
		while(true){
			if(tree==null){
				break;
			}
			if((Integer) tree.getNodeValu()==data){
				node = tree;
				break;
			}
			if((Integer) tree.getNodeValu()>data){
				tree = tree.getLeft();
			}else{
				tree = tree.getRigh();
			}
		}
		return node;
	}
	public TreeNode find2(TreeNode tn, int data){
		TreeNode node = null;
		TreeNode root = tn;
		while(true){
			//如果根节点为空，跳出循环
			if(root==null){
				break;
			}
			if((Integer)root.getNodeValu()==data){
				node = root;
				break;
			}
			if((Integer)root.getNodeValu()>data){
				root = root.getLeft();
			}else{
				root = root.getRigh();
			}
			//如果data跟tn的值相等,赋值给node，跑出循环。
			
			//如果data大于tn的值。
		}
		return node;
	}
	//将数据添加到现有的二叉树中
	public void add(TreeNode tn,int data){
		//如果这棵树为空，则新建一个
		if(tn==null){
			tn = new TreeNode(data);
		}else{
			//不为空则查询适合添加的位置，再添加
			addTree(tn,data);
		}
	}
	private void addTree(TreeNode tn, int data) {
		//如果要添加的数据，小于当前的节点的值，则进入左边的子树查找位置。
		if((Integer)tn.getNodeValu()>data){
			//如果当前节点左边没有子节点，则添加到此位置上
			if(tn.getLeft()==null){
				tn.setLeft(new TreeNode(data));
			}else{
				//如果有左节点，则再进入他的子节点查询
				addTree(tn.getLeft(), data);
			}
		}else{
			if(tn.getRigh()==null){
				tn.setRigh(new TreeNode(data));
			}else{
				add(tn.getRigh(), data);
			}
			
		}
	}


	//计算树的层数
	public void calculateCount(TreeNode tn){
		if(tn.getLeft()!=null){
			count += 1;
		}
		if(tn.getRigh()!=null){
			count += 1;
		}
	}
	//先序循环二叉树
	public List<TreeNode> rootFirst(TreeNode root){
		List<TreeNode> list = new ArrayList<TreeNode>();
		if(root==null){
			return list;
		}
		calculateCount(root);
		list.add(root);
		List<TreeNode> left = rootFirst(root.getLeft());
		List<TreeNode> right = rootFirst(root.getRigh());
		list.addAll(left);
		list.addAll(right);
		return list;
	}
	//中序循环二叉树
	public List<TreeNode> rootMid(TreeNode tn) {
		List<TreeNode> list = new ArrayList<TreeNode>();
		if(tn==null){
			return list;
		}
		List<TreeNode> left = rootMid(root.getLeft());
		List<TreeNode> right = rootMid(root.getRigh());
		list.addAll(left);
		list.add(tn);
		list.addAll(right);
		return list;
	}
	//中序遍历
	public void showTree(TreeNode tn){
		if(tn.getLeft()!=null){
			showTree(tn.getLeft());
		}
		System.out.print(tn.getNodeValu()+ " ");
		if(tn.getRigh()!=null){
			showTree(tn.getRigh());
		}
		
	}
	
	//后序循环二叉树
	public List<TreeNode> rootLast(TreeNode tn){
		List<TreeNode> list = new ArrayList<TreeNode>();
		if(tn==null){
			return list;
		}
		List<TreeNode> left = rootLast(root.getLeft());
		List<TreeNode> right = rootLast(root.getRigh());
		list.addAll(left);
		list.addAll(right);
		list.add(tn);
		return list;
	}
	
	public BinaryTree(TreeNode root) {
		this.root = root;
	}
	public TreeNode getRoot() {
		return root;
	}
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
