import java.util.Random;

public class Main {
  public static void main(String[] args) {

    // TODO: Move to a separate class
    Random roller = new Random();

    // Fix the values coming up as 0 by adding 1 to them
    // TODO: Create a DiceRoller class that takes the sides argument to roll dice
    int d6 = roller.nextInt(5);
    d6 += 1;
    System.out.println(d6);

    int d10 = roller.nextInt(9);
    d10 += 1;
    System.out.println(d10);

    int d20 = roller.nextInt(19);
    d20 += 1;
    System.out.println(d20);
  }
}
