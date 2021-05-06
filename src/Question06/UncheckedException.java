/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import Question08.Cellphone;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Amulya Mallepalli
 */
public class UncheckedException {

    public static void main(String[] args) throws InputMismatchException,
            FileNotFoundException {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question6");
        ArrayList<Cellphone> cells = new ArrayList<>();
        Scanner scan = null;
        scan = new Scanner(new File("input.txt"));

        while (scan.hasNext()) {
            int age = 0;
            String name = "";
            name = scan.next();
            age = scan.nextInt();

            cells.add(new Cellphone(name, age));
        }
        System.out.println(cells);
    }

}
