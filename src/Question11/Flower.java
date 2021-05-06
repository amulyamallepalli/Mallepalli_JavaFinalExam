/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Amulya Mallepalli
 */
public class Flower {
    /**
     * created two variables color and price
     */
   private String color;
   private double price;
   /**
    *  Here we have created a constructor with two parameters
    * @param color
    * @param price 
    */
    public Flower(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
    /**
     *  we have override the hashcode so this hashcode method return the hash 
     * based upon the two attributes color and price. whenever they are two 
     * objects of type flower with the same attributes values then the resulting hash
     * will be same for the both the objects.
     * @return hash code of the object
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.color);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }
    /**
     * Here Equals method is overrided, This method tell the compiler to
     * check only Flower object - color,price, when we compare two objects of 
     * Flower class with equals method.whenever two objects with same data are compared
     * then the equals method returns true.
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Flower other = (Flower) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
}
