package Testjichu;

import java.util.Arrays;

/***
 * 测试二分查找
 * 这个基本上是成功的，只是遇上如果是有相同的查找的后面的元素
 * @author 18457
 *
 */

public class TestBinarySearch {
public static void main(String[] args) {
	int [] arr={12,34,12,12,66,43,23,1};
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(BinarySearch(arr,12 ));
}
	public static int BinarySearch(int []arr,int value)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]>value)
			{
			     high=mid-1;	
			}
			if(arr[mid]<value)
			{
				low=mid+1;
			}
			if(arr[mid]==value)
			{
				return mid;
			}
		}
		return -1;
	}
}
