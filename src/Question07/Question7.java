/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

import java.util.Scanner;

/**
 *
 * @author Amulya Mallepalli
 */
public class Question7 {

    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < num.length; i++) {

            num[i] = (int)(Math.random() * 100);
        }
        System.out.println("Answer by Amulya Mallepalli: question7");

        System.out.print("Enter a index value: ");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        try {
            System.out.println("Integer at index " + index + " is "
                    + num[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index Out of Bound exception");
        }
    }
}
