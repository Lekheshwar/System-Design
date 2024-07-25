public class IndustrialPlan implements Plan{

    private double unitPrice;
    public void getUnitRate(){
        unitPrice = 15;
    }

    @Override
    public void calculatePlan(int units){
        System.out.println("The bill is " + units * unitPrice);
    }
}
