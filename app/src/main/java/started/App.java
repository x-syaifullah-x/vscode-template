package started;

import java.io.IOException;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        App app = new App();
        System.out.println(app.getGreeting());
    }
}
