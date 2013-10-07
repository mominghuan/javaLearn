package com.mo.list;
/**
 * ���Ա�ṹ����
 * @author mo
 *
 */
public interface MyList {
	/**
	 * �ж��Ƿ�Ϊ��
	 * @return
	 */
	boolean isEmpty();
	/**
	 * ��ָ��λ�����
	 */
	void add(int index, Object object);
	/**
	 * ��ĩβ���
	 */
	void add(Object object);
	/**
	 * ָ��λ��ɾ��
	 */
	Object remove(int index);
	/**
	 * �б�ĳ���
	 */
	int size();
	/**
	 * ���
	 */
	void clear();
	/**
	 * ��ȡָ��λ��Ԫ��
	 */
	Object get(int index);
	/**
	 * �滻ָ��λ��Ԫ��
	 */
	void set(int index, Object object); 
}
