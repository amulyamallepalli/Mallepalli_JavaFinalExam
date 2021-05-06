/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

/**
 *
 * @author Amulya Mallepalli
 */
public class Question2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   GeometricObject[] Object = new GeometricObject[5];
       System.out.println("Answer by Amulya Mallepalli: question2");
        Object[0] = new Square(6.3, true);
        Object[1] = new Square(7.3, false);
        Object[2] = new Square(5.6, false);
        Object[3] = new Square(8.0, true);
        Object[4] = new Square(7.5, true);

        for (GeometricObject geometricObject : Object) {
            System.out.println("Area: " + geometricObject.calculateArea());
            if (geometricObject.isIsFill() == true) {
                Square square = (Square) geometricObject;
                square.howToColor();
            }
            System.out.println("-------------------------------------");
        }

    }

}
