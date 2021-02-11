/**
 * This is a Program demonstrating static methods and variables.
 */
public class StaticMain {
    public static void main(String[] args) {

        //Can call static values in Main
        System.out.println("Constant Static Value: " + SampleClass.STATIC_CONSTANT);
        StaticMain m = new StaticMain();
    }

    StaticMain() {
        SampleClass obj1 = new SampleClass();
        SampleClass obj2 = new SampleClass();

        System.out.println("Initial Value of staticValue: " + SampleClass.getStaticValue());
        
        //Modify staticValue using obj1
        obj1.setNormalValue(5);
        obj1.modifyValue();
        System.out.println("Value of staticValue: " + SampleClass.getStaticValue());

        //Modify staticValue using obj2
        obj2.setNormalValue(3);
        obj2.modifyValue();
        System.out.println("Value of staticValue: " + SampleClass.getStaticValue()); //This changes the same variable

        //Modify staticValue using a static method
        SampleClass.addStaticValue(10);
        System.out.println("Value of staticValue: " + SampleClass.getStaticValue());
    }
}

class SampleClass {
    static int staticValue = 1;
    public static final int STATIC_CONSTANT = 120;

    int normalValue;

    //Constructor
    SampleClass() { normalValue = 0; }

    public void setNormalValue(int value) { normalValue = value; }

    public void modifyValue() {
        staticValue += normalValue;
    }
    
    //Static Function
    public static int getStaticValue() { return staticValue; } 

    public static void addStaticValue(int value) { staticValue += value; }

}

