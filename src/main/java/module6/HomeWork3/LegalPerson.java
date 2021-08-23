package module6.HomeWork3;

public class LegalPerson extends Client {

    public LegalPerson(double money) {
        super(money);
    }

    public void withdrawAccountMoney(double withrawedMoney){
        getBankAccount().setMoney(getAccountMoney() - withrawedMoney - (withrawedMoney/100));
    }

    @Override
    public void depositAccountMoney(double depositedMoney) {
        getBankAccount().depositMoney(depositedMoney);
    }
}
