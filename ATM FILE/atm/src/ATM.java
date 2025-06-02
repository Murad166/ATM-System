public class ATM {
    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void depositMoney(double amount) {
        account.deposit(amount);
        checkBalance();
    }

    public void withdrawMoney(double amount) {
        boolean success = account.withdraw(amount);
        if (success) {
            checkBalance();
        }
    }
}
