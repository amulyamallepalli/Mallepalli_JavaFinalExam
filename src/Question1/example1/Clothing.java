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
public class Clothing extends Fashions implements FashionInterface {

    private int year;

    public Clothing(int year, String electronicName) {
        super(electronicName);
        this.year = year;
    }

    

    public String getMyParentToString() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "The Fashion is " + this.fashionNameShortForm()
                + ".\n Brand is " + this.getFashionBrand()
                + ".\n Year is " + this.getFashionYear()+ ". Its short form is "
                + this.fashionNameShortForm();

    }

    @Override
    String fashionNameShortForm() {
        return "The Fashion name is Clothing";
    }

    @Override
    public int getFashionYear() {
        return this.year;
    }

    @Override
    public String getFashionBrand() {
        return "The fashion brand is Levis";
    }
}