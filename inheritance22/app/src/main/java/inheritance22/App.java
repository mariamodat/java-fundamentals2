/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance22;

public class App {


    public static void main(String[] args) {

      Review res = new Restaurant("mariam" ,4 ,"very Good");
      Restaurant casting = (Restaurant) res;
      casting.setName("Deep Dish ");
      Restaurant rev11= new Restaurant("Joudy" , 3,"good");
      rev11.setName("Deep Dish");
      rev11.addReview(casting);


//      System.out.println(res.toString());
      System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
//      System.out.println(.toString());
    }
}