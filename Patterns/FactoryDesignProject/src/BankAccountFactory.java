
public class BankAccountFactory {
	public BankAccount createAccount(String type) {
        BankAccount bankAccount = null;
        if (type.equals("S") ) {
        	bankAccount = new SavingAccount();
        } else if (type.equals("C")) {
        	bankAccount = new CurrentAccount();
        } else { if (type.equals("s")) {
        	bankAccount = new SavingAccount();
        } else if (type.equals(" c")) {
            	bankAccount = new CurrentAccount();
        }
        else
            System.out.println("Invalid type");
        }
        return bankAccount;
    }
}



