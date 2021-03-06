/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
     @Test
     void minAndMaxTest() {
     int[][] weeklyMonthTemperatures = { { 66, 64, 58, 65, 71, 57, 60 }, { 57, 65,
     65, 70, 72, 65, 51 },
     { 55, 54, 60, 53, 59, 57, 61 }, { 65, 56, 55, 52, 55, 62, 57 } };
     App ddd = new App();

      assertEquals(51,App.getMinAndMax(weeklyMonthTemperatures)[0]);
      assertEquals(72,App.getMinAndMax(weeklyMonthTemperatures)[1]);
     }

     @Test void testTally (){
       App test1 = new App();
       List<String> votes = new ArrayList<>();
       votes.add("Mariam");
       votes.add("Bush");
       votes.add("Mariam");
       votes.add("Mariam");

       String actual=App.tally( votes);
       assertEquals("Mariam",actual);
     }

//  @Test
//  void rollDice() {
//
//    App ddd = new App();
//
//    int[] actual = App.roll(2);
//    assertEquals();
//
//  }

  @Test void containsDoublicateTest (){
    App ddd = new App();
    int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
    assertEquals(true, App.containsDuplicates());
  }


  @Test void calcAvg(){
    App ddd = new App();
    int[] xx = { 1, 2, 3, 4 };
assertEquals(2,App.averageOfArray(xx));
  }


  @Test void calcAvgOfNestedArr(){

    App ddd = new App();
    int[][] weeklyMonthTemperatures = { { 66, 64, 58, 65, 71, 57, 60 }, { 57, 65, 65, 70, 72, 65, 51 },
      { 55, 54, 60, 53, 59, 57, 61 }, { 65, 56, 55, 52, 55, 62, 57 } };
   int []arr = App.averageOfNestedArrays();
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum =sum + arr[i];
    }
    int aavg= sum / arr.length;
    assertEquals(57,aavg);
  }
}
