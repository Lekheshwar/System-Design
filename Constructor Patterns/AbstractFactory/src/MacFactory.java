import ConcreteResources.MacButton;
import ConcreteResources.MacCheckBox;
import Resources.Button;
import Resources.Checkbox;

public class MacFactory implements GUIFactory{

    public Button createButton(){
        return new MacButton();
    }

    public Checkbox createCheckBox(){
        return  new MacCheckBox();
    }
}
