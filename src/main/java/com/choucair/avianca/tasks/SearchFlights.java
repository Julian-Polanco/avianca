package com.choucair.avianca.tasks;

import com.choucair.avianca.userinterface.AviancaMainPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchFlights implements Task {
    private String from;
    private String destination;
    private String departureDate;
    private String returnDate;
    private String adults;
    private String children;

    public SearchFlights(String from, String destination, String departureDate, String returnDate, String adults, String children) {
        this.from = from;
        this.destination = destination;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.adults = adults;
        this.children = children;
    }

    public static SearchFlights inTheAviancaPage(String from, String destination, String departureDate, String returnDate, String adults, String children) {
        return Tasks.instrumented(SearchFlights.class, from, destination, departureDate, returnDate, adults, children);
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        try {
            Thread.sleep(5000);
            System.out.println(AviancaMainPage.SELECT_FROM.getCssOrXPathSelector());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        actor.attemptsTo(

        WaitUntil.the(AviancaMainPage.INPUT_FROM, isVisible()),
                Enter.theValue(from).into(AviancaMainPage.INPUT_FROM),
                WaitUntil.the(AviancaMainPage.SELECT_FROM, isClickable()),
                Click.on(AviancaMainPage.SELECT_FROM),
                Enter.theValue(destination).into(AviancaMainPage.INPUT_TO),
                WaitUntil.the(AviancaMainPage.SELECT_TO, isClickable()),
                Click.on(AviancaMainPage.SELECT_TO)
     );

    }

}
