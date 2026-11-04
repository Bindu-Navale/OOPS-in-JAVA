package transaction;
public class Account{
int accNum;double bal;
public Account(int accNum,double bal){
this.accNum= accNum;
this.bal=bal;
}
public void deposit(double amount){
bal+=amount;
System.out.println("Deposited"+ amount);
}
public void withdraw(double amount){
if (amount<=bal){
bal-=amount;
System.out. println("Withdrawn: "+ amount);
}
else {
System.out.println("Insufficient Balance");
}
}
public double getBalance(){
return bal;
}
public int getAccountNumber(){
return accNum;
}
}