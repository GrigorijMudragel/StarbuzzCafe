package mudragel.grigorij.study.designpatterns.decorator.beverages;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }
}
