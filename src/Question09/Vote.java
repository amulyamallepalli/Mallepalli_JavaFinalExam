/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author Amulya Mallepalli
 */
public class Vote {
    private String name;
    private int age;

    public Vote(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
        if(age<18)
        {
            throw new IllegalArgumentException("Under age,Not Eligible for voting");
        }
        this.age=age;
    }

    @Override
    public String toString() {
        return "Vote{" + "name=" + name + ", age=" + age + '}';
    }
       
}
