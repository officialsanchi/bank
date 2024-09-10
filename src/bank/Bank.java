package bank;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private int totalNumberOfAccount;


    public Account createAccount(String accountName, String accountPin) {
        String accountNumber = accountNUmberGenerator();
        Account account = new Account();
        accounts.add(account);
        return account;
    }

    private String accountNUmberGenerator() {
        totalNumberOfAccount+=1;
        return"222333444"+totalNumberOfAccount;
    }

    private Account AccountNumberValidator(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public String deposit(String accountNumber, double amount) {
        Account foundAccountNumber = AccountNumberValidator(accountNumber);
        if (foundAccountNumber!=null) {
            foundAccountNumber.deposit(amount);
            return String.format("Deposit of $ %.2f successful !!!" , amount);
        }
        return "account not found";
    }

    public String transfer(String sendersAccount, String receiversAccount, double amount,String pin) {
        Account senderAccount = AccountNumberValidator(sendersAccount);
        if (senderAccount!=null) {
            Account receiverAccount = AccountNumberValidator(receiversAccount);
            if (receiverAccount!=null) {
                senderAccount.withdraw(amount,pin);
                receiverAccount.deposit(amount);
            }else return "account with "+ receiversAccount +" not found";

        }
        return "account with "+ sendersAccount +" not found";
    }

    public int getTotalNumberOfAccount(){
        return totalNumberOfAccount;
}



}