package inheritance;
import java.util.ArrayList;
public class Shop extends Review implements Reviewable  {
  private String name;
  private String description;
  private int dollarSigns;
  protected ArrayList<Review> reviews = new ArrayList<>();

  public Shop(String name, String description, int dollarSigns) {
    this.name = name;
    this.description = description;
    this.dollarSigns = dollarSigns;

  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getDollarSigns() {
    return dollarSigns;
  }

  @Override
  public void addReview(Review review) {

    if (reviews.size()==0){
      reviews.add(review);

    }
    else {
      for (Review rev : reviews){
        if (rev.getAuthor()==name){
          System.out.println(" Adding Review once only! ");
        }
        else {reviews.add(rev);
        rev.setBody(rev.getBody());}
      }
    }
  }
}
