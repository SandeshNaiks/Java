public class XY
{
	protected Number m1(int a)
	{
		System.out.println("one"); 
		return null;
	}
	Object m2()
	{

		System.out.println("two"); 
		return null;
	}
	public  class YZ extends XY
	{
		protected String m2()
		{
			
		System.out.println("three"); 
		return null;
	}
	}
	public class XYZ
	{
		public static void main(String[] args)
		{
	
	     XY xy=new YZ();
          xy.m1(20);
		  xy.m2();
		}
	}



}