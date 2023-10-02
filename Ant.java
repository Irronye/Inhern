/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insect;

/**
 *
 * @author jyi95
 */
public class Ant extends Formicidae{
    private String Species;

    public void setSpecies(String userSpecies){
        Species = userSpecies;
    }

    public String getSpecies(){
        return Species;
    }
    public void printInfo(){    
    System.out.println("Colony Info: ");
    System.out.println("Colony name: "+ Colonyname);
    System.out.println("Population: "+ Population);
    System.out.println("Species: "+ Species);
    }
}
