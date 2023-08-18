interface Animal
{
	void noise();
}
class Dog implements Animal
{
	public void noise()
	{
		System.out.println("Bow Bow");
	}
}
class Cat implements Animal
{
	public void noise()
	{
		System.out.println("Meow Meow");
	}
}
class Snake implements Animal
{
	public void noise()
	{
		System.out.println("Hisss Hisss");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
class Animal1
{
	public static void main(String[] arg)
	{
		Dog d1=new Dog();
		Cat c1=new Cat();
		Snake s1=new Snake();
		Stimulator.ansim(d1);
		Stimulator.ansim(c1);
		Stimulator.ansim(s1);
	}
}