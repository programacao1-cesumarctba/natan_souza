package entities;

// Can't be extended by other class case:
// public final class SavingsAccount extends Account {
public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRating) {
		super(number, holder, balance);
		this.interestRate = interestRating;
	}

	public Double getInterestRating() {
		return interestRate;
	}

	public void setInterestRating(Double interestRating) {
		this.interestRate = interestRating;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdrawn(double amount) {
		balance -= amount;
	}
}
