package Entites;

public class AccountSilver extends AccountSimple {
	protected Double cardCreditLimit;	
	public AccountSilver(String numberAccount, Double balance) {
		super(numberAccount, balance);
		cardCredit = true;
		cardCreditLimit = 600.0;
	}
	public Double getCardCreditLimit () {
		return this.cardCreditLimit;
	}
	public void debitCardCredit(Double debit) {
		cardCreditLimit -= debit;
	}
	public void payCardCredit(Double pay) {
		cardCreditLimit += pay;
	}
}
