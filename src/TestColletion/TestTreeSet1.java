package TestColletion;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 不可以容纳null元素，也不支持同步
 * @author 18457
 *
 */
public class TestTreeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0;i<12;i++)
		{
			set.add(i);
		}
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
