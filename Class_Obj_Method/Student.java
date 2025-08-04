package Class_Obj_Method;

import java.util.Scanner;

public class Student {
    
    int studentID;
    String studentName;
    int totalSessionsAttened;
    int attendanceCredits;
    int performanceCredits;
    int totalCredits;
    int trainerRating;

    public void studentInfo(){
        System.out.println("====Student Info====");
        System.out.println("Enter Student ID: ");
        studentID = sc.nextInt();
        System.out.println("Enter Student Name: ");
        studentName = sc.next();
    }

    Scanner sc = new Scanner(System.in);

    //Attendence Credits
    public int sessionsCredit(){
        System.out.println("Enter Total sessions Attended: "+totalSessionsAttened);
        totalSessionsAttened = sc.nextInt();
        if(totalSessionsAttened>=30){
            return attendanceCredits+=5;
        }else if(totalSessionsAttened>=20){
            return attendanceCredits+=3;
        }else{
            return 0;
        }
    }

    //Performance Credits
    public int scoreCredits(int score){
        if(score>=85){
            return performanceCredits+=5;
        }else if(score>=60){
            return performanceCredits+=3;
        }else{
            return 0;
        }
    }

    //Achievements
    public void achievementStatus(){
        totalCredits = sessionsCredit() + scoreCredits(75);
        if(totalCredits>=10){
            System.out.println("Gold");
        }else if(totalCredits>=8) {
            System.out.println("Silver");
        }else{
            System.out.println("Need Improvement");
        }
    }

    //Trainer Rating
    public int trainerRatings() {
        System.out.println("Enter Trainer Rating: (1-5)");
        trainerRating = sc.nextInt();

        if (trainerRating==5) {
            return 5000;
        } else {
            return 0;
        }
    }
}
