/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insect;

import java.util.*;
public class Insect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Formicidae myFormicidae = new Formicidae();
        Ant myAnt = new Ant();

        String colonyName, AntName, AntSpecies;
        int colonyPopulation,AntPopulation;

        System.out.println("Enter colony name:");
        colonyName = scnr.nextLine();
        System.out.println("Enter colony population:");
        colonyPopulation = scnr.nextInt();
        System.out.println("Enter ant colony name:");
        scnr.nextLine();
        AntName = scnr.nextLine();
        System.out.println("Enter ant colony population:");
        AntPopulation = scnr.nextInt();
        System.out.println("enter ant colony species:");
        scnr.nextLine();
        AntSpecies = scnr.nextLine();

        myFormicidae.setName(colonyName); //sets mypet towards setname and sends petName to it
        myFormicidae.setPopulation(colonyPopulation); // sets mypet towards
        myFormicidae.printInfo();

        myAnt.setName(AntName);
        myAnt.setPopulation(AntPopulation);
        myAnt.setSpecies(AntSpecies);
        myAnt.printInfo();
    }
    
}
