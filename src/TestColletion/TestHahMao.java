package TestColletion;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 允许存储null,
 * 不同步，多线程不安全
 * 无序的
 * 
 * @author 18457
 *
 */
public class TestHahMao {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,null);
		hm.put(null, null);
		hm.put(2, "Shlerlol");
		hm.remove(null);
		System.out.println(hm.containsValue(null));
		for(int i=0;i<100;i++)
		{
			hm.put(i,"ooo");
		}
		Iterator<Integer> itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			Integer key=itr.next();
			String value=hm.get(key);
			System.out.println("key: "+key+" value: "+value);

		}
		
	}

}
