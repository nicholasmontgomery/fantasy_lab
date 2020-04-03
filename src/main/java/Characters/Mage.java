package Characters;

import MagicalSpells.ISpell;
import Player.Player;
import Weapons.IWeapon;

import java.util.ArrayList;

public abstract class Mage extends Player {
    public Mage(String name, int healthPoints, ArrayList<ISpell> inventory) {
        super(name, healthPoints);
    }
}
