import java.util.Scanner;

public class GradeBook {

    private int[][] grades;
    private Scanner scanner = new Scanner(System.in);

    // Number of students and tests
    public GradeBook() {
        this.grades = new int[3][5]; // row, column : student number, test score
    }

    // prompt for the grades for each student
    public void getGrades() {
        int gradeInput = 0;

        // Displaying each student
        for (int i = 0; i < this.grades.length; i++) {
            scanner.reset();
            System.out.print("\nStudent " + (i + 1) + "\n");

            // Entering test scores for each test
            for (int j = 0; j < this.grades[i].length; j++) {
                System.out.print("Enter test score " + (j + 1) + ": ");
                gradeInput = scanner.nextInt();
                this.grades[i][j] = gradeInput;
            }
        }
    }

    // displays grades
    public void showGrades() {

        // Displaying each students
        for (int i = 0; i < this.grades.length; i++) {
            String showGrades = "";
            System.out.println("\nStudent " + (i + 1) + " (" + grades[i].length + " Test scores):");

            // Displaying test scores per student
            for (int j = 0; j < this.grades[i].length; j++) {
                showGrades = showGrades + grades[i][j] + "\n";
            }
            System.out.print(showGrades);
        }
    }

    // has student number parameter, displays average grade for that student
    public void studentAvg(int student) {

        double studentAvg = 0;
        double total = 0;

        for (int i = 0; i < grades[student - 1].length; i++){
            total += grades[student - 1][i];
        }
        studentAvg = total / 5;
        System.out.printf("Average grade for Student %d: %.2f\n", student, studentAvg);

        //System.out.println("\n=====Displaying Student Average=====");
        // for (int i = 0; i < this.grades.length; i++){
        //     System.out.println("\nAverage grade for student " + (i + 1) + ": ");

        //     for (int j = 0; j < this.grades[0].length; j++){
        //         total = total + this.grades[0][i];
        //     }
        //     //studentAve = total / this.grades.length;
        //     studentAve = total / 4;
        //     System.out.println(studentAve);


        //     // for (int j = 0; j < this.grades[student - 1].length; j++){
        //     //     total = total + this.grades[student - 1][i];
        //     // }

        // }
    }

    // has test number parameter, displays the average grade for the test
    public void testAvg(int test) {
        
        double testAvg = 0;
        double total = 0;

        for (int i = 0; i < grades.length; i++){
            total += grades[i][test - 1];
        }
        testAvg = total / 3;
        System.out.printf("Average score for Test %d: %.2f\n", test, testAvg);

        // System.out.println("\n=====Displaying Average Test Score=====");
        // for (int i = 0; i < this.grades.length; i++){
        //     System.out.println("\nAverage grade for test " + (i + 1) + ": ");

        //     for (int j = 0; j < this.grades[0].length; j++){
        //         total = total + this.grades[0][i];
        //     }

        //     testAvg = total / 4;
        //     System.out.println(testAvg);
        // }


    }
}
