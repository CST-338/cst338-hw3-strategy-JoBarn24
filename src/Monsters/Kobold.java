package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

/**
 * Author: Jody Barnett
 * Date: 4/12/24
 * Description: The Monsters.Kobold class is a child class of Monsters.Monster.
 * It includes hp, xp, and current items being held by the Monsters.Kobold.
 */

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String,Integer> items) {
        super(maxHP,xp,items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}
