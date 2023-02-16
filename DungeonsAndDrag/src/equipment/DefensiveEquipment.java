package equipment;

import java.util.Objects;

/**
 * Model for defensive equipment
 * When equipped by a player it provides a defensive bonus in fight
 */
public class DefensiveEquipment {

    /**
     *
     */
    private final String name;

    /**
     * Attack level provided by that equipment
     */
    private final int level;

    public DefensiveEquipment(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefensiveEquipment that = (DefensiveEquipment) o;
        return level == that.level && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }
}



