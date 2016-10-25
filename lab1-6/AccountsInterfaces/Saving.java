public class Saving implements Account{
    int id;
    double balance;
    double interestRate;
    double limit;

    public Saving(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
        this.limit=20000;
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }

    @Override
    public double withdrawMoney(int amount) {
        if (amount<=this.limit){
            this.balance-=amount;
            System.out.println("Transaction Complete");
            return this.balance;
        }
        else {
            System.out.println("Your input amount exceeded transaction limit which is 20,000$");
            return this.balance;
        }
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
    public double addInterest(){
        this.balance=this.balance+(this.interestRate*this.balance);
        return this.balance;
    }

    @Override
    public String toString() {
        return "Saving{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
