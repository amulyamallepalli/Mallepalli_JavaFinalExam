/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Amulya Mallepalli
 */
public class FlowerDriver {

    /** Objects Created
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question11");
        Flower f1 = new Flower("blue",10.5);
        Flower f2 = new Flower("green",13);
        Flower f3 = new Flower("red",5);
        Flower f4 = new Flower("white",8);
        Flower f5 = new Flower("black",4);
        Flower f6 = new Flower("black",4);
        Flower f7= f4;
        /**
         * This invokes the overrided method in the Flower Class. Here we are 
         * using equals method for comparing the two objects and it returns true 
         * if both have same attribute values.
         */
        System.out.println("f1 equals f2: "+f1.equals(f2));
        System.out.println("f3 equals f4: "+f3.equals(f4));
        System.out.println("f5 equals f6: "+f5.equals(f6));
        System.out.println("f7 equals f4: "+f7.equals(f4));
        /**
         * == is used to compare the object address
         */
        System.out.println("f1 equals f2: "+(f1==f2));
        System.out.println("f3 equals f4: "+(f3==f4));
        System.out.println("f5 equals f6: "+(f5==f6));
        System.out.println("f7 equals f4: "+(f7==f4));
        /**
         * this is used for printing the hashcode of the objects by invoking 
         * the hashcode method of Flower Class
         */
        System.out.println(f1.hashCode());
        System.out.println(f2.hashCode());
        System.out.println(f5.hashCode());
        System.out.println(f6.hashCode());
    }
    
}
