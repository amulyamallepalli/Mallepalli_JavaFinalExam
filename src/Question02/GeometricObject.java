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
public abstract class GeometricObject {

    private boolean isFill;

    public GeometricObject(boolean isFill) {
        this.isFill = isFill;
    }

    public boolean isIsFill() {
        return isFill;
    }

    public abstract double calculateArea();
}
