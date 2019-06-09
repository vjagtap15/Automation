package oopspolymorfisum;

public class Function
{	
	//Method Overloading - making changes in number of parameters and there type
	
	public int sum(int a , int b)
	{
		return a+b;
	}

	public int sum(int a , int b , int c)
	{
		return a+b+c;
	}
	
	public String sum(int a, String b)
	{
		return a+b;
	}
	
	public Function getIntance()
	{
		return new Function();
	}
	
}
