class Demo
{
	static void area(int r)
	{
	final double pi=3.142;
	double result=pi*r*r;
	System.out.println(result);
	}
}
class Circle
{
public static void main(String[] args)
{
	Demo.area(5);
	}
}