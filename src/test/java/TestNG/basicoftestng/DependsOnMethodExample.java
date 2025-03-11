package TestNG.basicoftestng;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void loginfunctionality() {
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "loginfunctionality")
    public void verifyHomePage() {
        System.out.println("Home Page Validation");
    }

    @Test
    public void onboarding() {
        System.out.println("Onboarding");
    }

}
