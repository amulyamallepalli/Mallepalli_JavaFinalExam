/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Amulya Mallepalli
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question5");
        ComparableCircle cc2 = new ComparableCircle(2.5);
        ComparableCircle cc1 = new ComparableCircle(4);
        ComparableCircle cc3 = new ComparableCircle(8.3);
        
        ArrayList<ComparableCircle> listCC = new ArrayList<>();
        listCC.add(cc1);
        listCC.add(cc2);
        listCC.add(cc3);
        System.out.println("Before Sorting...........");
        printList(listCC);

        Collections.sort(listCC);               
        System.out.println("After Sorting ---------> "
                + "The Larger of Three Areas ------ > "
                + listCC.get(0).getAreaParent());
    }

    public static void printList(List<ComparableCircle> l) {
        l.forEach(cc -> {
            System.out.println(cc.getAreaParent());
        });
    }

}
