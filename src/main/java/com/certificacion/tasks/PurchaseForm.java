package com.certificacion.tasks;


import com.certificacion.model.FormData;
import com.certificacion.userinterface.Form;
import com.certificacion.userinterface.SelectProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.List;

import static com.certificacion.userinterface.Form.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

;


public class PurchaseForm implements Task {

    private String firtsname;
    private String lastname;

    private String postalcode;


    public PurchaseForm(List<FormData> data) {
        this.firtsname = data.get(0).getFirstname();
        this.lastname = data.get(0).getLastname();
        this.postalcode = data.get(0).getPostalcode();
    }

    public static PurchaseForm Form(List<FormData> data) {
        return Tasks.instrumented(PurchaseForm.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo( Enter.theValue(firtsname).into(FIRST_NAME),
                Enter.theValue(lastname).into(LAST_NAME),
                Enter.theValue(postalcode).into(POSTAL_CODE),
                Click.on(Form.BUTTON_05));
    }
}
