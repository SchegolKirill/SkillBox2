package module11.HomeWork2;

import java.util.Random;

public class Account implements Comparable<Account>
{
    private long money;
    private String accNumber;
    private Random random;

    public Account(String accNumber, long money){
        this.accNumber = accNumber;
        this.money = money;
//        accNumber = String.valueOf(Math.round(Math.random() * 1000));
//        money = Math.round(Math.random() * 1000000);
    }

    public long getMoney(){
        return money;
    }

    public void setMoney(long money){
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }

    @Override
    public int compareTo(Account o) {
        return this.getAccNumber().compareTo(o.getAccNumber());
    }
}
