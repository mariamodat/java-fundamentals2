package inheritance22;

public class Review {
  private String author ;
  private int stars ;
   private String body ;


   public Review (String author , int stars, String body){
     this.author=author;
     this.stars=stars;
     this.body=body;
   }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getStars() {
    return stars;
  }

  public void setStars(int stars) {

    this.stars = stars;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String toString (){
     String result ;
     result= "The review is from  " + this.author +" And Description : " +this.body + " has Stars: " + this.stars;
     return  result;
  }


}
