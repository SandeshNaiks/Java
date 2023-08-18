class Demo
{
	int area(int b,int h)
	{
	int result=b*h;
	return result;
	}
}
class Parallelogram
{
public static void main(String[] args)
{
	Demo d=new Demo();
	int y=d.area(8,12);
	System.out.println(y);
	}
}