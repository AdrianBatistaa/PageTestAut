package com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Register {
    public static final Target USER_NAME= Target.the("input that shows us the first name field")

            .located(By.id("user-name"));

    public static final Target PASSWORD = Target.the( "input that shows us the first name field")

            .located(By.id("password"));

    public static final Target BUTTON = Target.the( "button that shows us the form to register")

            .located(By.id("login-button"));

















}
