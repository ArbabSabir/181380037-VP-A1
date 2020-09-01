package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
private Button btn;
private HBox headingHbox,dateHobx,numberHbox;
private VBox vBox;
private BorderPane root;
private Label headingLb,dateLb,numberLb;
private Alert alert;
private TextField numberTf;
private DatePicker datePicker;



    @Override
    public void start(Stage primaryStage) throws Exception{
        btn = new Button("Save Data");
        headingHbox = new HBox();
        dateHobx = new HBox();
        numberHbox = new HBox();
        vBox = new VBox();
        root = new BorderPane();
        headingLb = new Label("     My CP Tracker");
        dateLb = new Label("Date");
        numberLb = new Label("Marks:");
        alert = new Alert(Alert.AlertType.INFORMATION);
        datePicker = new DatePicker();
        numberTf = new TextField();


       ;
        headingLb.setFont(new Font(36));
        headingHbox.getChildren().addAll(headingLb);
        root.setTop(headingLb);

        dateLb.setPrefWidth(100);
        dateLb.setFont(new Font(20));
        dateHobx.getChildren().addAll(dateLb,datePicker);

        numberLb.setFont(new Font(20));
        numberLb.setPrefWidth(100);
        numberHbox.getChildren().addAll(numberLb,numberTf);

        vBox.getChildren().addAll(dateHobx,numberHbox);
        vBox.setSpacing(20);

        root.setCenter(vBox);
        root.setPadding(new Insets(20));

        root.setBottom(btn);
        







    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.setTitle("181380037 CP Calculator");
    primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
