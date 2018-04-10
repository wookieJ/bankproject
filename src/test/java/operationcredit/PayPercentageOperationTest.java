package operationcredit;

import operations.CreditOperation;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import services.BankAccount;
import services.Credit;

public class PayPercentageOperationTest {

    static BankAccount bankAccount = null;
    static Credit credit = null;

    @BeforeClass
    static public void newBankAccountTest() {
        bankAccount = new BankAccount(1000, 0);
        credit = new Credit(bankAccount, 100, 0);
    }


    @Test
    public void payPercentageTest() {
        CreditOperation creditOperationTest = new CreditOperation();

        double balanceTest = credit.getBalance(); //stary balance
        double percentageTest = credit.getInterests(); // procent
        String descriptionTest = "JUnit Test";

        double payedTest = balanceTest * percentageTest; //suma o jaka powinien wzrosnac kredit
        creditOperationTest.payPercentage(credit, descriptionTest); //wywolanie operacji na pierwotnym kredycie za posrednictwem creditOperation

        Assert.assertEquals(balanceTest, credit.getBalance(), payedTest);
    }


}