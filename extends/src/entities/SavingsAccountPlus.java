package entities;

public class SavingsAccountPlus extends SavingsAccount {
	
	// Final method and can't be override again.
	@Override
	public final void withdrawn(double amount) {
		balance -= amount + 2.0;
	}
}
