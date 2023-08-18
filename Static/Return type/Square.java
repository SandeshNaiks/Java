class Demo
{
	static int area()
	{
	int a=10;
	int result=a*a;
	return result;
	}
}
class Square
{
public static void main(String[] args)
{
	int y=Demo.area();
	System.out.println(y);
	}
}