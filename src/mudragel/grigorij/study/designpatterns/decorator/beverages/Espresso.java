package mudragel.grigorij.study.designpatterns.decorator.beverages;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }
    public double cost(){
        return 1.99;
    }
}
