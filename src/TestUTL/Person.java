package TestUTL;
/**
 * Arrays 和 Colletions 在进行sort 的时候都是自动的调用compareTo的方法的
 * 如果对象要进行比较的话，实现Comparble 接口，从写comparTo的方法
 * -1,0,1；
 * name.compareTO(o.name)
 * 这个实际上是用
 */
import java.util.Arrays;

public class Person implements Comparable<Person> {
	String  name;
	int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int i=0;
		i=name.compareTo(o.name);
		if(i==0)
		{
			return age-o.age;
		}
		else
		{
			return  i;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Person[] ps=new Person[3];
		ps[0]=new Person("Tom",18);
		ps[1]=new Person("Mike",16);
		ps[2]=new Person("Mike",10);
		Arrays.sort(ps);
		for(Person p:ps)
		{
			System.out.println(p.getName()+" "+p.getAge());
		}
	}
}
