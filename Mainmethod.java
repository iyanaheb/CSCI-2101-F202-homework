
public class Mainmethod {
  public static void main(String[] args) {
    System.out.println("Start of HW1:");
    System.out.println();

    // This is our Main Method. Any code we write here will be executed when we run
    // the program.

    System.out.println("hello world");
    System.out.println(2 * 3);

    // Pyramid py = new Pyramid();
    // py.Output();

    // You will see another file called Pyramid.java
    // Write some code here to call the Output method from the Pyramid class.
    // Note: Since Pyramid is a static method you will need to call it like this:
    // Class.Method()
    // Note2: Look at Pyramid.java for more information
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Assignment
    // #1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Pyramid.printPyramid();

    // Now look at the next file called Adlibs.java
    // Write some code here to call the story method from the Adlibs class.
    // Note: Since story is not a static method you will need to create an object of
    // the Adlibs class
    // and then call the method on that object.
    // Remember to create an object like this:
    // ClassName ObjectName = new ClassName();
    // Remember to call objects like this:
    // Object.Method()
    // Note2: the story method returns a String type so you will
    // need to print out the result of the method call.
    // Note3: Look at Adlibs.java for more information
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Assignment
    // #2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Adlib adlib1 = new Adlib("I'yanah", "Pink", 21);
    System.out.print("Hello! My name is " + adlib1.getName());
    System.out.print(", and I am " + adlib1.getAge());
    System.out.print(", and my favorite color is " + adlib1.getFavColor() + "!");
    System.out.print("");

    // Finally look at File called Replace.java. This is a little more difficult.
    // Write some code here to call the charReplace method from the Replace class.
    // Note: Since charReplace is not a static method you will need to create an
    // object of the Replace class
    // and then call the method on that object.
    // Remember to create an object like this:
    // ClassName ObjectName = new ClassName();
    // Remember to call objects like this:
    // Object.Method()
    // Note2: the charReplace method returns a String type so you will
    // need to print out the result of the method call.
    // Note3: Look at Replace.java for more information

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Assignment
    // #3~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    Replace object = new Replace();
    System.out.println();
    System.out.println(object.charReplace("i wake bread", 2, 's'));
  }

}
