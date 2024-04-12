import java.util.HashMap;

/**
 * Author: Jody Barnett
 * Date: 4/12/24
 * Description: The Kobold class is a child class of Monster.
 * It includes hp, xp, and current items being held by the Kobold.
 */

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String,Integer> items) {
        super(maxHP,xp,items);
    }

    @Override
    public String toString() {
        return "Kobold has : " + super.toString();
    }
}
