package module6.HomeWork3;

public class Main {
    public static void main(String[] args) {
        Client individualPerson= new IndividualPerson(10000.00);
        individualPerson.getBankAccount().withdrawMoney(1500);
        System.out.println(individualPerson.getAccountMoney());

        Client legalPerson = new LegalPerson(1000000.00);
        legalPerson.withdrawAccountMoney(1000);
        System.out.println(legalPerson.getAccountMoney());

        Client soleProprietor = new SoleProprietor(1000000.00);
        soleProprietor.depositAccountMoney(150000.00);
        soleProprietor.withdrawAccountMoney(90000.00);
        System.out.println(soleProprietor.getAccountMoney());
    }
}
