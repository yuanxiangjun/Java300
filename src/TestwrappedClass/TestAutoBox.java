package TestwrappedClass;
/**
 * 测试自动装箱
 * 
 * @author 18457
 *
 */
public class TestAutoBox {
 public static void main(String[] args) {
	 //自动装箱
	Integer a=1234;//==Integer a =Integer.valueOf(1234);
	//自动拆箱
	int b=a;//int b=a.intvalue();
	Integer in=1234;
	Integer hh=1234;
	System.out.println(a==in);
	System.out.println(in==hh);
	System.out.println(a.equals(in));
	
}
}
