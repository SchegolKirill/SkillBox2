package module11.HomeWork2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account acc1 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc2 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc3 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc4 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc5 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc6 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc7 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc8 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc9 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        Account acc10 = new Account(String.valueOf(Math.round(Math.random() * 1000)),
                Math.round(Math.random() * 1000000));
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);
        bank.addAccount(acc4);
        bank.addAccount(acc5);
        bank.addAccount(acc6);
        bank.addAccount(acc7);
        bank.addAccount(acc8);
        bank.addAccount(acc9);
        bank.addAccount(acc10);

        System.out.println("В банке денег до запуска потоков: " + bank.getBankBalance());

        new Thread(()->{
            try {
                bank.transfer(acc1.getAccNumber(), acc2.getAccNumber(), (long) (Math.random() * 50000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                bank.transfer(acc3.getAccNumber(), acc4.getAccNumber(), (long) (Math.random() * 50000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                bank.transfer(acc5.getAccNumber(), acc6.getAccNumber(), (long) (Math.random() * 50000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                bank.transfer(acc7.getAccNumber(), acc8.getAccNumber(), (long) (Math.random() * 50000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try {
                bank.transfer(acc9.getAccNumber(), acc10.getAccNumber(), (long) (Math.random() * 500000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }
}
