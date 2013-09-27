package com.mo.list;
/**
 * ���Ա�ṹ����ʵ��
 * @author mo
 *
 */

public class ArrayList implements List {
	private final static int LENGTH=5;//�����ָ�����鳤�ȣ�Ĭ��Ϊ5
	private Object[] list;//���Ԫ������
	private int size;//��¼Ԫ�صĸ��� 
	//����
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(5);
		arrayList.add(8);
		arrayList.set(1, 3);
		arrayList.remove(1);
		arrayList.remove(1);
		arrayList.add(1,6);
		arrayList.add(1,5);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
	/**
	 * ���index�Ƿ�Ϸ�
	 * @param index
	 */
	public void checkIndex(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("index:" + index + " size:" + size) ;
		}
	}
	/**
	 * ���index�Ƿ�Ϸ�
	 * @param index
	 */
	public void checkIndexForAdd(int index) {
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException("index:" + index + " size:" + size) ;
		}
	}
	@Override
	public boolean isEmpty() {
		return size==0;
	}

	@Override
	public void add(int index, Object object) {
		checkIndexForAdd(index);
		//�������ˣ����½�һ�������ģ�������
		if(size==list.length){
			Object[] temp = new Object[size*2];
			for (int i = 0; i < size; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
		//�����ƶ�Ԫ��
		for (int i = size-1; i >= index; i--) {
			list[i+1] = list[i];
		}
		list[index] = object;
		size++;
	}

	@Override
	public void add(Object object) {
		add(size,object);

	}

	@Override
	public Object remove(int index) {
		checkIndex(index);
		Object object = list[index];
		//Ԫ����ǰ�ƶ�
		for (int i = index; i < size; i++) {
			list[i] = list[i+1];
		}
		size--;
		return object;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		if(size!=0){
			for (int i = 0; i < size; i++) {
				list[i] = null;
			}
			size = 0;
		}
	}

	@Override
	public Object get(int index) {
		checkIndex(index);
		return list[index];
	}

	@Override
	public void set(int index, Object object) {
		checkIndex(index);
		list[index] = object;
	}
	//����
	public ArrayList(int length) {
		if(length < 0){
			list = new Object[LENGTH];//LENGTH=5
		}else {
			list = new Object[length];
		}
		this.size = 0;
	}
	public ArrayList() {
		this(LENGTH);
	}
}
