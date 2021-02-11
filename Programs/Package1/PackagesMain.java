/**
 * This is the Program demonstrating different packages.
 */
package Package1;
import Package2.PackageEx2;

public class PackagesMain {
    
    public static void main(String[] args) {
        PackagesMain p1 = new PackagesMain();
    }

    PackagesMain() {
        //PackageEx1 belongs to the same package as PackagesMain and does not need an import.
        PackageEx1 ex1 = new PackageEx1();
        ex1.printName();

        //PackageEx1 belongs to a different package and so the class needs to be imported.
        PackageEx2 ex2 = new PackageEx2();
        ex2.printName();

        //This is an alternative way to avoid importing that Class. 
        Package2.PackageEx2 ex3 = new Package2.PackageEx2();
        ex3.printName();
    }   
}
