package module6.HomeWork1;


import java.time.LocalDateTime;


public class DepositAccount extends BankAccount{
    LocalDateTime withdrawDate;
    LocalDateTime depositDate;

    public DepositAccount(double money){
        super(money);
    }

    public void withdrawMoney(double withdrawedMoney) {
        withdrawDate = LocalDateTime.now();
        if ((withdrawDate == depositDate.plusMonths(1))) {
            this.money = this.money - withdrawedMoney;
        }else{
            System.out.println("Средства снять невозможно");
        }
    }
    @Override
    public void depositMoney (double depositedMoney)  {
        depositDate = LocalDateTime.now();
        this.money = this.money + depositedMoney;
    }
}
