import java.util.Scanner;
class Student {
    private String usn;
    private String name;
    private int marks1, marks2, marks3;

    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter marks in 3 subjects: ");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
    }

    void displayResult() {
        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        System.out.println("\n--- Student Result ---");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (marks1 >= 35 && marks2 >= 35 && marks3 >= 35) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

class MainStudent {
    public static void main(String[] args) {
        Student s = new Student();

        s.getData();
        s.displayResult();
    }
}
