class Rectangle
{
	void area(int w,int h)
	{
	int result=w*h;
	System.out.println("The area of Rectangle is "+result);
}
public static void main(String[] args)
{
	Rectangle r=new Rectangle();
	r.area(5,10);
	}
}