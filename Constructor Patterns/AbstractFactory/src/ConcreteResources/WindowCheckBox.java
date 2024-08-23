package ConcreteResources;

import Resources.Checkbox;

public class WindowCheckBox implements Checkbox {

    @Override
    public void check(){
        System.out.println("Windows is checked");
    }
}
