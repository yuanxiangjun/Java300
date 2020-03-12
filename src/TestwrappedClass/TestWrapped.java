package TestwrappedClass;
/**
 * 测试包装类
 * @author 18457
 *
 */
public class TestWrapped {
	public static void main(String[] args) {
	//把基本数据类型转成对象
		Integer a=new Integer(100);
		Integer b=Integer.valueOf(123);
	//把包装类转成基本数据类型
		int c=a.intValue();
	//把字符串转成包装类对象
		Integer e=new Integer("9999");
		Integer f=Integer.parseInt("9999");
		System.out.println(f);
	//把包装类转化成字符串
		String str =f.toString();
		System.out.println(str);
		
		
		
	}

}
