package Class_Obj_Method;

import java.util.Scanner;

public class Trainer {
    int trainerID;
    String trainerName;
    int totalSessionsTaken;
    int paymentForSessions;
    int trainingBouns;
    int totalPayment;

    Scanner sc = new Scanner(System.in);
    public void trainerInfo(){
        System.out.println("====Trainer Info====");
        System.out.println("Enter Trainer ID: ");
        trainerID = sc.nextInt();
        System.out.println("Enter Trainer Name: ");
        trainerName = sc.next();
    }

    public void sessionsPayments(){
        System.out.println("Enter Total Sessions Taken");
        totalSessionsTaken = sc.nextInt();
        paymentForSessions = totalSessionsTaken * 1500;
        
        // Access student object to inject rating
        Student studentObj = new Student();
        System.out.println("==== Student Rating====");
        trainingBouns = studentObj.trainerRatings();
        totalPayment = paymentForSessions + trainingBouns;
        System.out.println("==== Trainer Payment====");
        System.out.println("Total Payment To Be Made: "+totalPayment);
    }
}
