package TestUTL;

import java.util.Arrays;

/**
 * Test Arrays 
 * @author 18457
 *
 */

public class TestArray {
	public static void main(String[] args) {
		int [] a={2,3,1,45,3121};
		Arrays.sort(a);
		for(int item:a)
		{
			System.out.println(item);
		}
		//int [] b=new int[10];
		int [] b=Arrays.copyOf(a, 3);
		int c[]=new int[10];
		Arrays.fill(c, 100);//这 个方法就是把数组中的灭一个元素赋值，还可以在指定赋值
		for(int item:c)
		{
			System.out.println(c);
		}
		System.out.println(c[0]);
		System.out.println(c[9]);
		//System.out.println(c[100]);
}
}
