package bank;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Bank bank = new Bank();

    @Test
    public void testThatWhenAUSerCreateAccountTotalNumberOfAccountEqualsOne(){
        String name = "python Chibuzo";
        String pin = "pin";
        bank.createAccount(name, pin);
        assertEquals(1,bank.getTotalNumberOfAccount());
    }


    @Test
    public void testThatWhenTwoUsersCreateAccountTotalNumberOfAccountEqualsTwo(){
        Account account = bank.createAccount("python","pin1");
        System.out.println(account);
        Account acc = bank.createAccount("java","pin2");
        System.out.println(account);
        assertEquals(2,bank.getTotalNumberOfAccount());
}
@Test
    public void testThatAccountCanDepositMoneyFromOneAccountToAnotherAccount(){
        Account account = new Account();
        account.deposit(1000);




}


}