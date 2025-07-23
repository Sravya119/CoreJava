package Operators;

public class CalculateMonthlyEMI {
    public static void main(String[] args) {
        String car = "Mahindra Scorpio";
        float rating = 4.7f;
        int reviews = 1;
        int win = 1000;
        String description = "The Scorpio is one of Mahindra's oldest nameplates in India.";


        System.out.println("Car Name: " + car);
        System.out.println("Rating: " + rating);
        System.out.println(reviews + "K Reviews");
        System.out.println("Rate & Win " + win);
        System.out.println(description);

        double onRoadPrice = 2190887;
        double downPayment = 380000;
        double loanAmount = onRoadPrice - downPayment;
        double bankInterestRate = 9.5;
        int loanPeriodYears = 4;
        int loanMonths = loanPeriodYears * 12;

        double monthlyRate = bankInterestRate / (12 * 100);  // 0.00791667

        // EMI
        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, loanMonths)) / (Math.pow(1 + monthlyRate, loanMonths) - 1);

        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Loan Period: " + loanPeriodYears);
        System.out.println("Monthly EMI: " + (int)emi);
        System.out.println("Total Amount: " + onRoadPrice);



    }
}
