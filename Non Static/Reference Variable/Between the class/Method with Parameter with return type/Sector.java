class Demo
{
	double area(int r,int t)
	{
	double result=0.5*r*r*t;
	return result;
	}
}
class Sector
{
public static void main(String[] args)
{
	Demo d=new Demo();
	double y=d.area(5,615);
	System.out.println(y);
	}
}