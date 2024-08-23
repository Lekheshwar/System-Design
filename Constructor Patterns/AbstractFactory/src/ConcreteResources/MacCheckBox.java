package ConcreteResources;

import Resources.Checkbox;

public class MacCheckBox implements Checkbox {

    @Override
    public void check(){
        System.out.println("Mac is checked");
    }
}
