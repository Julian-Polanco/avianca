package com.choucair.avianca.stepdefinitions;

import com.choucair.avianca.model.AviancaData;
import com.choucair.avianca.tasks.OpenUP;
import com.choucair.avianca.tasks.SearchFlights;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SearchFlightsStepDefinitions {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than I am on the main page of Avianca$")
    public void thanIAmOnTheMainPageOfAvianca() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUP.theMainPage());
    }

    @When("^I select all the information of the flight$")
    public void iSelectAllTheInformationOfTheFlight(List<AviancaData> aviancaDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchFlights.inTheAviancaPage(aviancaDataList.get(0).getFrom(), aviancaDataList.get(0).getDestination(), aviancaDataList.get(0).getDepartureDate(), aviancaDataList.get(0).getReturnDate(), aviancaDataList.get(0).getAdults(), aviancaDataList.get(0).getChildren()));
    }

    @Then("^I should see the flight information$")
    public void iShouldSeeTheFlightInformation() {
    }
}
