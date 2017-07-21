package mudragel.grigorij.study.designpatterns.decorator.beverages;

/**
 * Created by Grigorij_Mudragel on 7/21/2017.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    public double cost(){
        return .89;
    }
}
