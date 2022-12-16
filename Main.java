import java.util.Scanner;

public class Main {
// testing testing
    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == 'e') {
            count++;
        }
    }
    return count >= 1 && count <= 3;
    }

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        String repeatedString = "";
for (int i = 0; i < n; i++) {
repeatedString += str;
}
return repeatedString;
}

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringZ("zHelloz") -> "zHelloz"
    //stringZ("nozthaznks") -> "nothanks"
    //stringZ("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){

      String result="";
        if (str.length() == 0 || str.length() == 1) {
return str;
}
    if (str.charAt(0) == 'z') {
        result += 'z';
    }
    for (int i = 0; i <= str.length() - 1; i++) {
        if (str.charAt(i) != 'z') {
            result += str.charAt(i);
        }
    }
    if (str.charAt(str.length() - 1) == 'z') {
        result += 'z';
    }
    return result;
}

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums(){
int sum = 0;
int input = -1;

    Scanner number = new Scanner(System.in);
System.out.println("I will add up the numbers you give me till you enter zero ");
    while (input != 0) {
        input = number.nextInt();
        sum += input;
        System.out.println("The total so far is: " + sum);
    }
    System.out.println("TOTAL ENDED --- The total is " + sum);
} 
    


    public static void main(String[] args) {
        // Add code to help test your methods here
        System.out.println("Start of Main");
      System.out.println("");
      System.out.println("~~~~Testing First Method~~~");
      System.out.println("");
      System.out.println(loopE("eat"));
System.out.println("");
       System.out.println("~~~~Testing Second Method~~~");
      System.out.println("");
       System.out.println(stringTimes("hellohello",2));
       System.out.println("");
      System.out.println("~~~~Testing Third Method~~~");
      System.out.println("");
      System.out.println(stringZ("zHelzzzzzloz"));
      System.out.println("");
      System.out.println("~~~~Testing Fourth Method~~~");
      System.out.println("");
     sums();
    }
    
}