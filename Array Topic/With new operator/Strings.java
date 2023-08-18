class Strings
{
	public static void main(String[] args)
	{
		String[] arr=new String[5];
		arr[0]="Hi";
		arr[1]="Hey";
		arr[2]="Hello";
		arr[3]="Hola";
		arr[4]="Bye";
		System.out.println("values \t index");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" \t "+i);
		}
	}
}