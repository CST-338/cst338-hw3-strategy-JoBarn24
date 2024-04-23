package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;

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

    Integer agi;
    Integer def;
    Integer str;
    Attack attack;

    public Monster() {
    }

    public Monster(Integer maxHP, Integer xp, HashMap<String,Integer> items) {
        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
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
