package operationdeposit;

import interests.InterestA;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import services.BankAccount;
import services.Deposit;

public class SolveDepositOperationTest {

    static BankAccount bankAccount = null;
    static Deposit deposit = null;

    @BeforeClass
    static public void newBankAccountTest() {
        bankAccount = new BankAccount(1000, 0, new InterestA());
        deposit = new Deposit(bankAccount, 100, 0, 1, new InterestA());
    }


    @Test
    public void solveDepositTest() {

        String descriptionTest = "JUnit Test";

        SolveDepositOperation solveDepositOperationTest = new SolveDepositOperation(deposit, descriptionTest);

        double percentageTest = deposit.getInterests();
        double balanceTest = deposit.getBalance();

        double accountAfterSolving = bankAccount.getBalance() + (percentageTest + balanceTest);

        solveDepositOperationTest.execute();

        Assert.assertEquals(bankAccount.getBalance(), accountAfterSolving, 0.01);
    }
}
