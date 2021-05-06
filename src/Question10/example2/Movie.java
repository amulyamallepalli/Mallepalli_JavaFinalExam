/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.example2;

/**
 *
 * @author Amulya Mallepalli
 */
public class Movie {

    private String movieName;
    private double rating;

    public Movie(String movieName, double rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" + "movieName=" + movieName + ", rating=" + rating + '}';
    }
    
}
