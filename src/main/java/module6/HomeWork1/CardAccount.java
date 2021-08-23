package module6.HomeWork1;

public class CardAccount extends BankAccount{

    public CardAccount(double money){
        super(money);
    }

    @Override
    public void withdrawMoney(double withdrawedMoney) {
        this.money = this.money - withdrawedMoney - (withdrawedMoney/100);
    }
}
