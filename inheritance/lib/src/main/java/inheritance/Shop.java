package inheritance;
import java.util.ArrayList;
public class Shop extends Restaurant implements Reviewable  {
  private String name;
  private String description;
  private int dollarSigns;
  private int stars;

  public Shop(String name, String description, int dollarSigns, int stars, ArrayList <Review> reviews){
    super(reviews);
    this.name = name;
    this.description = description;
    this.dollarSigns = dollarSigns;
    this.stars = stars;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getDollarSigns() {
    return dollarSigns;
  }

  public void setDollarSigns(int dollarSigns) {
    this.dollarSigns = dollarSigns;
  }

  @Override
  public int getStars() {
    return stars;
  }

  @Override
  public void setStars(int stars) {
    this.stars = stars;
  }




  @Override
  public void addReview(Review review) {
    reviews.add(review);
  }
  public String toString (){
    String result;
    result= "the Shop "+this.name + " Description  " +this.description +" stars" + this.stars;
    return  result;
  }
}
