package gl8080.javafx;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class Main extends Application {

    private static ConfigurableApplicationContext context;
    
    public static void main(String[] args) throws IOException {
        context = SpringApplication.run(Main.class, args);
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        MySpringFXMLLoader loader = context.getBean(MySpringFXMLLoader.class);
        
        Parent root = loader.load("sample.fxml");
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        context.close();
    }
}
