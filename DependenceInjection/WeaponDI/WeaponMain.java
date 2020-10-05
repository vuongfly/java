import Weapon.*;

public class WeaponMain {
    public static void main(String[] args) {
        Weapon weapon = new Sword();
        Character character = new Character(weapon);
        character.attack();
    }
}
