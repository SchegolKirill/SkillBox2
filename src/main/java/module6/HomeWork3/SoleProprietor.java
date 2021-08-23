package module6.HomeWork3;

public class SoleProprietor extends Client{
    public SoleProprietor(double money) {
        super(money);
    }

    @Override
    public void withdrawAccountMoney(double withdrawedMoney) {
        getBankAccount().withdrawMoney(withdrawedMoney);
    }

    public void depositAccountMoney(double depositedMoney){
        if(money < 1000.00){
            getBankAccount().setMoney(getAccountMoney() + depositedMoney - (depositedMoney/100));
        }else{
            getBankAccount().setMoney(getAccountMoney() + depositedMoney - (depositedMoney/200));
        }
    }
}
