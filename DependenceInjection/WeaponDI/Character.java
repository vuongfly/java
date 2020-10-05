import Weapon.Weapon;

public class Character {
    Weapon weapon;

    public Character(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        weapon.attack();
    }

}
