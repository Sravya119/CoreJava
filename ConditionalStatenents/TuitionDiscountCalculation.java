package ConditionalStatenents;

public class TuitionDiscountCalculation{
    public static void main(String[] args) {
        byte gradeLevel = 10;
        double tuitionFee = 5000;
        double discount;
        boolean isAcademicTopper = true;

        if(gradeLevel>=9 && gradeLevel<=12){
            if(isAcademicTopper){
                discount = 20.0;
            }else{
                discount = 10.0;
            }
        }else if (gradeLevel>=6 && gradeLevel <=8) {
            discount = 50.0;
        }else{
            discount = 0.0;
        }

        //Additional Discounts
        if(gradeLevel == 10){
            discount += 3.0;
        }else if (gradeLevel == 12) {
            discount += 5.0;
        }

        double discountedFee = tuitionFee - (tuitionFee * discount/100);

        System.out.println("Student's grade level: " + gradeLevel);
        System.out.println("Base tuition fee: " + tuitionFee);
        System.out.println("Total discount percentage: " + discount +"%");
        System.out.println("Tuition fee after the discount: " + discountedFee);
    }
}
