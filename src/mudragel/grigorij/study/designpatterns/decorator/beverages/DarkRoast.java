package mudragel.grigorij.study.designpatterns.decorator.beverages;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost(){
        return 0.99;
    }
}
