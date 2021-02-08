public class ArraysAndClassesStudent {

    int[][] gradesIndividual = new int[3][5];
    int[] gradesAverage = new int[3];
    int average;

    String name;
    boolean averagesCalculated;

    ArraysAndClassesStudent(String name, int[][] gradesIndividual) {
        this.name = name;
        this.gradesIndividual = gradesIndividual;
        averagesCalculated = false;
    }

    public boolean getAveragesCalculated() { return averagesCalculated;}
    public int getAverage() { return averagesCalculated ? average : -1; }
    public String getName() {return name;}

    public void calculateAverages() {
        int totalSum = 0;
        for(int i = 0;i < 3;i++) {
            int subjectSum = 0;
            for(int j = 0;j < 5;j++) {
                subjectSum += gradesIndividual[i][j];
            }
            subjectSum /= 5;
            totalSum += subjectSum;
            gradesAverage[i] = subjectSum;
        }
        totalSum /= 3;
        average = totalSum;
    }
}
