public class ATMTest {
    public static void main(String[] args) {
        Account myAccount = new Account("123456", "John Doe", 1000.00);
        ATM atm = new ATM(myAccount);

        atm.checkBalance();
        atm.depositMoney(500.0);
        atm.withdrawMoney(200.0);
        atm.withdrawMoney(1500.0); // Should print insufficient funds
    }
}
