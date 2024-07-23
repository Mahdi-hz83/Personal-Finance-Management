package User_Account;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @Before
    public void setUp() {
        this.account = new Account("Test" , 1000.0);
    }

    @Test
    public void testAccountCreation() {
        Account account = new Account("Checking", 1000.0);
        assertEquals("Checking", account.getAccountName());
        assertEquals(1000.0, account.getBalance());
    }

    @Test
    public void testDepositPositive(){
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegative(){
        account.deposit(-500.0);
    }

    @Test
    public void testWithdrawPositive(){
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawNegative(){
        account.withdraw(-500.0);
    }
}