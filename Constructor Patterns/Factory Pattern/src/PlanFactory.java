public class PlanFactory {
    Plan getPlan(String planType){
        switch (planType){
            case "DOMESTIC":
                return new DomesticPlan();
            case "INDUSTRIAL":
                return new IndustrialPlan();
            case "COMMERCIAL":
                return new CommercialPlan();
            default:
                return null;
        }
    }
}
