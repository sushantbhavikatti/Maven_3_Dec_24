package TestNG.basicoftestng;


import org.testng.annotations.Test;

public class TestNGInvocation {

    @Test(invocationCount = 50000, invocationTimeOut = 2)
    public void repeatingTestCaseExample() {
        System.out.println("Repeating Test Case Example");
    }
}
