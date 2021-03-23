package pizzaCalories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Topping {

    private static final List<String> TOPPING_TYPE = new ArrayList<>(){{
        add("Meat");
        add("Veggies");
        add("Cheese");
        add("Sauce");
    }};
    private static final Map<String, Double> TOPPING_MODIFIERS = new HashMap<>(){{
        put("Meat", 1.2);
        put("Veggies", 0.8);
        put("Cheese", 1.1);
        put("Sauce", 0.9);
    }};

    public static final String INVALID_TOPPING_TYPE_EXCEPTION = "Cannot place %s on top of your pizza.";
    public static final String INVALID_TOPPING_WEIGHT_EXCEPTION = "%s weight should be in the range [1..50].";

    private String topping_type;
    private double weight;

    public Topping(String topping_type, double weight) {
        this.setTopping_type(topping_type);
        this.setWeight(weight);
    }

    private void setTopping_type(String topping_type) {
        if (!TOPPING_TYPE.contains(topping_type)){
            throw new IllegalArgumentException(String.format(INVALID_TOPPING_TYPE_EXCEPTION, topping_type));
        }
        this.topping_type = topping_type;
    }
    private void setWeight(double weight){
        if (weight < 0 || weight > 50){
            throw new IllegalArgumentException(String.format(INVALID_TOPPING_WEIGHT_EXCEPTION, this.topping_type));
        }
        this.weight = weight;
    }
    public double calculateCalories(){
        return pizzaConstants.BASE_CALORIES * weight * TOPPING_MODIFIERS.get(this.topping_type);
    }
}
