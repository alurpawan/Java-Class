public class ArraysAndClassesMain {
        public static void main(String[] args) {
        StudentComparator comparator = new StudentComparator();
        comparator.compareStudents();
    }
   
}

class StudentComparator {
    ArraysAndClassesStudent student1;
    ArraysAndClassesStudent student2;

    StudentComparator() {
        student1 = new ArraysAndClassesStudent("Ellie", new int[][]{
            {72,73,89,72,92},
            {86,99,86,83,100},
            {71,86,72,100,98}
        });

        student2 = new ArraysAndClassesStudent("George", new int[][]{
            {88,100,93,78,89},
            {76,78,80,82,89},
            {99,83,97,83,70}
        });

        student1.calculateAverages();
        student2.calculateAverages();
    }

    void compareStudents() {
        if(!student1.getAveragesCalculated() || !student2.getAveragesCalculated())
            System.out.println("Please calculate Averages..");
        
        System.out.println("The student with better marks is: " + 
        (student1.getAverage()>student2.getAverage() ? student1.name : student2.name));
    }
}