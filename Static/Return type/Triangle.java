class Demo
{
	static double area()
	{
	int b=30;
	int h=5;
	double result=0.5*b*h;
	return result;
	}
}
class Triangle
{
public static void main(String[] args)
{
	double y=Demo.area();
	System.out.println(y);
	}
}