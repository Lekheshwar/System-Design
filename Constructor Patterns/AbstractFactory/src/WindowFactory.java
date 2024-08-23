import ConcreteResources.WindowButton;
import ConcreteResources.WindowCheckBox;
import Resources.Button;
import Resources.Checkbox;

public class WindowFactory implements GUIFactory {

    public Checkbox createCheckBox(){
        return new WindowCheckBox();
    }

    public Button createButton(){
        return new WindowButton();
    }
}
