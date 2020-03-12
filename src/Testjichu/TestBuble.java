package Testjichu;

import java.util.Arrays;

/***
 * 冒泡排序的优化
 * 
 * 
 * @author 18457
 *
 */
public class TestBuble {
	public static void main(String[] args) {
		int [] value={1,4,2,4,56,24,456};
		int temp = 0;
		
		for(int i=0;i<value.length-1;i++){
			boolean flag=true;
			for(int j=0;j<value.length-1-i;j++)
			{
				if(value[j]>value[j+1])
				{
				temp=value[j];
				value[j]=value[j+1];
				value[j+1]=temp;
				flag=false;
				}
			}
			if(flag)
				break;
		}
		System.out.println(Arrays.toString(value));
	}
	

}
