interface Hospital
{
	void treat();
}
class Cardiology implements Hospital
{
	public void treat()
	{
		System.out.println("Cardiology");
	}
}
class Orthopedics implements Hospital
{
	public void treat()
	{
		System.out.println("Orthopedics");
	}
}
class Neurology implements Hospital
{
	public void treat()
	{
		System.out.println("Neurology");
	}
}
class Patient
{
	static void disease(Hospital h1)
	{
		h1.treat();
	}
}
class Hospital1
{
	public static void main(String[] arg)
	{
		Cardiology c1=new Cardiology();
		Orthopedics o1=new Orthopedics();
		Neurology n1=new Neurology();
		Patient.disease(c1);
		Patient.disease(o1);
		Patient.disease(n1);
	}
}