package insect;
import java.util.*;
public class Formicidae {
    protected String Colonyname;
    protected int Population;
    public Formicidae(){
        Colonyname = "NO NAME";
        Population = 0;
    }
    public Formicidae(String userName,int userAge){
    this.Colonyname = userName;
    this.Population = userAge;
    }
    public void setName(String userName){
        Colonyname = userName;
    }
    public String getName(){
        return Colonyname;
    }
    public void setPopulation(int colonyPopulation){
        Population = colonyPopulation;
    }
    public int getPopulation(){
        return Population;
    }
    public void printInfo(){
        System.out.println("Colony Info: ");
        System.out.println("Colony name: "+ Colonyname);
        System.out.println("Population: "+ Population);
    }
}

