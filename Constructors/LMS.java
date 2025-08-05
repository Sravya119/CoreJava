package Constructors;

public class LMS {
    public static void main(String[] args) {
        
        // Set Student Identity
        // Student s1 = new Student(); -> previously

        // set Student Identity using Constructor
        Student s1 = new Student(101, "Ravi");

        Student s2 = new Student(102, "Krishna", 990909099, 20);

        // student info method - Hover
        s1.studentInfo();

        // student info method - Click
        s2.studentCompleteInfo();

        // Achievement Status
        s1.achievementStatus();

        // Set Trainer Identity
        Trainer t1 = new Trainer();
        t1.trainerID = 101;
        t1.trainerName = "Ravi";

        // Trainer info method
        t1.trainerInfo();

        // Calculate Trainer payment
        t1.sessionsPayments();

    }
}
