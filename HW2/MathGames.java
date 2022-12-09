
package HW2;
import java.lang.Math;
import java.util.Scanner;

public class MathGames {
    public static void main(String[] args)  
    {
    // 1. Create a method that will calculate the Pythagorean Theorem (https://en.wikipedia.org/wiki/Pythagorean_theorem)
// c = sqrt(a^2+b^2)
// NOTE: You can assume you will only need to calculate the Hypotenuse
// Hint 1: Method should take in 2 sides(a and b) of the triangle and return the missing side.
//      Remember the Triangle has a base, Perpendicular, and Hypotenuse
// Hint 2: Math.pow and Math.sqrt are your friend here
// Bonus points: Try to make it accept any 2 sides and return the 3rd. So it can take in
// Hypotenuse and Perpendicular and return the base.
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Assignment #1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

        System.out.println();
Scanner side1 = new Scanner(System.in); 
    System.out.println("Enter adjacant side 1");
double adj1= side1.nextDouble();
Scanner side2 = new Scanner(System.in);  
    System.out.println("Enter adjacant side 2");
double adj2= side2.nextDouble();
double adj2powered= Math.pow(adj2,2) ;
double adj1powered= Math.pow(adj1,2) ; 
double hypotonues=Math.sqrt(adj1powered+adj2powered);
System.out.println("the hypotonues is "+hypotonues); 
System.out.println();

// 2. Create a method that will calcuate my grade in the class. You can use the grade range as follows
// A: 100 - 90
// B:  89 - 80
// C:  79 - 70
// D:  69 - 60
// F:  60 -  0 
// method should accept the grade as a double and return the letter grade of what I got
// NOTE: Im a really nice guy and always round up on my grading so a 69.3 will round up to a 70.0
// Hint 1: if statements are your friend here you will probably need at the least 5 if / ifelse / else statments
// Hint 2: You will probably need to cast the double to an int
// Hint 3: You will probably need to use the Math.ceil() method 

            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Assignment #2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
System.out.println();
            Scanner grade1 = new Scanner(System.in); 
            System.out.println("Please enter your first grade");
        double firstgrade= grade1.nextDouble();

        Scanner grade2 = new Scanner(System.in); 
        System.out.println("Please enter your second grade");
    double secondgrade= grade2.nextDouble();
        double classgradebeforeround= (secondgrade+firstgrade)/(2);
        double classgrade= Math.ceil(classgradebeforeround);
        System.out.println();

        if (classgrade>=90 ) {
            System.out.println("your class grade is an A ! "+classgrade);
         
        } 
        else if(classgrade<=89 && classgrade >=80) {
            System.out.println("your class grade is an B ! "+classgrade);   
        }
        else if(classgrade>=70 && classgrade<=79) {
            System.out.println("your class grade is an c ! "+classgrade);   
        }
        else if(classgrade>=60 & classgrade<=69) {
            System.out.println("your class grade is an D "+classgrade);   
        }
        else if(classgrade<=59) {
            System.out.println("your class grade is an F "+classgrade);   
        }

    // 3. Create a method that will calculate the tip on a bill per person
    //      Method parameters: total bill, amount of people splitting the bill, percentage to tip.
    //      Note: I would like the total always rounded up to a whole number
    //      Hint 1: percentage can be made easier to work with if you divide by 100 so 18% is 18/100 = 0.18
    //      Hint 2: Using doubles will be helpful for when you need to calculate decimals
    //      Hint 3: It is possible you might need to Cast a double to an int or vice versa
    //      Hint 4: You will probably need to use the Math.ceil() method 

    
    


Scanner customer = new Scanner(System.in);
    System.out.println("Please enter your bill amount");
  double billamount= customer.nextDouble();

    Scanner customertip = new Scanner(System.in);
    System.out.println("Please enter the percentage tip you would like to tip ");
  double tipamount= customertip.nextDouble();
  double totaltip= (tipamount/100)*billamount;
   double totalbill= billamount+totaltip;

    System.out.println(tipamount+" % of your bill is "+totaltip+ " your overall bill amount with your tip is "+ totalbill);
   

    }
}