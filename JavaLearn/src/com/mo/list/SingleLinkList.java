package com.mo.list;
/**
 * @author mo
 *线性表的链式表操作
 */
public class SingleLinkList implements MyList {
	private Node head;
	//测试
	public static void main(String[] args) {
		SingleLinkList sl = new SingleLinkList();
		sl.add(1);
		sl.add(45);
		//sl.remove(0);
		sl.set(1, 5);
		System.out.println(sl.get(0));
		System.out.println(sl.get(1));
		/*for(int i=0;i<sl.size();i++){
			System.out.println(sl.get(i));
		}*/
	}
	
	
	
	public boolean isEmpty() {
		return head==null;
	}

	
	public void add(int index, Object object) {
		//如果链表为空的，就新建一个节点并设为头节点
		if(head==null){
			head = new Node(object, null);
		}else{
			Node p = head;
			if(index==0){//如果链表不为空，要插入到链表的头，那新建一个节点，把新建节点的下一个指向，指向以前的头节点
				head = new Node(object, p);
			}else{
				int i = 0;
				//如果除头节点外的任务地方，侧循环到要插入地方的前一个，所以index要减1
				while(p.getNext()!=null && i<index-1){
					i++;
					p = p.getNext();
				}
				//p 为当前要插入地方的前一个节点，把他的一个指向，指向一个新建的节点，并把此新建的节点指向以前p的下一个节点
				p.setNext(new Node(object,p.getNext()));
			}
		}
	}

	
	public void add(Object object) {
		add(Integer.MAX_VALUE,object);
	}

	
	public Object remove(int index) {
		Node p = head;
		if(index==0){
			head = p.getNext();
		}else{
			int i = 0;
			while(p.getNext()!=null && i<index-1){
				i++;
				p = p.getNext();
			}
			Node temp = p.getNext();
			p.setNext(temp.getNext());
			temp = null;
		}
		return null;
	}

	
	public int size() {
		Node p = head;
		int size = 0;
		while(p!=null){
			size++;
		}
		return size;
	}

	
	public void clear() {
		head = null;
	}

	
	public Object get(int index) {
		Node p = head;
		for (int j = 0; j <index; j++) {
			p = p.getNext();
		}
		
		return p.getObject();
	}

	
	public void set(int index, Object object) {
		Node p = head;
		for (int i = 0; i < index; i++) {
			p = p.getNext();
		}
		p.setObject(object);
	}

}
