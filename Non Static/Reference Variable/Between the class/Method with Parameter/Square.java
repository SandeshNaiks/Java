class Demo
{
	void area(int a)
	{
	int result=a*a;
	System.out.println(result);
	}
}
class Square
{
public static void main(String[] args)
{
	Demo d=new Demo();
	d.area(5);
	}
}