package com.choucair.avianca.userinterface;

import com.choucair.avianca.model.AviancaData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.avianca.com/co/es/")
public class AviancaMainPage extends PageObject {
    static AviancaData aviancaData = new AviancaData();
    private static final String FROM = aviancaData.getFrom();
    private static final String TO = aviancaData.getDestination();
    public static final Target INPUT_FROM = Target.the("Input to select the origin").located(By.xpath("//label[contains(text(),'Desde')]//following::input[@data-name='pbOrigen']"));
    public static final Target SELECT_FROM = Target.the("Div where there is the origin select").located(By.xpath("//b[contains(text(),'"+ FROM +"')]//parent::div//parent::li"));
    public static final Target INPUT_TO = Target.the("Input to select de destination").located(By.xpath("//label[contains(text(),'Hacia')]//following::input[@data-name='pbDestino']"));
    public static final Target SELECT_TO = Target.the("Div where there is the destination select").located(By.xpath("//b[contains(text(),'"+ TO +"')]//parent::div//parent::li"));

}
