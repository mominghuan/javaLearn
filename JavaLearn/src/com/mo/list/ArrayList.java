package com.mo.list;
/**
 * 线性表结构操作实现
 * @author mo
 *
 */

public class ArrayList implements List {
	private final static int LENGTH=5;//如果不指定数组长度，默认为5
	private Object[] list;//存放元素数组
	private int size;//记录元素的个数 
	//测试
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
	 * 检查index是否合法
	 * @param index
	 */
	public void checkIndex(int index){
		if(index < 0 || index >= size){
			throw new IndexOutOfBoundsException("index:" + index + " size:" + size) ;
		}
	}
	/**
	 * 检查index是否合法
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
		//数组满了，再新建一个更长的，并复制
		if(size==list.length){
			Object[] temp = new Object[size*2];
			for (int i = 0; i < size; i++) {
				temp[i] = list[i];
			}
			list = temp;
		}
		//往后移动元素
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
		//元素往前移动
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
	//构造
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
