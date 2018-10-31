/*import java.util.ArrayList;
public class GameCharacter {

    private String name;
    private String outfit;
    private ArrayList<String> weapons; // list of weapon in our possession
    private int health;
    private boolean shield;
    private int power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public ArrayList<String> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<String> weapons) {
        this.weapons = weapons;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", outfit='" + outfit + '\'' +
                ", weapons=" + weapons +
                ", health=" + health +
                ", shield=" + shield +
                ", power=" + power +
                '}';
    }

    public GameCharacter(String name) {
        this.name = name;
        this.outfit = "Peasant";
        this.power = 100;
        this.health = 100;
        this.shield = false;
        this.weapons = new ArrayList<>();
    }

    public boolean attack(String weapon,GameCharacter opponent ){
        int myTotalPower = power + getPowerRatingOfWeapon(weapon) + health;
        int opTotalPower = op.power + getPowerRatingOfWeapon(op.weapon) + op.health;

    }

    public int gerPowerRatingOfWeapon(String weapon){
        int power;
        switch (weapon){
            case  " Sword" :
                power = 7;
            case "Hammer" :
                power = 10;
            case " Knife" :
                power = 5;
            case "Pen":

        }
    }

}*/
