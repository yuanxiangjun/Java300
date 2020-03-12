package TestColletion;

import java.util.LinkedHashSet;

/**
 * 测试LinkedHashSet
 * 底层是用双喜链表实现的其他的感觉和HashSet 差不多
 * Linkedhashset 是保留了顺序的
 * @author 18457
 *
 */
public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<10;i++)
		{
			set.add(i);
		}
		for(Integer item:set)
		{
			System.out.println(item);
		}
	}

}
