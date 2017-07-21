package mudragel.grigorij.study.designpatterns.decorator.components;

import mudragel.grigorij.study.designpatterns.decorator.beverages.Beverage;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return .10 + beverage.cost();
    }
}
