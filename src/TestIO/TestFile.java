package TestIO;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f= new File("c:/tmp/a/b/c");
		if(!f.exists())
		{
			f.mkdirs();
		}
		File i=new File("c:/abc.txt");
//		if(!i.exists())
//		{
//			try{
//				i.createNewFile();
//			}
//			catch(IOException e)
//			{
//				e.printStackTrace();
//			}
//		}
		i.delete();
	}
}
