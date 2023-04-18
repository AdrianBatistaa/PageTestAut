package com.certificacion.tasks;



import com.certificacion.userinterface.SelectProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class Product implements Task {
    private SelectProduct selectProduct;
    public static Product SelectProduct(){
        return Tasks.instrumented(Product.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(selectProduct.BUTTON_01),
                Click.on(selectProduct.BUTTON_02),
                Click.on(selectProduct.BUTTON_03),
                Click.on(selectProduct.BUTTON_04));



    }

}
