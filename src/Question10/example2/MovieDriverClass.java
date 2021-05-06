/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.example2;

import java.util.ArrayList;

/**
 *
 * @author Amulya Mallepalli
 */
public class MovieDriverClass {
    public static int cnt = 0;
    public static ArrayList<Movie> list = new ArrayList();


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer by Amulya Mallepalli: question10");
        list.add(new Movie("Parugu",3.5));
        list.add(new Movie("Geetha Govindam",4 ));
        list.add(new Movie("Dear Comrade", 3));
        list.add(new Movie("Julayi",4.5));
        list.add(new Movie("Ala Vaikuntapuram lo",4));
        list.add(new Movie("jathi ratnalu",2.5));
        System.out.println(searchMovie("Julayi"));

    }

    public static String searchMovie(String MovieName) {

        if (list.get(cnt).getMovieName().equalsIgnoreCase(MovieName)) {
            return list.get(cnt).toString();
        } else {
            if (cnt == list.size()-1) {
                return "Movie not found";
            }
            cnt++;
            return searchMovie(MovieName);
        }
    }

}

  