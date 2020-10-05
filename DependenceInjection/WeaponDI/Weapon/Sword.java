package Weapon;

import Interface.Attackable;

public class Sword extends Weapon {

    @Override
    public void attack() {
        System.out.println("Sword is attacking: keng keng...");
    }
}
