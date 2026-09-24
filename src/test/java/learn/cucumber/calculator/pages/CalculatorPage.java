package learn.cucumber.calculator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;

public class CalculatorPage {

    private final WebDriver driver;
    private final Map<String, WebElement> elements = new HashMap<>();

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://selestrel07.github.io/js-fe-calculator/");
        Map<String, By> locators = Map.ofEntries(
                entry("0", By.className("zero")),
                entry("1", By.className("one")),
                entry("2", By.className("two")),
                entry("3", By.className("three")),
                entry("4", By.className("four")),
                entry("5", By.className("five")),
                entry("6", By.className("six")),
                entry("7", By.className("seven")),
                entry("8", By.className("eight")),
                entry("9", By.className("nine")),
                entry("display", By.className("current-value"))
        );
        locators.forEach((k, v) -> this.elements.put(k, this.driver.findElement(v)));
    }

    public void clickNumberButton(String number) {
        this.elements.get(number).click();
    }

    public void enterNumber(String number) {
        Arrays.stream(number.split("")).forEach(this::clickNumberButton);
    }

    public String getDisplayValue() {
        return this.elements.get("display").getText();
    }
}
