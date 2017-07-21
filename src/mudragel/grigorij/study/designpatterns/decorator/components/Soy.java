package mudragel.grigorij.study.designpatterns.decorator.components;

import mudragel.grigorij.study.designpatterns.decorator.beverages.Beverage;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        return .15 + beverage.cost();
    }
}
