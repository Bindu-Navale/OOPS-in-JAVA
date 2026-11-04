import transaction.Account;
import reports.TransactionReport;
public class MainApp{
public static void main(String[] args){
Account acc= new Account(123,5000);
acc.deposit(2000);
acc.withdraw(1500);
TransactionReport rep=new TransactionReport();
rep.generateReport(acc);
}
}