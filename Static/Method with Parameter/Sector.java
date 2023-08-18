class Demo
{
	static void area(int r,int t)
	{
	double result=0.5*r*r*t;
	System.out.println(result);
	}
}
class Sector
{
public static void main(String[] args)
{
	Demo.area(5,615);
	}
}