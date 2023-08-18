class Byte
{
	public static void main(String[] args)
	{
		byte[] arr=new byte[5];
		arr[0]=6;
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		arr[4]=5;
		System.out.println("values \t index");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" \t "+i);
		}
	}
}