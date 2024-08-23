import Resources.Button;
import Resources.Checkbox;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void render(){
        button.paintButton();
        checkbox.check();
    }
}
