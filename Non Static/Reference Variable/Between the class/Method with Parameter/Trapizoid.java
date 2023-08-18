class Demo
{
	void area(int a,int b,int h)
	{
	double result=0.5*a+b*h;
	System.out.println(result);
	}
}
class Trapizoid
{
public static void main(String[] args)
{
	Demo d=new Demo();
	d.area(5,5,10);
	}
}