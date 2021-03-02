package TanCucumberTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import general.*;
import tangent.*;
import java.text.DecimalFormat;

/***
*Test Tan function in AS4
***/

class IsItValid {
    static String isItValid(IAngleMeasurement degree) {
        String MeasureResult="";
        
        /***

        * Check whether input is 90 or 270 
        * then return result in String type.

        * If input is 90 or 270, Tan function will throw ArithmeticException 
        * if catch ArithmeticException, return "Invalid"
        * otherwise, return result of Tan.

        ***/

        try{
            MeasureResult=new DecimalFormat("0").format(Tan_FinalVersion.calculate(degree)+0.000001);
        }
        catch(ArithmeticException e){
            MeasureResult="Invalid";
        }
        finally{
            return MeasureResult;
        }
    }
}

public class StepDefinitions {
    private String input;
    private String actualAnswer;

    // Get input and store it in local.

    @Given("input is {string}")
    public void input_is(String input) {
        this.input = input;
    }

    // Call isItValid fcuntion to get result of Tan with our input.

    @When("I ask what is reuslt")
    public void i_ask_what_is_result() {
        IAngleMeasurement degree = new DegreeMeasurement(Double.valueOf(input));
    	actualAnswer = IsItValid.isItValid(degree);
    }

    //Compared result of Tan with expected result

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}