package ConcreteResources;

import Resources.Button;

public class WindowButton implements Button {

    @Override
    public void paintButton(){
        System.out.println("Window button printed");
    }
}
