class Demo
{
	static double area()
	{
	final double pi=3.142;
	int r=5;
	double result=pi*r*r;
	return result;
	}
}
class Circle 
{
public static void main(String[] args)
{
	double y=Demo.area();
	System.out.println(y);
	}
}