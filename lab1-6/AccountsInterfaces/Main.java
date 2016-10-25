public class Main {

    public static void main(String[] args) {
	    Saving savingAccount=new Saving(1234,25000,0.03);
        double balance=savingAccount.addInterest();
        System.out.println(balance);
        System.out.println(savingAccount.getAccountType());
        System.out.println(savingAccount.getBalance());
        balance=savingAccount.withdrawMoney(19000);
        System.out.println(balance);
        balance=savingAccount.depositMoney(20000);
        System.out.println(balance);
        balance=savingAccount.withdrawMoney(21000);
        System.out.println(balance);
        System.out.println(savingAccount);
        System.out.println("**************");
        Current currentAccount=new Current(4321,100000);
        System.out.println(currentAccount.getAccountType());
        System.out.println(currentAccount.getBalance());
        balance=currentAccount.withdrawMoney(50000);
        System.out.println(balance);
        balance=currentAccount.depositMoney(25000);
        System.out.println(balance);
        System.out.println(currentAccount);


    }
}