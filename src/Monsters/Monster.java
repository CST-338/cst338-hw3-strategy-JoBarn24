package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 * Author: Jody Barnett
 * Date: 4/12/24
 * Description: The Monsters.Monster class is the parent class that all monsters will be based off of.
 * It includes hp, xp, and current items being held by the monster.
 */

public class Monster {
    private Integer hp = 1;
    private Integer xp = 10;
    private Integer maxHP = 100;
    private HashMap<String, Integer> items = new HashMap<>();

    Integer agi = 10;
    Integer def = 10;
    Integer str = 10;
    Attack attack;

    public Monster() {
    }

    public Monster(Integer maxHP, Integer xp, HashMap<String,Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer attackTarget(Monster monster) {
        Integer tempAttack = attack.attack(monster);
        takeDamage(tempAttack);
        return tempAttack;
    }

    public boolean takeDamage(Integer damage) {
        if (damage > 0) {
            setHp(getHp() - damage);
            System.out.println("The creature was hit for " + damage + " damage");
        }
        if (getHp() <= 0) {
            System.out.println("Oh no! The creature has perished");
            System.out.println(this.toString());
            return false;
        }
        return false;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Integer getAgility() {
        return agi;
    }

    public Integer getDefense() {
        return def;
    }

    public Integer getStrength() {
        return str;
    }

    public Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if (min > max) {
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(), monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP()) && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    @Override
    public String toString() {
        return "hp=" + getHp() + "/" + getMaxHP();
    }
}
