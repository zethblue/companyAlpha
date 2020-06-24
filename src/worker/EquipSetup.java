package worker;

import utilities.equipment.Equipment;
import utilities.equipment.Placing;

public class EquipSetup {

    private Equipment head;
    private Equipment body;
    private Equipment arms;
    private Equipment hands;
    private Equipment legs;
    private Equipment feet;
    private Equipment weapon;


    public Equipment equipHead(Equipment equipment){ //equippt Headgear und retourniert das vorhandene Headgear. Wenn es kein Headgear ist,  retourniert das anzulegende Equip
        if(equipment.getPlacing() != Placing.HEAD){
            return equipment;
        }
        else{
            Equipment returnMe = head;
            head = equipment;
            return returnMe;
        }
    }
    public Equipment equipBody(Equipment equipment){
        if(equipment.getPlacing() != Placing.BODY){
            return equipment;
        }
        else{
            Equipment returnMe = body;
            body = equipment;
            return returnMe;
        }
    }
    public Equipment equipArms(Equipment equipment){
        if(equipment.getPlacing() != Placing.ARMS){
            return equipment;
        }
        else{
            Equipment returnMe = arms;
            arms = equipment;
            return returnMe;
        }
    }
    public Equipment equipHands(Equipment equipment){
        if(equipment.getPlacing() != Placing.HANDS){
            return equipment;
        }
        else{
            Equipment returnMe = hands;
            hands = equipment;
            return returnMe;
        }
    }
    public Equipment equipLegs(Equipment equipment){
        if(equipment.getPlacing() != Placing.LEGS){
            return equipment;
        }
        else{
            Equipment returnMe = legs;
            legs = equipment;
            return returnMe;
        }
    }
    public Equipment equipFeet(Equipment equipment){
        if(equipment.getPlacing() != Placing.FEET){
            return equipment;
        }
        else{
            Equipment returnMe = feet;
            feet = equipment;
            return returnMe;
        }
    }
    public Equipment equipWeapon(Equipment equipment){
        if(equipment.getPlacing() != Placing.WEAPON){
            return equipment;
        }
        else{
            Equipment returnMe = weapon;
            weapon = equipment;
            return returnMe;
        }
    }

    public Equipment getHead() {
        return head;
    }
    public Equipment getBody() {
        return body;
    }
    public Equipment getArms() {
        return arms;
    }
    public Equipment getHands() {
        return hands;
    }
    public Equipment getLegs() {
        return legs;
    }
    public Equipment getFeet() {
        return feet;
    }
    public Equipment getWeapon() {
        return weapon;
    }
}
