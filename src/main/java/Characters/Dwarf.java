package Characters;

import Weapons.IWeapon;

import java.util.ArrayList;

public class Dwarf extends Warrior {

    private IWeapon activeWeapon;

    public Dwarf(String name, int healthPoints, ArrayList inventory, IWeapon activeWeapon){
        super(name, healthPoints, inventory);
        this.activeWeapon = activeWeapon;
    }
}
