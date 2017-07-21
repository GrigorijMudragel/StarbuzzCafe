package mudragel.grigorij.study.designpatterns.decorator.components;

import mudragel.grigorij.study.designpatterns.decorator.beverages.Beverage;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return .20 + beverage.cost();
    }
}
