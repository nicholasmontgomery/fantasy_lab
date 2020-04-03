package Characters;

import MagicalSpells.ISpell;

import java.util.ArrayList;

public class Warlock extends Mage {
    public Warlock(String name, int healthPoints, ArrayList<ISpell> inventory) {
        super(name, healthPoints, inventory);
    }
}
