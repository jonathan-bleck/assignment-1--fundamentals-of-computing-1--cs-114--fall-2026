import java.util.Scanner;

public class Assignment1Program2 {
  public static void main(String[] args) {

    // Labelling the program  
  System.out.println("Base coversion program");
  System.out.println();

  System.out.println("Enter a base between 2 and 9");
  Scanner scanner = new Scanner(System.in);
  String userbaseinput = scanner.nextLine();
    // choose the base for the conversion
  int ubi1 = Integer.parseInt(userbaseinput);
  int ubi2 = Integer.parseInt(userbaseinput);
  int ubi3 = Integer.parseInt(userbaseinput);
  int ubi4 = Integer.parseInt(userbaseinput);
  int userbasemax;

  userbasemax = ((((ubi1)*ubi2)*ubi3)*ubi4)-1;
  
  System.out.println();
  System.out.println("The max 4 digit, base 10 number in base " + userbaseinput + " is " + userbasemax);

  System.out.println("Please enter a 4 digit, base 10 number that is between 0 and " + userbasemax);
  Scanner scan = new Scanner(System.in);
  String conversioninput = scan.nextLine();

   //time to take the conversioninput and convert it from base 10 to what the base the user inputted

  int conversion = Integer.parseInt(conversioninput);
    // these are going to the the digets of the conversion
  int firstdigit;
  int seconddigit;
  int thirddigit;
  int fourthdigit;

    // this is the first digit of the conversion
  int firstcalc;
  firstcalc = conversion / ubi1;
  int firstcalc2; 
  firstcalc2 = firstcalc * ubi1;
  firstdigit = conversion - firstcalc2;

  System.out.println();
  System.out.println(firstdigit);


    // this is the second digit of the conversion
  int secondcalc;
  secondcalc = firstcalc / ubi2;
  int secondcalc2;
  secondcalc2= secondcalc * ubi1;
  seconddigit = firstcalc - secondcalc2;
  seconddigit = seconddigit * (ubi1);

  System.out.println();
  System.out.println(firstdigit);
  System.out.println(seconddigit);

    // this is the third digit of the conversion
  int thirdcalc;
  thirdcalc = secondcalc / ubi1;
  int thirdcalc2;
  thirdcalc2 = thirdcalc * ubi1;
  thirddigit = secondcalc - thirdcalc2;
  thirddigit = thirddigit * ((ubi1)*ubi1);
  
  System.out.println();
  System.out.println(firstdigit);
  System.out.println(seconddigit);
  System.out.println(thirddigit);

    // this is the fourth digit of the conversion
  int fourthcalc;
  fourthcalc = thirdcalc / ubi1;
  int fourthcalc2;
  fourthcalc2 = fourthcalc * ubi1;
  fourthdigit = thirdcalc - fourthcalc2;
  fourthdigit = fourthdigit * (((ubi1)*ubi1)*ubi1);

  System.out.println();
  System.out.println(firstdigit);
  System.out.println(seconddigit);
  System.out.println(thirddigit);
  System.out.println(fourthdigit);



  System.out.println(conversion + " in base 10 is...");
  System.out.println(fourthdigit +"" + thirddigit +"" + seconddigit +"" + firstdigit + " in base " + userbaseinput);

  }
}
