package worker;

import utilities.ExpTable;

public abstract class Worker {

    protected int experience;
    protected int level;
    protected int talent; //1-5 Sterne
    protected int str;
    protected int dex;
    protected int intelligence;
    protected int hp;
    protected int sp;
    protected EquipSetup equipSetup;


    public boolean levelUpPossible(){
        if(level >= ExpTable.MaxLevel) return false;
        if(ExpTable.LevelTable[level-1] > experience) return false;
        return true;
    }
    public abstract int levelUp();
    public void addExperience(int i){
        experience += i;
    }
    public int getExperience() {
        return experience;
    }
    public int getLevel() {
        return level;
    }



}
