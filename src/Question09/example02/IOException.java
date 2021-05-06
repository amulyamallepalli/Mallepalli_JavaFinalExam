/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09.example02;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author Amulya Mallepalli
 */
public class IOException {

    /**
     *
     * @throws IOException
     */
    public static void findFile() throws java.io.IOException {
        // code that may produce IOException
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        System.out.println("Answer by Amulya Mallepalli: question9");
        try {
            findFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
