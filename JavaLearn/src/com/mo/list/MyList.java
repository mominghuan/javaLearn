package com.mo.list;
/**
 * 线性表结构操作
 * @author mo
 *
 */
public interface MyList {
	/**
	 * 判断是否为空
	 * @return
	 */
	boolean isEmpty();
	/**
	 * 在指定位置添加
	 */
	void add(int index, Object object);
	/**
	 * 在末尾添加
	 */
	void add(Object object);
	/**
	 * 指定位置删除
	 */
	Object remove(int index);
	/**
	 * 列表的长度
	 */
	int size();
	/**
	 * 清空
	 */
	void clear();
	/**
	 * 获取指定位置元素
	 */
	Object get(int index);
	/**
	 * 替换指定位置元素
	 */
	void set(int index, Object object); 
}
