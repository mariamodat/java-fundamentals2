package inheritance;

import java.util.ArrayList;

public class Theater extends Review implements Reviewable {
  private final String name;
  ArrayList<Review> reviews;
  ArrayList<String> movies;

  public Theater(String name, ArrayList<Review> reviews, ArrayList<String> movies) {
    this.name = name;
    this.reviews = reviews;
    this.movies = movies;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public ArrayList<String> getMovies() {
    return movies;
  }

  @Override
  public String toString() {
    return "Theater{" +
      "name='" + name + '\'' +
      ", reviews=" + reviews +
      ", movies=" + movies +
      '}';
  }

  @Override
  public void addReview(Review review) {
    if (reviews.size()==0 ){
      reviews.add(review);
    }
    else {
      for (Review rev : reviews){
        if (rev.getAuthor()== name){
          System.out.println("  Adding reviews is allowed only once! ");
        }
        else {
          reviews.add(rev);
          setStars(rev.getStars());
        }
      }
    }
    // done ....
  }


}
