package module6.HomeWork1;



public class BankAccount {
    protected double money;

    public BankAccount(double money){
        this.money = money;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public double getMoney(){
        return money;
    }

    public void withdrawMoney(double withdrawedMoney){
        this.money = this.money - withdrawedMoney;
    }

    public void depositMoney(double depositedMoney){
         this.money = this.money + depositedMoney;
    }


}
