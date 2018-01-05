import Linearframework.Hooks;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Register_Stepdef extends Hooks {
    @Given("^User is in homepage$")
    public void userIsInHomepage() throws Throwable {
        driver.get("https://www.amazon.co.uk/");
    }

    @When("^user clicks on \"([^\"]*)\" link$")
    public void userClicksOnLink(String link) throws Throwable {
    System.out.println("Print the first link :"+link);
    driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/div/a[1]/span[1]")).click();

    }
    @And("^clicks on \"([^\"]*)\" link$")
    public void clicksOnLink(String link2) throws Throwable {
        System.out.println("Print the second link:"+link2);
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/span/span/a")).click();
    }
    @And("^user enters data in the create account form with your name \"([^\"]*)\" and email \"([^\"]*)\" and password \"([^\"]*)\"and reenter password \"([^\"]*)\"$")
    public void userEntersDataInTheCreateAccountFormWithYourNameAndEmailAndPasswordAndReenterPassword(String name, String email, String password, String cpassword) throws Throwable {
        driver.findElement(By.name("customerName")).sendKeys(name);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("passwordCheck")).sendKeys(cpassword);
        System.out.println("print filling the form");

    }
    @And("^user clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String arg0) throws Throwable {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div/form/div/div/div[4]/span/span/input")).click();
        System.out.println("print clicked on create you account button");
    }

    @Then("^user should be landed on page with text \"([^\"]*)\"$")
    public void userShouldBeLandedOnPageWithText(String text) throws Throwable {
        System.out.println("trying to signin");
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
        System.out.println("signed in successfully");
    }
    }

