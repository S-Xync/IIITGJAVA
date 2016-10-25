public interface Account {
    String getAccountType();
    double withdrawMoney(int amount);
    double depositMoney(int amount);
    double getBalance();
}