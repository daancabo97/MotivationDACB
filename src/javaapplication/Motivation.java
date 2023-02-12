
package javaapplication;

public class Motivation {
   public static void main(String[] args) {
      String belief = "Believe in yourself";
      String inside = "something inside you that is greater";
      String obstacle = "any obstacle";
      String motivation = "Motivation is what gets you started.";
      String habit = "Habit is what keeps you going.";
      String tryAgain = "Every failure is an opportunity to begin again, this time more intelligently.";
      String quote = belief + " and all that you are. Know that there is " + inside + " than " + obstacle + ".";
      int randomNum = (int) (Math.random() * 3) + 1;
      if (randomNum == 1) {
         quote = motivation;
      } else if (randomNum == 2) {
         quote = habit;
      } else {
         quote = tryAgain;
      }
      System.out.println(quote);
   }
}