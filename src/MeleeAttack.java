/**
 * Author: Jody Barnett
 * Date: 4/18/24
 * Description: Melee attack that does damage to monsters.
 */

 class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return null;
    }
}
