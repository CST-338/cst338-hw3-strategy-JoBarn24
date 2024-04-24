package Abilities;

import Monsters.Monster;

/**
 * Author: Jody Barnett
 * Date: 4/18/24
 * Description: Melee attack that does damage to monsters.
 */

public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }


    /**
     * Uses a melee attack against a monster.
     * @param target is the monster being attacked.
     * @return null
     */
    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStrength() - target.getDefense();
    }
}
