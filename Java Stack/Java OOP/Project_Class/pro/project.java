import java.util.ArrayList;
import java.util.Collections;

public class project {
    String name;
    String description;

    // public String elevatorPitch() {
    //     String A= this.get_name() ;
    //     String B= this.get_desc() ;
    //     String arr[] ={A,B};
    //     return arr;

    // }

    public project() {
        this.name="";
        this.description="";

    }

    public project(String name) {
    this.name=name;
    this.description="";
    }
    public project(String name,String description){
        this.name=name;
        this.description=description;

    }
    public String get_name(){
        return this.name;
    }
    public String get_desc(){
        return this.description;
    }
    public void set_name(String name){
        this.name=name;


    }
    public void set_desc(String desc){
        this.description=desc;


    }

}
