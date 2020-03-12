package TestColletion;

import java.util.TreeSet;

/**
 * TreeSet的比较是根据compareTo去比较的
 * @author 18457
 *
 */
public class TestTreeSetRule {
	public static void main(String[] args) {
		TreeSet<Cat> set=new TreeSet<>();
		set.add(new Cat(10));
		set.add(new Cat(10));
		set.add(new Cat(12));
		System.out.println(set.size());
	}
	
}
