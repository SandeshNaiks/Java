class Demo
{
	double area(int b,int h)
	{
	double result=0.5*b*h;
	return result;
	}
}
class Triangle
{
public static void main(String[] args)
{
	Demo d=new Demo();
	double y=d.area(30,5);
		System.out.println(y);
	}
}