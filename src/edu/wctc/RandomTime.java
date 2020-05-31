package edu.wctc;
import java.util.Random;

public class RandomTime {

  private Random inHour = new Random();
  private Random outHour = new Random();
  private Random minute = new Random();

    /**
     * This method returns a random number for testing
     * @return
     */
  public int checkInHour() {
      return inHour.nextInt(5) + 7;
  }
    /**
     * This method returns a random number for testing
     * @return
     */
  public int checkOUtHour() {
      return outHour.nextInt(10) + 13;
  }
    /**
     * This method returns a random number for testing
     * @return
     */
  public int checkMinute() {
      return minute.nextInt(60);
  }

}
