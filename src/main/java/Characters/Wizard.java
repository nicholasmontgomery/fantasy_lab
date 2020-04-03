package Characters;

import MagicalSpells.ISpell;

import java.util.ArrayList;

public class Wizard extends Mage {
    public Wizard(String name, int healthPoints, ArrayList<ISpell> inventory) {
        super(name, healthPoints, inventory);
    }
}
