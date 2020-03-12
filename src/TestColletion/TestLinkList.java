package TestColletion;

import java.util.LinkedList;

/***
 * 测试LinkList
 * 适用于删除了插入元素
 * ArrayList与LinkedList的比较
 * Arraylist适用于查询和访问
 * LinkedList适用于插入和删除
 * @author 18457
 *
 */
public class TestLinkList {
public static void main(String[] args) {
	LinkedList<Integer> lklist=new LinkedList<>();
	for(int i=0;i<10;i++)
	{
		lklist.add(i);
	}
	for(Integer item: lklist)
	{
		System.out.println(item);
	}
	lklist.addFirst(10);
	lklist.add(0,12);
	lklist.remove(0);
	
	
	
}
}
