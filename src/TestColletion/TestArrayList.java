package TestColletion;
/**
 * 测试ArrayList
 * ArrayList的遍历主要用三种方法
 * 1.Iterator遍历
 * 2.索引位置遍历
 * 3.for遍历
 */
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	private static final boolean AarrayList = false;

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			arr.add(i);
		}
	//1.
		Iterator<Integer>  itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//2.
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
	//3.简单的for比较快
		for(Integer item : arr)
		{
			System.out.println(item);
		}
	}


}
