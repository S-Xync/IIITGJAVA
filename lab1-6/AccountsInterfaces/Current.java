public class Current implements Account {
    int id;
    double balance;

    public Current(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String getAccountType() {
        return "Current Account";
    }

    @Override
    public double withdrawMoney(int amount) {
        this.balance-=amount;
        System.out.println("Transaction Complete");
        return this.balance;
    }

    @Override
    public double depositMoney(int amount) {
        this.balance+=amount;
        System.out.println("Transaction Complete");
        return this.balance;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Current{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
