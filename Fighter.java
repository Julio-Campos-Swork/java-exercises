/*
 * 
 * https://exercism.org/tracks/java/exercises/wizards-and-warriors/
 * 
 */

public class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        System.out.println(warrior.toString());
    }
    
}


 class Warrior extends Fighter {

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }
    @Override
    public String toString() {
     
        return super.toString();
    }

    
}

class Wizard extends Fighter {

    private boolean spellPrepared = false;

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public String toString() {
     
        return super.toString();
    }

}


   

