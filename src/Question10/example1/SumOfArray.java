/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.example1;

/**
 *
 * @author Amulya Mallepalli
 */
public class SumOfArray {

    static int a[] = {1, 2, 3, 5, 6, 7, 8, 9, 12, 34, 67, 12, 32};
    static int count = 0;
    static double sum = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question10");
        System.out.println("The sum of all integers in an array:");
        System.out.println(sumArray());

    }

    public static double sumArray() {
        if (count == a.length - 1) {
            return sum = sum + a[count];
        } else {
            count = count + 1;
            sum = sum + a[count];
            return sumArray();

        }

    }

}
