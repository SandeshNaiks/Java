class Demo
{
	static int area()
	{
	int w=10;
	int h=20;
	int result=w*h;
	return result;
	}
}
class Rectangle
{
public static void main(String[] args)
{
	int y=Demo.area();
	System.out.println(y);
	}
}