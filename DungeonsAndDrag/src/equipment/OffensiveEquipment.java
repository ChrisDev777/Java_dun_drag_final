package equipment;

import java.util.Objects;

/**
 * Model for offensive equipment
 * When equipped by a player it provides an attack bonus in fight
 */
public class OffensiveEquipment {

    /**
     * Name of the equipment
     */
    private final String name;

    /**
     * Protection level provided
     */
    private final int defenceLevel;


    public OffensiveEquipment(String name, int defenceLevel) {
        this.name = name;
        this.defenceLevel = defenceLevel;
    }

    public String getName() {
        return name;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    @Override
    public String toString() {
        return "equipment.OffensiveEquipment{" +
                "name='" + name + '\'' +
                ", defenceLevel=" + defenceLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OffensiveEquipment that = (OffensiveEquipment) o;
        return defenceLevel == that.defenceLevel && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, defenceLevel);
    }
}
