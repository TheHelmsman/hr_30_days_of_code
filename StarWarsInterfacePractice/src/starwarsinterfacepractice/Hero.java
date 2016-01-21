
package starwarsinterfacepractice;

public class Hero implements Character {
    
    public String weapon = "The Force";
    
    public Hero() {
        
    }

    public String getWeapon() {
        return weapon;
    }
    
    public void attack() {
        System.out.println("The hero attacks the enemy");
    }
    
    @Override
    public void heal() {
        System.out.println("The hero heals you");
    }
}
