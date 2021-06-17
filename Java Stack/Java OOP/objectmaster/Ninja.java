public class Ninja extends Human {
    public Ninja(){
        this.stealth=10;
        

    }
    public void steal(Human human){
        int s=this.stealth;
        human.health-=s;
        System.out.println(human.health);
    } 
    public void runAway(){
        this.health-=10;
    }


    
}

