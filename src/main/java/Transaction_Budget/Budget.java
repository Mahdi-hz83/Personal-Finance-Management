package Transaction_Budget;

public class Budget {
    private String category;
    private double limit;
    private double spent;

    public Budget(String category, double limit) {
        this.category = category;
        this.limit = limit;
        this.spent = 0;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getSpent() {
        return spent;
    }

    public void setSpent(double spent) {
        this.spent = spent;
    }

    public void addExpense(double amount) {
        if (amount > 0) {
            if (amount + spent < limit){
                spent += amount;
            } else{
                throw new IllegalArgumentException("Amount exceeds limit");
            }
        }
        else{
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }

    public boolean isOverBudget() {
        return spent > limit;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "category='" + getCategory() + '\'' +
                ", limit=" + getLimit() +
                ", spent=" + getSpent() +
                '}';
    }

}
