public class Wizard extends Human {
    public Wizard(){
        this.health=50;
        this.intelligence=8;

    }
    public void heal(Human human){
        human.health+=this.intelligence;
        System.out.println(human.health);
    } 
    public void fireball(Human human){
        human.health-=(this.intelligence)*3;
    }
    

    
}
    

