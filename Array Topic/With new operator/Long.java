class Long
{
	public static void main(String[] args)
	{
		long[] arr=new long[5];
		arr[0]=10123;
		arr[1]=23120;
		arr[2]=32320;
		arr[3]=44320;
		arr[4]=50323;
		System.out.println("values \t index");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" \t "+i);
		}
	}
}