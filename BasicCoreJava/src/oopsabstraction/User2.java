package oopsabstraction;

public class User2 {

	public static void main(String[] args) 
	{
		RBI acc = bankFeature("Axis");
		acc.CreditCard();
		acc.DebitCard();
		acc.SavingAccount();
		acc.NetBaking();
		acc.demonitization(); // default methods
		
		SC.RBIGuidLines(); // static methods can be called using interface name

	}

	public static RBI bankFeature(String bankname)
	{
		RBI acc=null;
		
		if(bankname.equals("HDFC"))
			{
				acc=new HDFCBank();
			} 
		else if(bankname.equals("ICICI"))
			{
				acc=new ICICIBank();
			}
		else if(bankname.equals("Axis"))
			{
				acc=new AxisBank();
			}
			return acc;
	}
}
