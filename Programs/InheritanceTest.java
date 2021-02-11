public class InheritanceTest {
    public static void main(String[] args) {
        InheritanceTest test = new InheritanceTest();
        test.TestBaseInheritance();
        test.TestAbstractInheritance();

    }

    public void TestBaseInheritance() {

        //Can create a Base Class instance that uses InheritClass
        BaseClass baseClass = new InheritClass(3, 5);
        baseClass.callBase();
        int val1 = baseClass.getValue();
        System.out.println("The value is: " + val1);
        baseClass.printValue();

        //Can create only a base class instance
        BaseClass bClass = new BaseClass(10);
        bClass.callBase();
        int val2 = bClass.getValue();
        System.out.println("The value is: " + val2);
        bClass.printValue();
    }

    public void TestAbstractInheritance() {
        System.out.println("\n\nTesting Abstract Classes");
        AbstractInheritedClass abstractInheritedClass = new AbstractInheritedClass(5, 10);
        abstractInheritedClass.addValue();
        System.out.println("The value is: " + abstractInheritedClass.getValue());
    }
}

class BaseClass {
    int testValue;

    BaseClass(int i) {
        testValue = i;
    }

    public int getValue() { 
        System.out.println("In Base Class getValue");    
        return testValue; 
    }

    //Final prevents overriding
    final public void printValue() {
        System.out.println("Test Value is: " + testValue);
    }
    public void callBase() {
        System.out.println("Calling base Class function");
    }
}

class InheritClass extends BaseClass {
    int newValue;

    InheritClass(int i, int j) {
        super(i);
        newValue = j;
    }

    public int getValue() { 
        System.out.println("In Inherit Class getValue");    
        return testValue + newValue;
    }
}

abstract class AbstractClass {
    int value;

    AbstractClass(int value) {
        this.value = value;
    }

    //No definition. Must be defined by child.
    abstract void addValue();

    public int getValue() {
        return value;
    }
}

class AbstractInheritedClass extends AbstractClass {
    int newValue;

    AbstractInheritedClass(int i, int j) {
        super(i);
        newValue = j;
    }


    void addValue() {
        value += newValue;
    }
}