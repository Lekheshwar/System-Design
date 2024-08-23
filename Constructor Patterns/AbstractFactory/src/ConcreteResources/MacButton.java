package ConcreteResources;

import Resources.Button;

public class MacButton implements Button {

    @Override
    public void paintButton(){
        System.out.println("Mac button printed");
    }
}
