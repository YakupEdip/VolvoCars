package com.volvo.step_definitions;

import com.volvo.pages.VaraBilarPage;
import com.volvo.utilities.BrowserUtils;
import com.volvo.utilities.ConfigurationReader;
import com.volvo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.UnitsTools;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class VaraBilarStepDefs {


    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        VaraBilarPage varaBilarPage = new VaraBilarPage();
        BrowserUtils.waitFor(1);
        varaBilarPage.alertAccep.click();


    }

    @When("the user clicks on the Vara bilar function")
    public void the_user_clicks_on_the_Vara_bilar_function() {
        VaraBilarPage varaBilarPage = new VaraBilarPage();
        BrowserUtils.waitForClickablility(varaBilarPage.varaBilar,10);
        varaBilarPage.varaBilar.click();



    }

    @Then("the user should see one of car type's title as {string} at the left side of the page")
    public void the_user_should_see_one_of_car_type_s_title_as_at_the_left_side_of_the_page(String carType) {

        String expectedTypeName="";
        String actualTypeName="";

        VaraBilarPage varaBilarPage = new VaraBilarPage();
        BrowserUtils.waitFor(5);

        switch (carType){

            case "Elbilar":
                expectedTypeName = carType;
                actualTypeName = varaBilarPage.elbilar.getText();
                break;

            case "Hybridbilar":
                expectedTypeName = carType;
                actualTypeName = varaBilarPage.hybridbilar.getText();
                break;

            case "Övriga bilar":
                expectedTypeName = carType;
                actualTypeName = varaBilarPage.ovrigaBilar.getText();
                break;

        }
        System.out.println(actualTypeName);
        Assert.assertEquals(expectedTypeName,actualTypeName);


    }



}
