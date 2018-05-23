package services;


import reports.Report;
import reports.ReportBalance;

public class Credit extends ConnectedAccount {

    public Credit(Product bankAccount, int ownerId) {
        super(bankAccount, ownerId);
        canBeNegative = true;
    }

    public Credit(Product bankAccount, double balance, int ownerId) {
        super(bankAccount, balance, ownerId);
        canBeNegative = true;
    }

    /**
     * Increasing balance
     *
     * @param value value added to balance
     * @return feedback of the success of the operation
     */
    @Override
    public boolean increaseBalance(double value) {
        if (balance + value > 0)
            return false;
        balance += value;
        return true;
    }

    @Override
    public void accept(Report report)
    {
        report.visit(this);
    }
}
