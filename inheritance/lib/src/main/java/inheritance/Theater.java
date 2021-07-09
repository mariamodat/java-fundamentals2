package inheritance;

import java.util.ArrayList;

public class Theater {
  private final String name;
  ArrayList<Review> reviews;
  ArrayList<String> movies;

  public Theater(String name, ArrayList<Review> reviews, ArrayList<String> movies) {
    this.name = name;
    this.reviews = reviews;
    this.movies = movies;
  }



}
