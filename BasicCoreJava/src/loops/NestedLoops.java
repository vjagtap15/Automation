package loops;

public class NestedLoops {
	public static void main(String[] args) 
	{
		int j = 2;
		
		for(int r=1; r<=j; r++)
		{
			for(int c=0; c<=1; c++)
			{
				System.out.println("Row num="+r+" col num="+c);
			}
		}
	
	}
}
