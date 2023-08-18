class Demo
{
	int area(int a)
	{
	int result=a*a;
	return result;
	}
}
class Square
{
public static void main(String[] args)
{
	Demo d=new Demo();
	int y=d.area(5);
		System.out.println(y);
	}
}