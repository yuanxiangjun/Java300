package TestColletion;

public class Cat implements Comparable{
	int size;
	public Cat(int size)
	{
		this.size=size;
	}
	public int hashCode()
	{
		return size;
	}
	public int getSize(){
		return size;
	}
	public boolean equals(Object ob)
	{
		if(0==size-((Cat) ob).getSize())
		{
			return true;
		}
		return false;
		
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return size-((Cat)arg0).getSize();
	}
}

