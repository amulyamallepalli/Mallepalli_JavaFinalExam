/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

/**
 *
 * @author Amulya Mallepalli
 */
public class ProgramDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question1");
        ProgrammingLanguage prog = new ProgrammingLanguage("Ruby", false, "IT");
        ProgrammingLanguage prog1 = new ProgrammingLanguage("Java", true, "IT");
        System.out.println(prog);
        System.out.println(prog1);
    }

}
