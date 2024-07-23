package Transaction_Budget;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {
    private Transaction txn;
    private LocalDate date;

    @Before
    public void setUp() {
        this.date = LocalDate.now();
        this.txn = new Transaction(date, 100.0, "Dinner", "Food");
    }

    @Test
    public void testTransactionCreation() {
        assertEquals(date, txn.getTransactionDate());
        assertEquals(100.0, txn.getAmount());
        assertEquals("Dinner", txn.getDescription());
        assertEquals("Food", txn.getCategory());
    }

    @Test
    public void testTransactionModification() {
        txn.setAmount(200.0);
        txn.setDescription("Lunch");
        txn.setCategory("Meals");

        assertEquals(200.0, txn.getAmount());
        assertEquals("Lunch", txn.getDescription());
        assertEquals("Meals", txn.getCategory());
    }
}