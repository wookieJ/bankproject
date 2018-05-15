package operations;

import org.junit.BeforeClass;
import services.BankAccount;
import services.Deposit;


public class DepositOperationTest {

    static BankAccount bankAccount = null;
    static Deposit deposit = null;

    @BeforeClass
    static public void newBankAccountTest() {
        bankAccount = new BankAccount(1000, 0);
        deposit = new Deposit(bankAccount, 100, 0);
    }

//    @Test
//    public void createDepositTest() {
//        DepositOperation depositOperationTest = new DepositOperation();
//        double balanceTest = bankAccount.getBalance();
//        int ownerIdTest = bankAccount.getOwnerId();
//
//        String descriptionTest = "JUnit Test";
//
//        Deposit newDepositTest = depositOperationTest.createDeposit(bankAccount, balanceTest, ownerIdTest, descriptionTest);
//        Assert.assertNotNull(newDepositTest);
//
//    }
//
//    @Test
//    public void changePercentageTest() {
//        DepositOperation depositOperationTest = new DepositOperation();
//        InterestsMechanism newPercentageTest = bankAccount.getInterestsMechanism();
//        String descriptionTest = "JUnit Test";
//
//        depositOperationTest.changePercentage(deposit, newPercentageTest, descriptionTest);
//
//        Assert.assertEquals(newPercentageTest, deposit.getInterestsMechanism());
//
//    }
//
//
//
//    @Test
//    public void solveDepositTest()
//    {
//        DepositOperation depositOperationTest = new DepositOperation();
//        double percentageTest = deposit.getInterests();
//        double balanceTest = deposit.getBalance();
//        double accountBalanceTest = bankAccount.getBalance();
//        String descriptionTest = "JUnit Test";
//
//        double paymentTest = percentageTest*balanceTest+balanceTest;
//
//        depositOperationTest.solveDeposit(deposit, descriptionTest);
//
//        Assert.assertEquals(bankAccount.getBalance(), accountBalanceTest, paymentTest);
//    }
//
//    @Test
//    public void breakUpDepositTest()
//    {
//        DepositOperation depositOperationTest = new DepositOperation();
//        double balanceTest = deposit.getBalance();
//        double accountBalanceTest = bankAccount.getBalance();
//        String descriptionTest = "JUnit Test";
//
//        depositOperationTest.breakUpDeposit(deposit, descriptionTest);
//
//        Assert.assertEquals(bankAccount.getBalance(), accountBalanceTest, balanceTest);
//    }


}
