public class ProjectTest {
    public static void main(String[] args) {
    project pro =new project("name2","deec2k");
    // pro.project("test1");
    // pro.project("text2","desc1");
        
    System.out.println (pro.get_desc());
    System.out.println(pro.get_name());
    pro.set_desc("desc1 ");
    pro.set_name("name1");
    System.out.println(pro.get_desc());
    System.out.println(pro.get_name());



        
    }

}
