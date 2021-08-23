package module6.HomeWork1;

public class Main {
    public static void main(String[] args) {

        System.out.println();

        BankAccount da = new DepositAccount(1000000.00);

        da.depositMoney(200.00);
        System.out.println(da.getMoney());

        da.withdrawMoney(123);
        System.out.println(da.getMoney());

        BankAccount ca = new CardAccount(1000000.00);

        ca.withdrawMoney(7200);
        System.out.println(ca.getMoney());
    }
}
