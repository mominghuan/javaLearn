package com.mo.list;
/**
 * �����ʵ��
 * @author mo
 *
 */
public class Node {
	private Object object;
	private Node next;
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(Object object, Node next) {
		this.object = object;
		this.next = next;
	}
	
}
