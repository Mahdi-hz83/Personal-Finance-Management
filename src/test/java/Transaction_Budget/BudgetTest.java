package Transaction_Budget;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BudgetTest {
    private Budget budget;

    @Before
    public void setUp() {
        this.budget = new Budget("Foods" , 250.0);
    }

    @Test
    public void testBudgetCreation(){
        assertEquals("Foods" , budget.getCategory());
        assertEquals(250.0 , budget.getLimit());
        assertEquals(0.0 , budget.getSpent());
    }

    @Test
    public void testAddExpensePositive(){
        budget.addExpense(50.0);
        assertEquals(50.0 , budget.getSpent());
        assertFalse(budget.isOverBudget());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddExpenseNegative(){
        budget.addExpense(-50.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOverBudget(){
        budget.addExpense(350.0);
        assertTrue(budget.isOverBudget());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddExpenseOverThanLimit(){
        budget.addExpense(550.0);
    }
}