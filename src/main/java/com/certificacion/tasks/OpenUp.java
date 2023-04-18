package com.certificacion.tasks;

import com.certificacion.userinterface.DemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private DemoPage demoPage;

    public static OpenUp DemoPage(){
        return Tasks.instrumented(OpenUp.class);
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(Open.browserOn(demoPage));

    }
}
