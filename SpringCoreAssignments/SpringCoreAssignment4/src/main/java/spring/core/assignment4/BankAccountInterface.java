package spring.core.assignment4;

public interface BankAccountInterface {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
