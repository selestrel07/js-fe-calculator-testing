package learn.cucumber.calculator.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learn.cucumber.calculator.pages.CalculatorPage;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorSteps {
    private CalculatorPage page;
    private final ChromeDriver driver = new ChromeDriver();

    @Given("I open the calculator")
    public void openCalculator() {
        this.page = new CalculatorPage(driver);
    }

    @When("I enter {string}")
    public void setNumber(String number) {
        this.page.enterNumber(number);
    }

    @Then("I should see {string}")
    public void verifyDisplayValue(String expectedValue) {
        assertThat(this.page.getDisplayValue()).isEqualTo(expectedValue);
    }

    @After
    public void clean() {
        driver.quit();
    }
}
