/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.example2;

/**
 *
 * @author Amulya Mallepalli
 */
public class RoadDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question3");
        UniversityDrive drive = new UniversityDrive("State Highway", 3);
        System.out.println(drive);
        //Up castins(Widening)
        Road road = new UniversityDrive("National Highway", 4);
        //Narrow casting        
        UniversityDrive drive1 = (UniversityDrive) road;
        System.out.println(drive1);
    }

}
