package Class_Obj_Method;

public class PaymentTracker {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.studentInfo();
        s1.achievementStatus();

        Trainer t1 = new Trainer();

        t1.trainerInfo();
        t1.sessionsPayments();

    }
}
