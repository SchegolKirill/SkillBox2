package module9.homework3;

import com.opencsv.bean.CsvBindByName;

public class Line {
    //private String Типсчёта, Номерсчета, Валюта, Датаоперации, Референспроводки, Описаниеоперации, Приход, Расход;
    @CsvBindByName (column = "Тип счёта", required = true)
    private String accountType;
    @CsvBindByName (column = "Номер счета", required = true)
    private String accountNumber;
    @CsvBindByName (column = "Валюта", required = true)
    private String currency;
    @CsvBindByName (column = "Дата операции", required = true)
    private String transactionDate;
    @CsvBindByName (column = "Референс проводки", required = true)
    private String transactionReference;
    @CsvBindByName (column = "Описание операции", required = true)
    private String transactionDescription;
    @CsvBindByName (column = "Приход", required = true)
    private String receipt;
    @CsvBindByName (column = "Расход", required = true)
    private String expense;

    public String toString(){
        return transactionDescription + " " + receipt + " " + expense;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setExpense(String expense){
        this.expense = expense;
    }

    public String getExpense() {
        return expense;
    }
}
