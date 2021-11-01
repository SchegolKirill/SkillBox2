package module11.HomeWork2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Bank
{
    private final HashMap<String, Account> accounts = new HashMap<>();
    private final Random random = new Random();
    private long bankMoney;

    public HashMap<String, Account> getAccounts(){
        return accounts;
}

    public void addAccount(Account account){
        accounts.put(account.getAccNumber(), account);
    }


    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
            throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами.
     * Если сумма транзакции > 50000, то после совершения транзакции,
     * она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка
     * счетов (как – на ваше усмотрение)
     */
    public synchronized void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        if (amount <= 50000) {
            System.out.println(
                    "До перевод у " + toAccountNum + " " + accounts.get(toAccountNum).getMoney() + " на счету\n" +
                    "До перевод у " + fromAccountNum + " " + accounts.get(fromAccountNum).getMoney() + " на счету");
            long plusMoney = accounts.get(toAccountNum).getMoney() + amount;
            long minusMoney = accounts.get(fromAccountNum).getMoney() - amount;

            accounts.get(toAccountNum).setMoney(plusMoney);
            accounts.get(fromAccountNum).setMoney(minusMoney);
            System.out.println("Сумма перевода: " + amount + "\n" +
                    "У " + toAccountNum + " " + accounts.get(toAccountNum).getMoney() + " на счету\n" +
                    "У " + fromAccountNum + " " + accounts.get(fromAccountNum).getMoney() + " на счету");
        }else{
            boolean ban = isFraud(fromAccountNum, toAccountNum, amount);
            if(ban){
                System.out.println("Счета заблокированы");
                wait();
            }else{
                System.out.println(
                        "До перевод у " + toAccountNum + " " + accounts.get(toAccountNum).getMoney() + " на счету\n" +
                                "До перевод у " + fromAccountNum + " " + accounts.get(fromAccountNum).getMoney() + " на счету");
                long plusMoney = accounts.get(toAccountNum).getMoney() + amount;
                long minusMoney = accounts.get(fromAccountNum).getMoney() - amount;

                accounts.get(toAccountNum).setMoney(plusMoney);
                accounts.get(fromAccountNum).setMoney(minusMoney);
                System.out.println("У " + toAccountNum + " " + accounts.get(toAccountNum).getMoney() + " на счету");
                System.out.println("У " + fromAccountNum + " " + accounts.get(fromAccountNum).getMoney() + " на счету");
            }
        }
        System.out.println("В банке денег после запуска потока: " + this.getBankBalance());
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum){
        return accounts.get(accountNum).getMoney();
    }

    public long getBankBalance(){
        bankMoney = 0;
        for(Map.Entry<String, Account> mapEntry : accounts.entrySet()){
            bankMoney += mapEntry.getValue().getMoney();
        }
        return bankMoney;
    }
}
