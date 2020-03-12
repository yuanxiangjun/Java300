package Testjichu;
/**
 * Arrays工具类主要用到它的
 * toString 这是一个静态的方法不是Object中继承父类的方法
 * sort()排序
 * binarySearch()二分查找
 * 
 * 
 */
import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int []a={12,34,11,45};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 12));
	}

}
