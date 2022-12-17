import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
        
       System.out.println("Start of HW5");
        /// Question 1
        // Write Java statements that do the following:
        // a) Declare an arrayList nums of 15 elements of type Integer.
        // b) Output the value of the tenth element of the array nums.
        // c) Set the value of the 5th element of the array nums to 99.
        // d) set the value of the 13th element to 15
        // d) set the value of the 2nd element to 6
        // d) Set the value of the 9th element of the array nums to the sum of the 13th
        // and 2nd elements of the array nums.
        int[] nums;
        // allocate memory for 10 integers
        nums = new int[15];

        System.out.println(nums[0]);
        // Set value at index 0 to 100
        ;
        nums[0] = 100;
        nums[1] = 6;
        nums[2]= 300;
        nums[3]= 400;
        nums[4]= 99;
        nums[5]= 600;
        nums[6]= 700;
        nums[7]= 800;
        nums[8]= nums[2]+nums[12];
        nums[9]= 1000;
        nums[10] = 200;
        nums[11]= 300;
        nums[12]= 15;
        nums[13]= 500;
        nums[5]= 600;
        System.out.println("Element at index - 10: " + nums[9]);
        System.out.println("Element at index - 8: " + nums[8]);
        // Question 2
        // a) create an arrayList of Strings that contain each day of the week.(starting
        // on monday)
        ArrayList<String> daysOfWeek = new ArrayList<>(7);
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // b) output each of the days of the week
        for (String day : daysOfWeek) {
            System.out.println(day);
        }

        // c) output the days of the week that we have class
        System.out.println("Days of the week with class: ");
        for (int i = 0; i < daysOfWeek.size(); i++) {
            if (i < 5) {
                System.out.println(daysOfWeek.get(i));
            }
        }

        // d) change the arrayList to start on Sunday
        Collections.rotate(daysOfWeek, -6);

        // Question 3
        // a) create an ArrayList and prompt the user for numbers to add to it until the
        // number 0 is selected
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to add to the list (enter 0 to stop):");
        int input = scanner.nextInt();
        while (input != 0) {
            numbers.add(input);
            input = scanner.nextInt();
        }

        // b) return the largest and smallest number
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number"+ min);
    }
}