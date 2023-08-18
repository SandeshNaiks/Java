class Mainclass69
{
	static void overload(A a)
	{
		System.out.println("one");
	}
	static void overload(B b)
	{
		System.out.println("two");
	}
	static void overload(Object obj)
	{
		System.out.println("three");
	}
	public static void main(String[] args)
	{
		C c=new C();
		overload(c);
	}
}
class A
{

}
class B extends A
{

}
class C extends B
{

}