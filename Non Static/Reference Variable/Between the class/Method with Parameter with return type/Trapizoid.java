class Demo
{
	double area(int a,int b,int h)
	{
	double result=0.5*a+b*h;
	return result;
	}
}
class Trapizoid
{
public static void main(String[] args)
{
	Demo d=new Demo();
	double y=d.area(5,5,10);
		System.out.println(y);
	}
}