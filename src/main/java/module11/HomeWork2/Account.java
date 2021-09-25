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
