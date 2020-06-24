package utilities.equipment;
import utilities.equipment.modifikators.Modifikators;
import java.util.List;

public abstract class Equipment {

    protected Placing placing;
    protected String name;
    protected int base; // bei Rüstung DEF, bei Waffen ATK
    protected List<Modifikators> mods;

    public Placing getPlacing() {
        return placing;
    }

}


