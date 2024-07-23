package Report;

import Transaction_Budget.Budget;
import Transaction_Budget.Transaction;
import User_Account.Account;

import java.util.List;

public class Reports {
    public static void generateAccountReport(List<Account> accounts) {
        System.out.println("Account Report: ");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void generateTransactionReport(List<Transaction> transactions) {
        System.out.println("Transaction Report:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public static void generateBudgetReport(List<Budget> budgets) {
        System.out.println("Budget Report:");
        for (Budget budget : budgets) {
            System.out.println(budget);
            if (budget.isOverBudget()) {
                System.out.println("Warning: Over budget for category " + budget.getCategory());
            }
        }
    }
}
