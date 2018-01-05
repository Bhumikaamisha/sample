import Linearframework.Hooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Signin_Stepdef extends Hooks {
    @And("^user enters data in the sign in form with email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEntersDataInTheSignInFormWithEmailAndPassword(String email1, String password1) throws Throwable {
        driver.findElement(By.name("email")).sendKeys(email1);
        driver.findElement(By.name("password")).sendKeys(password1);
        //Thread.sleep(3000);

    }

    @And("^user clicks on signInSubmit$")
    public void userClicksOnSignInSubmit() throws Throwable {
        driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();


    }

    @Then("^user should be landed on page with message \"([^\"]*)\"$")
    public void userShouldBeLandedOnPageWithText(String text) throws Throwable {
        System.out.println("trying to signin");
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
        System.out.println("signed in successfully");
    }
}