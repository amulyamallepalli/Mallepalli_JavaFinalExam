/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

/**
 *
 * @author Amulya Mallepalli
 */
public class Cellphone {
    
   private String name;
   private int price;

    public Cellphone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cellphone{" + "name=" + name + ", price=" + price + '}';
    }
   
}
