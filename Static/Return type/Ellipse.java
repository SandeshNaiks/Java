class Demo
{
	static double area()
	{
	final double pi=3.142;
	int a=5;
	int b=10;
	double result=pi*a*b;
    return result;
	}
}
class Ellipse
{
public static void main(String[] args)
{
	double x=Demo.area();
	System.out.println(x);
	}
}