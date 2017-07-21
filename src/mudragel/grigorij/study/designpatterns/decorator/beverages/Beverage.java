package mudragel.grigorij.study.designpatterns.decorator.beverages;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
