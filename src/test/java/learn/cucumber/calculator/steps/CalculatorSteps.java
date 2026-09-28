package learn.cucumber.calculator.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import learn.cucumber.calculator.pages.CalculatorPage;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorSteps {
    private CalculatorPage page;
    private final ChromeDriver driver = new ChromeDriver();

    private String convertOperationStringValue(String operationValue) {
        return operationValue.isEmpty() ? "nothing" : operationValue;
    }

    @Before
    public void openCalculator() {
        this.page = new CalculatorPage(driver);
    }

    @When("I enter {string}")
    public void setNumber(String number) {
        this.page.enterNumber(number);
    }

    @When("I click {string} button")
    public void clickButton(String buttonSymbol) {
        this.page.clickButton(buttonSymbol);
    }

    @Then("I should see {string}")
    public void verifyDisplayValue(String expectedValue) {
        assertThat(this.page.getDisplayValue()).isEqualTo(expectedValue);
    }

    @Then("I should see {string} in the operation string")
    public void verifyOperationValue(String expectedValue) {
        assertThat(convertOperationStringValue(this.page.getOperationValue())).isEqualTo(expectedValue);
    }

    @After
    public void clean() {
        driver.quit();
    }
}
