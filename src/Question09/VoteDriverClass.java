/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author Amulya Mallepalli
 */
public class VoteDriverClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question9");
        Vote v1 = new Vote("Amulya");
        Vote v2 = new Vote("Pranavi");
        v1.setAge(23);
        System.out.println(v1);
        v2.setAge(16);
    }

}
