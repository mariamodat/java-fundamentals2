package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviewable {
  private String name ="";
  private int stars =0;
  private int priceCategory= 0;
  private ArrayList<Review> reviews;

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

  public int getPriceCategory() {
    return priceCategory;
  }

  public void setPriceCategory(int priceCategory) {
    this.priceCategory = priceCategory;
  }

  public Restaurant (String name , int stars , int priceCategory ){
    this.name=name ;
    this.stars=stars;
    this.priceCategory=priceCategory;
    this.reviews=new ArrayList<>();

  }

  public String toString(){
    String result;
    result= "the Restaurant "+this.name + "has " +this.stars +"stars" + this.priceCategory +"$";
    return  result;}

  @Override
  public void addReview(Review review) {
    reviews.add(review);
  }
}
