package Transaction_Budget;

import java.time.LocalDate;

public class Transaction {
    private LocalDate transactionDate;
    private double amount;
    private String description;
    private String category;

    public Transaction(LocalDate transactionDate, double amount, String description, String category) {
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.description = description;
        this.category = category;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + getTransactionDate() +
                ", amount=" + getAmount() +
                ", description='" + getDescription() + '\'' +
                ", category='" + getCategory() + '\'' +
                '}';
    }
}
