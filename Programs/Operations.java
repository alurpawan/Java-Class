/**
 * This is Second Program demonstrating different operations.
 */
public class Operations {
    public static void main(String[] args) {
        int firstNum = 20;
        int secNum = 5;

        //Arithmatic Operations
        System.out.println("Arithmatic Operations on two numbers : " + firstNum + " and " + secNum);
        System.out.println("The sum is: " + (firstNum + secNum));
        System.out.println("The diff is: " + (firstNum - secNum));
        System.out.println("The product is: " + (firstNum * secNum));
        System.out.println("The division is: " + (firstNum / secNum));
        System.out.println("Using power operations: " + (firstNum^secNum));
        System.out.println("");

        //Increment and Decrement Operations
        System.out.println("Incrementing the first number: " + ++firstNum);    
        System.out.println("Decrementing the second number: " + --secNum);
        System.out.println("");

        //Relational Operations
        System.out.println("Are the two numbers equal: " + (firstNum == secNum));
        System.out.println("Is first number greater: " + (firstNum > secNum));
        System.out.println("Is second number greater: " + (firstNum < secNum));
        System.out.println("");

        //Bit Operations
        System.out.println("True AND False: " + (true && false));
        System.out.println("False OR True: " + (false || true));
        System.out.println("True XOR False: " + (true ^ false));
        System.out.println("NOT False: " + (!false));
        System.out.println("");

        //Ternary Operation
        System.out.println("Using Ternary Operator: " + ((firstNum > secNum) ? "First is Greater" : "Second is Greater"));
    }
}
