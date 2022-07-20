import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class fizzBuzz {
    public static List<String> fizzbuzz(int n) { // returns list of Strings as solution

        List<String> solution = new ArrayList<String>();
    
        for(int i = 1; i <= n; i++) { // iterates from 1-n
            boolean divByThree = (i % 3 == 0);
            boolean divByFive = (i % 5 == 0);

            if(divByThree && divByFive) { // adds respective text to new list
                solution.add("FizzBuzz");
            }
            else if (divByThree) {
                solution.add("Fizz");
            }
            else if (divByFive) {
                solution.add("Buzz");
            }
            else {
                solution.add(Integer.toString(i)); // convert int to string for list solution
            }
        }

        return solution;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number greater than zero");
        int number = sc.nextInt();
        System.out.println(Arrays.toString(fizzbuzz(number).toArray()));
        sc.close();
    }

}