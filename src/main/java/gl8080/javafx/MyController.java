package gl8080.javafx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

@Component
public class MyController {
    
    @FXML
    private Label label;
    
    @Autowired
    private MyBean bean;
    
    @FXML
    public void onClickButton() {
        String text = this.bean.getText();
        this.label.setText(text);
    }
}
