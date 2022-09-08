package model;

public class BankCustomer implements Runnable {
    private  BankAccount account ;

    public BankCustomer(BankAccount account) {
        this.account = account;
    }
   public void run()
   {
 for(int i=1; i<10;i++)
 {
     withrdaw(2000);
     if(account.getBalance()>=0){
         System.out.printf("\n Out of Cash");
     }
 }
   }

   private synchronized void withrdaw(int amount)
   {
      if(account.getBalance()>=amount)
      {
          System.out.printf("\n Customer Trying to withdraw amount");
      try
      {
          Thread.sleep(2000);
          account.setBalance(amount);
          System.out.printf("\n Customer Withraw :  "+amount + " Remain : " + account.getBalance());


      }catch (Exception e)
      {
          System.out.printf("\n Server Error Sorry");
      }

      }else
      {
          System.out.printf("\n our balance is Less than you request ");
      }
   }
}
