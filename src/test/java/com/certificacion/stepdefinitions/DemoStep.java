package com.certificacion.stepdefinitions;

import com.certificacion.model.DemoData;
import com.certificacion.model.FormData;
import com.certificacion.tasks.*;
import com.certificacion.userinterface.Form;
import com.certificacion.userinterface.SelectProduct;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class DemoStep {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user is on the web page$")
    public void theUserIsOnTheWebPage() {
        OnStage.theActorCalled("Adrian").wasAbleTo(OpenUp.DemoPage());
    }

    @When("^the user enters his username and password$")
    public void theUserEntersHisUsernameAndPassword(List<DemoData> demoData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginPage.Register(demoData), Product.SelectProduct());

    }

    @Then("^the user will be able to see products$")
    public void theUserWillBeAbleToSeeProducts(List<FormData> formData) throws Exception {
    OnStage.theActorInTheSpotlight().attemptsTo(PurchaseForm.Form(formData), OverView.Buy());

    }

}

