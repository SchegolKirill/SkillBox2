package module6.HomeWork3;

import module6.HomeWork1.BankAccount;

abstract class Client {

    protected double money;
    private BankAccount bankAccount;

    public Client(double money){
        bankAccount = new BankAccount(money);
    }

    public BankAccount getBankAccount(){
        return bankAccount;
    }

    public double getAccountMoney(){
        return bankAccount.getMoney();
    }

    public void setAccountMoney(double money){
        bankAccount.setMoney(money);
    }

    public abstract void withdrawAccountMoney(double money);

    public abstract void depositAccountMoney(double money);

}
