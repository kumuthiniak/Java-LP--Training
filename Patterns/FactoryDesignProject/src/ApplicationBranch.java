import java.util.Scanner;

public class ApplicationBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount bankAccount = null;
        BankAccountFactory bankAccountFactory = new BankAccountFactory();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Factory Design Outputs" );
         System.out.println("Please enter\n" +
            " S for Saving account\n" +
            " C for Current account\n");
        
         String accountType = in .nextLine();
        bankAccount = bankAccountFactory.createAccount(accountType);
        bankAccount.registerAccount();;

	}

}
