package com.mo.list;
/**
 * @author mo
 *���Ա����ʽ�����
 */
public class SingleLinkList implements MyList {
	private Node head;
	//����
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
		//�������Ϊ�յģ����½�һ���ڵ㲢��Ϊͷ�ڵ�
		if(head==null){
			head = new Node(object, null);
		}else{
			Node p = head;
			if(index==0){//�������Ϊ�գ�Ҫ���뵽�����ͷ�����½�һ���ڵ㣬���½��ڵ����һ��ָ��ָ����ǰ��ͷ�ڵ�
				head = new Node(object, p);
			}else{
				int i = 0;
				//�����ͷ�ڵ��������ط�����ѭ����Ҫ����ط���ǰһ��������indexҪ��1
				while(p.getNext()!=null && i<index-1){
					i++;
					p = p.getNext();
				}
				//p Ϊ��ǰҪ����ط���ǰһ���ڵ㣬������һ��ָ��ָ��һ���½��Ľڵ㣬���Ѵ��½��Ľڵ�ָ����ǰp����һ���ڵ�
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
