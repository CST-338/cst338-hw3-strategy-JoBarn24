import java.util.HashMap;

public class Monster {
    private Integer hp = 1;
    private Integer xp = 10;
    private Integer maxHP = 1;
    private HashMap<String, Integer> items = new HashMap<>();

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }
}
