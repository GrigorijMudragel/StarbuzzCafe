package mudragel.grigorij.study.designpatterns.decorator;

import mudragel.grigorij.study.designpatterns.decorator.beverages.Beverage;
import mudragel.grigorij.study.designpatterns.decorator.beverages.DarkRoast;
import mudragel.grigorij.study.designpatterns.decorator.beverages.Espresso;
import mudragel.grigorij.study.designpatterns.decorator.beverages.HouseBlend;
import mudragel.grigorij.study.designpatterns.decorator.components.Mocha;
import mudragel.grigorij.study.designpatterns.decorator.components.Soy;
import mudragel.grigorij.study.designpatterns.decorator.components.Whip;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+ " $" + beverage.cost());


        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }

}
