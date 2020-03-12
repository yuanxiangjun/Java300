package TestColletion;
/**
 * equals hashcode tosting 这三个方法通常是三位一体的
 * 
 */
import java.util.HashSet;

public class TestHashSetRule {
	public static void main(String[] args) {
		HashSet<Cat> set=new HashSet<>();
		set.add(new Cat(12));
		set.add(new Cat(10));
		set.add(new Cat(9));
		set.add(new Cat(9));
		System.out.println(set.size());
	}

}
