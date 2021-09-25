package module11.HomeWork2;

import java.util.HashMap;
import java.util.Random;

public class Bank
{
    private HashMap<String, Account> accounts;
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
        while(amount <= 50000 && !isFraud(fromAccountNum, toAccountNum, amount)) {
            long plusMoney = accounts.get(toAccountNum).getMoney() + amount;
            long minusMoney = accounts.get(fromAccountNum).getMoney() - amount;

            accounts.get(toAccountNum).setMoney(plusMoney);
            accounts.get(fromAccountNum).setMoney(minusMoney);
        }
        System.out.println("Счета заблокированы");
    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum){
        return accounts.get(accountNum).getMoney();
    }

}
