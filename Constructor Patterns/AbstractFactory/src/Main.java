public class Main {

    private static Application configureApplication(){
        Application app;
        GUIFactory gui;

        String os = System.getProperty("os.name").toLowerCase();

//        System.out.println(os);

        switch (os){
            case "windows 11":
                gui = new WindowFactory();
                break;
            default:
                gui = new MacFactory();
        }

        app = new Application(gui);

        return app;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to abs factory");

        Application app = configureApplication();
        app.render();
    }
}