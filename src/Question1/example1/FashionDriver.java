/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.example1;

/**
 *
 * @author Amulya Mallepalli
 */
public class FashionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Fashions e=new Fashions(); //Cannot be Instantiated
//        FashionInterface ef=new FashionInterface(); cannot create instance
     System.out.println("Answer by Amulya Mallepalli: question1");
        Clothing cloth = new Clothing(1988, "Peter England");
        System.out.println(cloth);
        System.out.println(cloth.getMyParentToString());
    }

}

