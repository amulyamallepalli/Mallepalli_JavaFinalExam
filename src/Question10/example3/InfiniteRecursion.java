/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.example3;

/**
 *
 * @author Amulya Mallepalli
 */
public class InfiniteRecursion {

    public static void main(String[] args) {
        System.out.println("Answer by Amulya Mallepalli: question10");
        int result = sum(10);
        System.out.println("The sum of first 10 natural numbers is " + result);
    }

    public static int sum(int k) {//Recursive method 

        return k + sum(k - 1);

    }
}
