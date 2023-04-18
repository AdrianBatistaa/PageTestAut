package com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Form {



    public static final Target FIRST_NAME= Target.the( "input that shows us the first name field")

            .located(By.id("first-name"));

    public static final Target LAST_NAME = Target.the( "input that shows us the first name field")

            .located(By.id("last-name"));

    public static final Target POSTAL_CODE = Target.the( "input that shows us the first name field")

            .located(By.id("postal-code"));

    public static final Target BUTTON_05= Target.the( "button to buy")

            .located(By.id("continue"));
}
