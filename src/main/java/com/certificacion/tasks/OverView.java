package com.certificacion.tasks;

import com.certificacion.userinterface.Buy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OverView implements Task {

    private static Buy buy;

    public static OverView Buy(){
        return Tasks.instrumented(OverView.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(buy.BUTTON_00));

    }
}
