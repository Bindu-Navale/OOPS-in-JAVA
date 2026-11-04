package reports;
import transaction.Account;
public class TransactionReport{
 public void generateReport(Account acc){
 System.out.println("\n---Transaction Report---");
 System.out.println("Account number: "+acc.getAccountNumber());
 System.out.println("Current balance: "+ acc.getBalance());
 }
}