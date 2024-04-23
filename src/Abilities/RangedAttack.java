package Abilities;

import Monsters.Monster;

/**
 * Author: Jody Barnett
 * Date: 4/18/24
 * Description: Ranged attack that does damage to monsters.
 */

public class RangedAttack implements Attack {
    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }


    /**
     * Uses a ranged attack against a monster.
     * @param target is the monster being attacked.
     * @return null
     */
    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return null;
    }
}
