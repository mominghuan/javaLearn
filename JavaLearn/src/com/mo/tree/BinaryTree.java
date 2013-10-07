package com.mo.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
	private int count = 0;//�ܶ���
	private TreeNode root;
	private static BinaryTree tree = null;
	
	public static BinaryTree getInstance(TreeNode node){
		if(tree==null){
			tree = new BinaryTree(node);
		}
		return tree;
	}
	
	//�������Ĳ�ѯ
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
		//�����Ϊ��
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
			//������ڵ�Ϊ�գ�����ѭ��
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
			//���data��tn��ֵ���,��ֵ��node���ܳ�ѭ����
			
			//���data����tn��ֵ��
		}
		return node;
	}
	//��������ӵ����еĶ�������
	public void add(TreeNode tn,int data){
		//��������Ϊ�գ����½�һ��
		if(tn==null){
			tn = new TreeNode(data);
		}else{
			//��Ϊ�����ѯ�ʺ���ӵ�λ�ã������
			addTree(tn,data);
		}
	}
	private void addTree(TreeNode tn, int data) {
		//���Ҫ��ӵ����ݣ�С�ڵ�ǰ�Ľڵ��ֵ���������ߵ���������λ�á�
		if((Integer)tn.getNodeValu()>data){
			//�����ǰ�ڵ����û���ӽڵ㣬����ӵ���λ����
			if(tn.getLeft()==null){
				tn.setLeft(new TreeNode(data));
			}else{
				//�������ڵ㣬���ٽ��������ӽڵ��ѯ
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


	//�������Ĳ���
	public void calculateCount(TreeNode tn){
		if(tn.getLeft()!=null){
			count += 1;
		}
		if(tn.getRigh()!=null){
			count += 1;
		}
	}
	//����ѭ��������
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
	//����ѭ��������
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
	//�������
	public void showTree(TreeNode tn){
		if(tn.getLeft()!=null){
			showTree(tn.getLeft());
		}
		System.out.print(tn.getNodeValu()+ " ");
		if(tn.getRigh()!=null){
			showTree(tn.getRigh());
		}
		
	}
	
	//����ѭ��������
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
