abstract class Sample1
{
	abstract void disp();
	abstract void test();
}
abstract class Demo extends Sample
{
	void disp()
	{
	System.out.println("Hi");
	}
}
class Tester extends Demo
{
	void test()
	{
	System.out.println("Hey");
	}
	public static void main(String[] args)
	{
		Tester t1=new Tester();
		t1.disp();
		t1.test();
	}
}