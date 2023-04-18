package com.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectProduct {

    public static final Target BUTTON_01 = Target.the( "button to select product")

            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target BUTTON_02 = Target.the( "button to select product")

            .located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static final Target BUTTON_03 = Target.the( "button to select cart")

            .located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));


    public static final Target BUTTON_04 = Target.the( "button to select cart")

            .located(By.xpath("//button[@id='checkout']"));
}
