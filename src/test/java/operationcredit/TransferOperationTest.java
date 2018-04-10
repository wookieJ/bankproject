package operationcredit;

import operations.CreditOperation;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import services.BankAccount;
import services.Credit;

public class TransferOperationTest {


    static BankAccount bankAccount = null;
    static Credit credit = null;

    @BeforeClass
    static public void newBankAccountTest() {
        bankAccount = new BankAccount(1000, 0);
        credit = new Credit(bankAccount, 100, 0);
    }

    @Test
    public void transferTest() {

        CreditOperation creditOperationTest = new CreditOperation();

        double balanceTest = credit.getBalance();
        String descriptionTest = "JUnit Test";
        double valueTest = 100.0;

        creditOperationTest.transfer(credit, valueTest, descriptionTest);

        Assert.assertEquals(credit.getBalance(), balanceTest, valueTest);

    }
}