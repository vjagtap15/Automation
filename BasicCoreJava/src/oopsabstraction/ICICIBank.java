package oopsabstraction;

public class ICICIBank implements RBI{

	@Override
	public void SavingAccount() {
		System.out.println("ICICIBank Saving Account");
		
	}

	@Override
	public void CreditCard() {
		System.out.println("ICICIBank Credit Card");
		
	}

	@Override
	public void DebitCard() {
		System.out.println("ICICIBank Debit Card");
		
	}

	@Override
	public void NetBaking() {
		System.out.println("ICICIBank Net Banking");
		
	}

}
