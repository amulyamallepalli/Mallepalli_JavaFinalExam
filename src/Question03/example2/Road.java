/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03.example2;

/**
 *
 * @author Amulya Mallepalli
 */
public class Road {

    private String roadType;
    private int noOfLanes;

    public Road(String roadType, int noOfLanes) {
        this.roadType = roadType;
        this.noOfLanes = noOfLanes;
    }

    public String getRoadType() {
        return roadType;
    }

    public int getNoOfLanes() {
        return noOfLanes;
    }

    @Override
    public String toString() {
        return "Road{" + "roadType=" + roadType + ", noOfLanes=" + noOfLanes + '}';
    }

}
