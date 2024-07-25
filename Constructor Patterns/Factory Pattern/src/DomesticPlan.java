public class DomesticPlan implements Plan{

    private double unitPrice;
    public void getUnitRate(){
        unitPrice = 5;
    }

    @Override
    public void calculatePlan(int units){
        System.out.println("The bill is " + units * unitPrice);
    }
}
