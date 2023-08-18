class Demo
{
	static int area()
	{
	int b=10;
	int h=20;
	int result=b*h;
	return result;
	}
}
class Parallelogram
{
public static void main(String[] args)
{
	int x=Demo.area();
	System.out.println(x);
	}
}