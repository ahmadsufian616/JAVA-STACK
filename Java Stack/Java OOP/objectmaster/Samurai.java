public class Samurai extends Human {
     int count=0;
    public Samurai(){
        this.health=200;
        this.count++;

    }
    public void deathBlow(Human human){
        human.health=0;
        this.health=this.health/2;
    }
    public void meditate(){
         int h=this.health/2;
         this.health+=h;
    }
    public void howMany(){
        System.out.println(this.count);

    }
}
