class IcIcI_Bank
{
	private String pwd="Dinga";
	public String getpwd()
	{
		return pwd;
	}
	public void setpwd(String pwd)
	{
		this.pwd=pwd;
	}
}
class Customer
{
	public static void main(String[] args)
	{
		IcIcI_Bank atmcard=new IcIcI_Bank();
		String x=atmcard.getpwd();
		System.out.println(x);
		atmcard.setpwd("Dingi");
		System.out.println(atmcard.getpwd());
	}
}