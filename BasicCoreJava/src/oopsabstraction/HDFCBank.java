package oopsabstraction;

public class HDFCBank implements RBI{
	@Override
	public void SavingAccount() {
		System.out.println("HDFCBank Saving Account");
		
	}

	@Override
	public void CreditCard() {
		System.out.println("HDFCBank Credit Card");
		
	}

	@Override
	public void DebitCard() {
		System.out.println("HDFCBank Debit Card");
		
	}

	@Override
	public void NetBaking() {
		System.out.println("HDFCBank Net Banking");
		
	}
	

}
