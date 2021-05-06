/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08.example02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Amulya Mallepalli
 */
public class FileChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
// TODO code application logic here
System.out.println("Answer by Amulya Mallepalli: question8");
try {
Scanner sc = new Scanner(new File("data.txt"));

 

} catch (FileNotFoundException fe) {
System.out.println(fe.getMessage());
}
try{
Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
System.out.println(number/0);
}catch(Exception e){
System.out.println(e.getMessage());
}
    }
}