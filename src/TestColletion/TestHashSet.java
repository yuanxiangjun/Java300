package TestColletion;

import java.util.HashSet;

/**
 * HashSet
 *确定性，无序性，无序性
 * @author 18457
 *
 */
public class TestHashSet {
public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<>();
	hs.add(null);
	hs.add(12);
	System.out.println(hs.size());
	for(int i=0;i<10;i++)
	{
		hs.add(i);
	}
	for(Integer item:hs)
	{
		System.out.println(item);
	}
}
}
