package com.certificacion.tasks;

import com.certificacion.model.DemoData;
import com.certificacion.userinterface.Register;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

import static com.certificacion.userinterface.Register.*;


public class LoginPage implements Task {
    private String username;
    private String password;


    public LoginPage(List<DemoData>data) {
        this.username = data.get(0).getUsername();
        this.password = data.get(0).getPassword();

    }

    public static LoginPage Register(List<DemoData>data){
        return Tasks.instrumented(LoginPage.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(USER_NAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(Register.BUTTON));

    }
}
