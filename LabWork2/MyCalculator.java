package LabWork2;

import java.util.Scanner;
/* You can read following links to get better understanding on following code ( I chose some websites which might be helpfull in my opinion ) :
    https://www.geeksforgeeks.org/double-isnan-method-in-java-with-examples/
    https://www.baeldung.com/java-not-a-number
    https://stackoverflow.com/questions/2618059/in-java-what-does-nan-mean
 */
public class MyCalculator {
    public static void main(String[] args) {
        // Comments for lab partners
        Scanner in = new Scanner(System.in); // Creating scanner so we can input numbers
        System.out.print("Choose arithmetic expression\n");
        System.out.print("Format: A operator B, where A and B4-9 are positive SINGLE DIGIT integers\n");
        System.out.println("Allowed operators: + - * / ^");
        String choice = in.nextLine().replaceAll(" ", ""); // .replaceAll will delete all spaces given
        if (choice.length() == 3){ // as we were given , format would not exceed 3 numbers . For example 1 + 4, 4 * 4. So we know that we have only 3 characters in our expression
            if ( !Double.isNaN( evaluateExpression(choice))){ // Check if the result is a number. Of not return error message
                System.out.print("Evaluated expression : " + evaluateExpression(choice));
            }
            else{
                System.out.println("ERROR: Impossible to evaluate this expression.");
            }

        }
        else{
            System.out.print("ERROR: This expression is either too long or too short.");
        }


    }

    public static double evaluateExpression(String expression) { // Creating new method which evaluates our expression
        int A = Integer.parseInt(expression.substring(0,1)); // to get integer value of first number , we use parsing from String to int
        int B = Integer.parseInt(expression.substring(2)); // same thing for the second number
        char operation = expression.charAt(1); // find what operation will we use. Formated expression will always have operator at index 1 - 1+2. 1 has index 0, + has index 1, 2 has index 2;
            switch (operation) { // we use switch cases for this problem as requested
                case '+': // we write in what case should we use following code. in our case if we have + then we will add.
                  if (!Double.isNaN(A+B)) { // We check if value is a number. boolean expression . isNan = is non a number . We put ! at the begining meaning that if ( value is not a number = false ) then do following
                    return A+B;
                  }
                  else {
                      return Double.NaN;
                  }
                  // Same happens for the following cases
                case '-':
                    if ( !Double.isNaN(A-B)){
                        return A-B;
                    }
                    else{
                        return Double.NaN;
                    }
                case '*':
                    if ( !Double.isNaN(A * B)){
                        return A*B;
                    }
                    else {
                        return Double.NaN;
                    }
                case '/':
                    if ( !Double.isNaN(A/B)) {
                        return A/B;
                    }
                    else {
                        return Double.NaN;
                    }
                case '^':
                    if ( !Double.isNaN(Math.pow(A , B))){
                        return Math.pow(A , B);
                    }
                    else{
                        return Double.NaN;
                    }
                default: // default output in case if something goes wrong. We don't really need it in this code.
                    System.out.println("ERROR: Unknown operator.");
            }
            // if non of the cases works it will return not a number
        return Double.NaN;



    }

}