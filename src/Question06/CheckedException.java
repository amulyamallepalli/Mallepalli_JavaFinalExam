/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Amulya Mallepalli
 */
public class CheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Answer by Amulya Mallepalli: question6");
        
        Scanner s1 = new Scanner(new File("file.txt"));
        while (s1.hasNext()) {            
            showData(s1.next());
        }
    }
   
    public static void showData(String s1) {
        System.out.println(s1);        
    }
    
}
