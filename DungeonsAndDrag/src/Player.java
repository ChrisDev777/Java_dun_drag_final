import equipment.DefensiveEquipment;
import equipment.OffensiveEquipment;
import java.util.Objects;

/**
 * Model for a player
 * Hold details information about the player
 */
public class Player {

    /**
     * Name of the player
     */
    private String name;
    private int life;
    private int attack;
    private String archetype;

    private DefensiveEquipment defensiveEquipment;

    private OffensiveEquipment offensiveEquipment;

    /**
     * Create a new player using default parameters
     */
    public Player() {
        this.name = "Harry Potlé";
        this.life = 9;
        this.attack = 19;
        this.archetype = " wizzard";
        this.defensiveEquipment = new DefensiveEquipment("Sismik",1);
        this.offensiveEquipment = new OffensiveEquipment("Cosmik",1);
    }

    /**
     * Create a new player using given parameters
     *
     * @param name               name of the player
     * @param life               life point of the player
     * @param attack             attack level
     * @param type               archetype of the player (warrior or wizard)
     * @param defensiveEquipment defensive equipment the player is equipped with
     * @param offensiveEquipment offensive equipment the player is equipped with
     */
    public Player(String name, int life, int attack, String type, DefensiveEquipment defensiveEquipment, OffensiveEquipment offensiveEquipment) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.archetype = type;
        this.defensiveEquipment = defensiveEquipment;
        this.offensiveEquipment = offensiveEquipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                ", archetype='" + archetype + '\'' +
                ", defensiveEquipment=" + defensiveEquipment +
                ", offensiveEquipment=" + offensiveEquipment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return life == player.life && attack == player.attack && Objects.equals(name, player.name) && Objects.equals(archetype, player.archetype) && Objects.equals(defensiveEquipment, player.defensiveEquipment) && Objects.equals(offensiveEquipment, player.offensiveEquipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, life, attack, archetype, defensiveEquipment, offensiveEquipment);
    }
}
