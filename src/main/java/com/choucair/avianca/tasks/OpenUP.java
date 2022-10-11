package com.choucair.avianca.tasks;

import com.choucair.avianca.userinterface.AviancaMainPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUP implements Task {

    private AviancaMainPage aviancaMainPage;

    public static OpenUP theMainPage() {
        return new OpenUP();
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(aviancaMainPage));
    }
}
