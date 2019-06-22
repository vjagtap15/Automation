package arrays;

public class Program1 {

	public static void main(String[] args)
	{
		// Object keyword which is a super class of all classes which can store any datatype value
		
		Object[] arr= new Object[4];
		
		arr[0]=1;
		arr[1]="Name";
		arr[2]=true;
		arr[3]=3.45;
		
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
		
	}

}
