class Demo
{
	int area(int w,int h)
	{
	int result=w*h;
	return result;
	}
}
class Rectangle
{
public static void main(String[] args)
{
	Demo d=new Demo();
	int y=d.area(5,8);
	System.out.println(y);
	}
}