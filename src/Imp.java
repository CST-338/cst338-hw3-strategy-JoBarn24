import java.util.HashMap;

/**
 * Author: Jody Barnett
 * Date: 4/12/24
 * Description: The Imp class is a child class of Monster.
 * It includes hp, xp, and current items being held by the Imp.
 */

public class Imp extends Monster {
    public Imp(Integer maxHP, Integer xp, HashMap<String,Integer> items) {
        super(maxHP,xp,items);
    }

    @Override
    public String toString() {
        return "Imp has : " + super.toString();
    }
}
