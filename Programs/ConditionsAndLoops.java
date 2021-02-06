/**
 * This is the Third Program demonstrating different conditional statements and loops.
 */
public class ConditionsAndLoops {
    public static void main(String[] args) {
        
        //Demonstration of if condition statement
        int sampleNumber = 10;
        if(sampleNumber > 5) {
            System.out.println("This should be printed");
        } else {
            System.out.println("This should never be printed");
        }

        //Demonstration of switch statement
        int switchDemoNumber = 2;
        switch (switchDemoNumber) {
            case 1:
                System.out.println("This is printed if the key is 1");
                break;
            case 2:
                System.out.println("This is printed if the key is 2");
                break;
            case 3:
                System.out.println("This is printed if the key is 3");
                break;
            default:
                System.out.println("This is printed for all other cases");
                break;
        }

        //Demonstration of while loop
        int whileDriver = 0;
        while(whileDriver < 3) {
            System.out.println("That value of whileDriver is: " + whileDriver);
            whileDriver++;
        }

        //Demonstration of do-while loop
        int doDriver = -1;
        do {
            System.out.println("This is executed atleast once");
            doDriver--;
        } while(doDriver >= 0);

        //Demonstration of for loop
        for(int forDriver = 0;forDriver < 3;forDriver++) {
            System.out.println("The value of forDriver is: " + forDriver);
        }
        
    }
}
