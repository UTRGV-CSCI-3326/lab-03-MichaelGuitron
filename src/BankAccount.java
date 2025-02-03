public class BankAccount {
    public static void main(String[] args) {
        // Initial balance
        double balance = 2175.37;
        
        // Transactions
        balance -= 302.50; // Withdrawal
        balance += 50.03;  // Deposit
        balance -= balance / 2; // Withdraw half
        balance += 20.00;  // Deposit
        balance -= 1.00;   // Withdrawal
        balance *= 2;      // Paycheck deposit (double balance)
        balance += 1.00;   // Deposit
        
        // Output final balance
        System.out.printf("Bob's new balance: $%.2f\n", balance);
    }
}
