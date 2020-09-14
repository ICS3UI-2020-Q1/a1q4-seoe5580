import java.util.Scanner;

/**
 * Helps the user calculate the slope of a line given two points
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creat a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks the users to input the first coordinates of x
    System.out.println("Please enter in the x coordinate of the first point");

    // gets the users input
    int x1 = input.nextInt();

    // asks the users to input the first coordinates of y
    System.out.println("Please enter in the y coordinate of the first point");

    // gets the users input
    int y1 = input.nextInt();

    // asks the users to input the second coordinates of x
    System.out.println("Please enter in the x coordinate of the second point");

    // gets the users input
    int x2 = input.nextInt();
    
    // asks the users to input the second coordinates of y
    System.out.println("Please enter in the y coordinate of the second point");

    // gets the users input
    int y2 = input.nextInt();

    // calculates the users slope
    int answer = (y2 - y1) / (x2 - x1);

    // tells the user the answer
    System.out.println("The slope of your line would be " + answer);


    
  }
}
