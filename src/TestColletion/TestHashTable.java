package TestColletion;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



/**
 * 
 * @author 18457
 *
 */
public class TestHashTable {
public static void main(String[] args) {
	Hashtable<Integer,String> ht=new Hashtable<>();
	//ht.put(1, null);
	//ht.put(null, 1);
	ht.put(12,"aaa");
	ht.put(11,"bbb");
	ht.put(10, "ccc");
	System.out.println(ht.containsKey(12));//contains containsValue,conatainsKey
	System.out.println(ht.size());
	System.out.println("迭代器遍历");
	Iterator<Entry<Integer,String>> it=ht.entrySet().iterator();
	while(it.hasNext()){
		Map.Entry<Integer, String> entry=it.next();
		Integer key=entry.getKey();
		String value=entry.getValue();
		System.out.println("key: "+key+" value: "+value);
	}
	System.out.println("根据key的Itrator");
	Iterator<Integer> itr=ht.keySet().iterator();
	while(itr.hasNext())
	{
		Integer key=itr.next();
		String value=ht.get(key);
		//System.out.println()
		System.out.println("key: "+key+" value: "+value);

	}
}
}
