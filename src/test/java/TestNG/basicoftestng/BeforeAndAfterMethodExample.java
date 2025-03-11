package TestNG.basicoftestng;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodExample {

    public void setup() {
        System.out.println("Before Method");
    }

    @Test
    public void testCase1() {
        System.out.println("Test Case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test Case 2");
    }

    @Test
    public void testCase3() {
        System.out.println("Test Case 3");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Method Close");
    }

    @BeforeClass
    public void beforeClassExample() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassExample() {
        System.out.println("After Class");
    }
}
