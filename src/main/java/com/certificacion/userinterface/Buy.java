package com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Buy {

    public static final Target BUTTON_00 = Target.the("BUTTON TO BUY")

            .located(By.xpath("//button[@id='finish']"));

}
