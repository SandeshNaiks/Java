class Demo
{
	void area(int b,int h)
	{
	int result=b*h;
	System.out.println(result);
	}
}
class Parallelogram
{
public static void main(String[] args)
{
	Demo d=new Demo();
	d.area(8,12);
	}
}