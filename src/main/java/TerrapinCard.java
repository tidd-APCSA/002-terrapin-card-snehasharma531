public class TerrapinCard {
    private double balance;

  public TerrapinCard(double balanceAtStart){
    balance = balanceAtStart;
  }
  public void payEconomical(){
    if(balance >= 2.5){
    balance -= 2.50;
  }else{
    balance = balance;
  }
  }
  public void payGourmet(){
    if(balance >= 4.0){
    balance -= 4.00;
  }else{
    balance = balance;
  }
  }
  public void loadMoney(double amount){
    if(balance <=150.0 & amount > 0){
      balance += amount;
    if(balance > 150.0){
      balance = 150.0;
    }}else{
      balance = balance;
    }
  }
  public double getBalance(){
    return balance;
  }
  public String toString(){
    return "The card has " + balance + " dollars";
  }

}
