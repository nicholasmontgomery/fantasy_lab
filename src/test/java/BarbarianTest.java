import Characters.Barbarian;
import Weapons.Axe;
import Weapons.IWeapon;
import Weapons.Mace;
import com.sun.tools.internal.xjc.model.CArrayInfo;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class BarbarianTest {

    Barbarian barbarian;
    IWeapon axe;
    Mace mace;


    @Before
    public void setUp(){
        ArrayList<IWeapon> inventory = new ArrayList<IWeapon>();
        mace = new Mace();
        axe = new Axe();
        barbarian = new Barbarian("Bhettfug", 1000, inventory, mace);
    }

    @Test
    public void canAddToInventory(){
        barbarian.pickUp(axe);
        assertEquals(1, barbarian.countInventory());
    }

    @Test
    public void canReduceHealthPoints(){
        int strikeForce = axe.strike();
        barbarian.reduceHealth(strikeForce);
        assertEquals(938, barbarian.getHealthPoints());
    }




}
