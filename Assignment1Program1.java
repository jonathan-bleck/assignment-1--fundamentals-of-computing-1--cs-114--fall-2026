//  import java.util.Scanner;
 import java.util.Random;
 import java.util.Scanner;


public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("JJJJJJJJJ  BBBBBBB  ");
    System.out.println("   JJJ     B      B ");
    System.out.println("   JJJ     B     B  ");
    System.out.println("   JJJ     BBBBBB   ");
    System.out.println("   JJJ     B     B  ");
    System.out.println("JJ JJ      B      B ");
    System.out.println(" JJJ       BBBBBBB  ");
     // this will split the intials and the next part of code

    System.out.println();
      // ask for input by user
    
      // Create a scanner for the 5 numbers
    // int num1, num2, num3, num4, num5;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter in 5 characters");
    String userinput = scanner.nextLine();
    userinput = userinput.substring(1,4);
    userinput = new StringBuilder(userinput).reverse().toString();
    // userinput = userinput.substring(1,2); not sure if I need this, will test and return if needed

    // System.out.println("Test " + userinput );


      // converting fahrenheit to celsius 
    int fahrenheit;
    int celsius;
    System.out.println();
    Scanner scan = new Scanner(System.in); 
    System.out.println("Please input any degree of temp in Fahrenheit");  
    fahrenheit = scan.nextInt();

    celsius = (fahrenheit - 32) * 5/9;
    System.out.println("Converting " + fahrenheit + " fahrenheit to celsius, we get " + celsius);

      // random value + the variable that holds the number
      // int randomvalue;
      System.out.println();
      Random random = new Random();
      int randomvalue;

      randomvalue = random.nextInt(16352) + 32;

      System.out.println();
      System.out.println("your new random string is " + celsius + userinput + randomvalue);


  }
}
