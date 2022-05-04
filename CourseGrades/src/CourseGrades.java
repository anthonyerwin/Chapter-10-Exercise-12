import java.util.Scanner;

public class CourseGrades {

    private static Scanner scanner = new Scanner(System.in);
    private static GradeBook gradebook = new GradeBook();

    public static void main(String[] args) {
        int input = 0;


        //prompting the user for the test grades for each student
        //gradebook.getGrades();

        do{
            System.out.println();
            System.out.println("===========================");
            System.out.println("1 - Input grades");
            System.out.println("2 - Display all grades");
            System.out.println("3 - Display student grade average");
            System.out.println("4 - Display test score average");
            System.out.println("0 - Exit");
            System.out.println("===========================");
            System.out.print("Enter Choice: ");

            input = scanner.nextInt();
            switch (input){
                case 0 ->{}
                case 1 -> {
                    gradebook.getGrades();
                }
                case 2 ->{
                    gradebook.showGrades();
                }
                case 3 ->{
                    displayStudentAvg(gradebook);
                }
                case 4 ->{
                    displayTestAvg(gradebook);
                }
                default ->{
                    System.out.println("\nSomething went wrong. Try again.");
                    break;
                }
            }
        } while (input !=0);
    }

    public static void displayStudentAvg(GradeBook gradebook){
        int student = 0;
        System.out.print("Enter Student Number: ");
        student = scanner.nextInt();
        gradebook.studentAvg(student);

        // int[] student = new int[3];

        // for (int i = 0; i < student.length; i++){
        //     gradebook.studentAvg(student[i]);
        // }

    }

    public static void displayTestAvg(GradeBook gradebook){
        int test = 0;
        System.out.print("Enter Test Number: ");
        test = scanner.nextInt();
        gradebook.testAvg(test);
    }
}
