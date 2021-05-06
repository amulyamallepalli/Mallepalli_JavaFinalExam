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

public abstract class Fashions {
    
private String fashionName;

    public Fashions(String fashionName) {
        this.fashionName = fashionName;
    }

    String getFashionName() {
        return this.fashionName;
    }

    abstract String fashionNameShortForm();

    @Override
    public String toString() {
        return "The Fashion Name is " + this.getFashionName()
                + " And its short form is " + this.fashionNameShortForm();
    }

}