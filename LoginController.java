import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LoginController implements Initializable
{
    String userName;
    String passWord;
    String line;
    int delimIndx;

    @FXML
    private Button LoginButton;

    @FXML
    private TextField PassField;

    @FXML
    private Label Success;

    @FXML
    private TextField UserField;

    @FXML
    public void LoginCheck (ActionEvent changeScene) throws IOException
    {
        try
        {
            FileReader fr = new FileReader("/Users/zeph/IdeaProjects/Assingment-II/src/LoginDatabase.txt");
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine())
            {
                line = scan.nextLine();
                delimIndx = line.indexOf(",");
                userName = line.substring(0, delimIndx);
                passWord = line.substring(delimIndx + 1, line.length());


                if ((PassField.getText().equals(passWord) && UserField.getText().equals(userName)))
                {
                    Success.setText("Successful Login");
                    Stage calcStage = (Stage) LoginButton.getScene().getWindow();
                    Parent calcView = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
                    Scene scene = new Scene(calcView);
                    scene.setFill(Color.TRANSPARENT);
                    calcStage.setScene(scene);
                    //calcStage.initStyle(StageStyle.TRANSPARENT);
                    calcStage.setResizable(true);
                    calcStage.show();
                }
                else
                {
                    Success.setText("Sorry incorrect Login Details");
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
