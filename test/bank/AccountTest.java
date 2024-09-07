package bank;

import exception.AmountCantBeGreaterThanBalance;
import exception.DepositAmountCannotBeNegative;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTestTwo {

    @Test
    public void testThatAccountTwoIsCreatedAndBalanceIsZeroAtCreation(){
        AccountTwo accountTwo = new AccountTwo();
        accountTwo.createAccount("chidinma","obioma","2345");
        accountTwo.checkBalance();
        assertEquals(0,accountTwo.checkBalance());


    }
    @Test
    public void testThatAccountDeposit(){
        AccountTwo accountTwo = new AccountTwo();
        accountTwo.createAccount("chidinma","obioma","2345");
        accountTwo.deposit(3000);
        accountTwo.checkBalance();
        assertEquals(3000,accountTwo.checkBalance());
    }
    @Test
    public void testThatAmountCannotBeANegativeValue(){
        AccountTwo accountTwo = new AccountTwo();
        accountTwo.createAccount("chidinma","obioma","2345");
        accountTwo.checkBalance();
        accountTwo.deposit(3000);
        assertThrows(DepositAmountCannotBeNegative.class,()-> accountTwo.deposit(-5000));
    }
    @Test
    public void testThatWithdraw(){
        AccountTwo accountTwo = new AccountTwo();
        accountTwo.createAccount("chidinma","obioma","2345");
        accountTwo.deposit(3000);
        accountTwo.checkBalance();
        accountTwo.withdraw(1000,"2345");
        assertEquals(2000,accountTwo.checkBalance());
    }
    @Test
    public void testThatAmountToWithdrawShouldNotBeNegative(){
        AccountTwo accountTwo = new AccountTwo();
        accountTwo.createAccount("chidinma","obioma","2345");
        accountTwo.deposit(3000);
        accountTwo.checkBalance();
        assertThrows(AmountCantBeGreaterThanBalance.class,()-> accountTwo.withdraw(5000,"2345"));

    }
    @Test
    public void testThatAccountCanShowBalanceAfterTransaction(){
        AccountTwo accountTwo = new AccountTwo();
        accountTwo.createAccount("chidinma","obioma","2345");
        accountTwo.deposit(3000);
        accountTwo.checkBalance();
        accountTwo.withdraw(1000,"2345");
        accountTwo.checkBalance();
        assertEquals(2000,accountTwo.checkBalance());

    }
    @Test
    public void testThatAccountPinChangeChange(){
        AccountTwo accountTwo = new AccountTwo();
        accountTwo.createAccount("chidinma","obioma","2345");
        accountTwo.getPin("1234");
        accountTwo.deposit(3000);
        accountTwo.withdraw(1000, "1234");
        assertEquals(2000,accountTwo.checkBalance());


    }


}
