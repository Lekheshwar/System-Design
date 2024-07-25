import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the Plan type");

        String planType = sc.nextLine();

        PlanFactory planFactory = new PlanFactory();

        Plan currPlan = planFactory.getPlan(planType);

        System.out.println("Enter the units");

        int units = sc.nextInt();

         currPlan.getUnitRate();

         System.out.println("Bill for plan :: " + planType + " :: Cost = Rs ");
         currPlan.calculatePlan(units);
    }
}