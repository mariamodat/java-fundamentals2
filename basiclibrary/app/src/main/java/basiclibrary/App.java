/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package basiclibrary;

import java.util.*;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class App {

    public static void main(String[] args) {
        // Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = { { 66, 64, 58, 65, 71, 57, 60 }, { 57, 65, 65, 70, 72, 65, 51 },
                { 55, 54, 60, 53, 59, 57, 61 }, { 65, 56, 55, 52, 55, 62, 57 } };

        // within your main method...
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        // votes.add("Bush");
        // votes.add("Bush");
        // votes.add("Shrub");
        // votes.add("Hedge");
        // votes.add("Hedge");
        // votes.add("Hedge");
        // votes.add("Hedge");
        // votes.add("Hedge");
        // votes.add("Hedge");
        // votes.add("Shrub");
        // votes.add("Bush");
        // votes.add("Hedge");
        // votes.add("Bush");

        // print out the results :

        System.out.println(Arrays.toString(getMinAndMax(weeklyMonthTemperatures)));
        int[] x = getMinAndMax(weeklyMonthTemperatures);
        // System.out.println(findDisappearedNumbers(x));

        System.out.println("<<<<<<<<<<<<the second task<<<<<<<<<<<<<<<<");
        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");

        // **** to print out the unique numbers:****
        List<Integer> uniqueNums = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();
        for (int[] week : weeklyMonthTemperatures) {
            for (int day : week) {
                set.add(day);
            }
        }
        Iterator<Integer> i = set.iterator();
        while (i.hasNext()) {
            // System.out.println(i.next());
            uniqueNums.add(i.next());
        }
        System.out.println(uniqueNums);
        // Never saw temperature
        for (int k = x[0]; k < x[1]; k++) {
            if (!uniqueNums.contains(k)) {
                System.out.println("Never saw temperature: " + k);
            }
        }

        System.out.println("the roll method :  "+Arrays.toString(roll(3)));
        containsDuplicates();
        int[] xx = { 1, 2, 3, 4 };
        System.out.println("Avg of an arr :  "+averageOfArray(xx));
        System.out.println("the Avg of nested Arr :  "+Arrays.toString(averageOfNestedArrays()));

    }

    // 1. fuction to get the min and max temp

    public static int[] getMinAndMax(int[][] arr) {
        int min = 100;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                } else if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }

        int[] values = { min, max };
        return values;

    }

    // 2. function tally ro get the most votes

    public static String tally(List<String> votes) {
        int count = 0;
        int maxCount = 0;
        String word = "";
        // Determine the most repeated word in a file
        for (int i = 0; i < votes.size(); i++) {
            count = 1;
            // Count each word in the file and store it in variable count
            for (int j = i + 1; j < votes.size(); j++) {
                if (votes.get(i).equals(votes.get(j))) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                word = votes.get(i);
            }

        }

        return word;
    }

    // lab 02 solution :

    // 1. rolling a dice

    public static int[] roll(int n) {
        Random random = new Random();
        // int rand = 0;
        int[] newArr = new int[n];
        int max = 0;
        int min = 7;
        for (int i = 0; i < n; i++) {
            int rand = (int) Math.floor(Math.random() * (max - min + 1) + min);
            newArr[i] = rand;
            // if(rand !=0) break;
        }

        return (newArr);

    }

    // 2. contains Duplicates function test:

    public static boolean containsDuplicates() {
        int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
        boolean test = false;
        // int testArr[]= new int[arr.length];
        {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        test = true;
                    } else {
                        test = false;
                    }

                }
            }

        }
        System.out.println(test);
        return test;

    }

    // 3. calculating the average of array elements :
    public static int averageOfArray(int[] arr) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg = avg + arr[i];
        }
        return avg / arr.length;
    }

    // 4. calculating the Average of array of arrays:
    public static int[] averageOfNestedArrays() {
        // Daily average temperatures for Seattle, October 1-28 2017
        double avg = 0;
        int sum = 0;
        int x = 0;
        double lowest = 100;
        int[][] weeklyMonthTemperatures = { { 66, 64, 58, 65, 71, 57, 60 }, { 57, 65, 65, 70, 72, 65, 51 },
                { 55, 54, 60, 53, 59, 57, 61 }, { 65, 56, 55, 52, 55, 62, 57 } };

        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {

            avg = 0;
            sum = 0;
            for (int el : weeklyMonthTemperatures[i]) {
                sum += el;
            }

            avg = sum / weeklyMonthTemperatures[i].length;
            if (lowest > avg) {
                lowest = avg;
                x = i;
            }
        }

        return weeklyMonthTemperatures[x];
    }

}
