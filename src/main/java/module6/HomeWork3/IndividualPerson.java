package module6.HomeWork3;

public class IndividualPerson extends Client{

    public IndividualPerson(double money) {
        super(money);
    }

    @Override
    public void withdrawAccountMoney(double withdrawedMoney) {
        getBankAccount().withdrawMoney(withdrawedMoney);
    }

    @Override
    public void depositAccountMoney(double depositedMoney) {
        getBankAccount().depositMoney(depositedMoney);
    }
}
