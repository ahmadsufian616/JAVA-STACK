public class HumanTest{
    public static void main(String[] args) {
        Human ahmad= new Human();
        Human abood=new Human();
        ahmad.attack(abood);
        System.out.println(abood.health);
    }
}