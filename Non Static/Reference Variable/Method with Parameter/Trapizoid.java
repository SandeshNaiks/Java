class Trapizoid
{
	void area(int a,int b,int h)
	{
	double result=0.5*a+b*h;
	System.out.println("The area of trapizoid is "+result);
}
public static void main(String[] args)
{
	Trapizoid t=new Trapizoid();
	t.area(5,10,15);
	}
}