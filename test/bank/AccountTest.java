package bank;

import exception.AmountCantBeGreaterThanBalance;
import exception.DepositAmountCannotBeNegative;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void testThatAccountTwoIsCreatedAndBalanceIsZeroAtCreation(){
        Account account = new Account();
        account.createAccount("chidinma","obioma","2345");
        account.checkBalance();
        assertEquals(0,account.checkBalance());


    }
    @Test
    public void testThatAccountDeposit(){
        Account account = new Account();
        account.createAccount("chidinma","obioma","2345");
        account.deposit(3000);
        account.checkBalance();
        assertEquals(3000,account.checkBalance());
    }
    @Test
    public void testThatAmountCannotBeANegativeValue(){
        Account account = new Account();
        account.createAccount("chidinma","obioma","2345");
        account.checkBalance();
        account.deposit(3000);
        assertThrows(DepositAmountCannotBeNegative.class,()-> account.deposit(-5000));
    }
    @Test
    public void testThatWithdraw(){
        Account account = new Account();
        account.createAccount("chidinma","obioma","2345");
        account.deposit(3000);
        account.checkBalance();
        account.withdraw(1000,"2345");
        assertEquals(2000,account.checkBalance());
    }
    @Test
    public void testThatAmountToWithdrawShouldNotBeNegative(){
        Account account = new Account();
        account.createAccount("chidinma","obioma","2345");
        account.deposit(3000);
        account.checkBalance();
        assertThrows(AmountCantBeGreaterThanBalance.class,()-> account.withdraw(5000,"2345"));

    }
    @Test
    public void testThatAccountCanShowBalanceAfterTransaction(){
        Account account = new Account();
        account.createAccount("chidinma","obioma","2345");
        account.deposit(3000);
        account.checkBalance();
        account.withdraw(1000,"2345");
        account.checkBalance();
        assertEquals(2000,account.checkBalance());

    }
    @Test
    public void testThatAccountPinChangeChange(){
        Account account = new Account();
        account.createAccount("chidinma","obioma","2345");
        account.getPin("1234");
        account.deposit(3000);
        account.withdraw(1000, "1234");
        assertEquals(2000,account.checkBalance());
    }
}
