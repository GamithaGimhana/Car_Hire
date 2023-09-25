package lk.ijse.carhire.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController {

    public AnchorPane rootNode;
    public void btnCarRegOnAction(ActionEvent actionEvent)throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/carreg_form.fxml"));

        this.rootNode.getChildren().clear();
        this.rootNode.getChildren().add(rootNode);

    }
}
