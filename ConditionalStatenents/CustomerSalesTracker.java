package ConditionalStatenents;
import java.util.Scanner;
public class CustomerSalesTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Id:");
        int customerId = scanner.nextInt();
        //scanner.nextLine(); 
        System.out.println("Enter Customer Name:");
        String customerName = scanner.next();
        double totalPurchases = 0;
        int interactionCount = 0;
        while(true){
            System.out.println("Enter sale amount (or 0 to stop):");
            double sale = scanner.nextDouble();
            if(sale == 0){
                break;
               
            }
            totalPurchases += sale;
            interactionCount++;

        }
        double averageSale = totalPurchases / interactionCount;
        
        String status;
        if(totalPurchases >= 50000) {
            status = "Platinum";
        } else if(totalPurchases >= 20000) {
            status = "Gold";
        } else if(totalPurchases >= 10000) {
            status = "Silver";
        } else {
            status = "Bronze";
        }
        String activity = (interactionCount < 5) ? "Low Activity - Needs Attention" : "Active";
        
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Purchases: $" + totalPurchases);
        System.out.println("Average Sale: $" + averageSale);
        System.out.println("Status: " + status);
        System.out.println("Activity : " + activity);
    }
}
