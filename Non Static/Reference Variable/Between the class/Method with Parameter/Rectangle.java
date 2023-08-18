class Demo
{
	void area(int w,int h)
	{
	int result=w*h;
	System.out.println(result);
	}
}
class Rectangle
{
public static void main(String[] args)
{
	Demo d=new Demo();
	d.area(5,8);
	}
}