class Demo
{
	static double area()
	{
	int a=5;
	int b=5;
	int h=10;
	double result=0.5*a+b*h;
	return result;
	}
}
class Trapizoid
{
public static void main(String[] args)
{
	double y=Demo.area();
	System.out.println(y);
	}
}