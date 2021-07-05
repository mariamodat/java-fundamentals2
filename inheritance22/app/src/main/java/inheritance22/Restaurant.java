package inheritance22;

import java.util.ArrayList;
import java.util.HashMap;

public class Restaurant extends Review {
   private String name ;
  private int stars ;
  private String price ;

  public Restaurant(String author, int stars, String body) {
    super(author, stars, body);
  }



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStars() {
    return stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String toString(){
    String result ;
    result = " Restaurant" + this.name + " Rate :" +this.stars + "costs$" + this.price;
    return result;
  }

  public void addReview ( Review review){
    HashMap<String, ArrayList<String>> allReviews = new HashMap<>();
    ArrayList<String> rev = new ArrayList<>();
    rev.add(review.getAuthor());
    rev.add(review.getBody());

    rev.add(String.valueOf(review.getStars()));

    allReviews.put(this.name,rev);
    System.out.println(allReviews);

  }

}
