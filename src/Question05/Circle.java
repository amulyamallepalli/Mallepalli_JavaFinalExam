/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Amulya Mallepalli
 */
public class Circle {
     private double rad;
    public static final double PI = Math.PI;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getArea() {
        return PI * rad * rad;
    }

}


