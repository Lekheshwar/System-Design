public class CommercialPlan implements Plan{

    private double unitPrice;
    public void getUnitRate(){
        unitPrice = 10;
    }

    @Override
    public void calculatePlan(int units){
        System.out.println("The bill is " + units * unitPrice);
    }
}
