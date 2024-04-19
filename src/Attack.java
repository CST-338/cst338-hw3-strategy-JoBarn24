/**
 * Author: Jody Barnett
 * Date: 4/18/24
 * Description: Interface for to be implemented for attacks on monsters.
 */

public interface Attack extends Ability {
    public abstract Integer attack(Monster monster);
}
