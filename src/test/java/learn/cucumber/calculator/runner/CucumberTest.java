package learn.cucumber.calculator.runner;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("learn.cucumber.calculator")
@ConfigurationParameter(
        key = GLUE_PROPERTY_NAME,
        value = "learn.cucumber.calculator"
)
public class CucumberTest {
}
