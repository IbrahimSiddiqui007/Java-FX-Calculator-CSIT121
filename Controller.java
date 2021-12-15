import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable
{
    Float num = 0f;
    Float numSecond = 0f;
    String operator = null;

    @FXML
    private Button Clear;

    @FXML
    private Button Cos;

    @FXML
    private Button Delete;

    @FXML
    private Button Log_Ten;

    @FXML
    private Button NLog;

    @FXML
    private Button Pow;

    @FXML
    private Button Sin;

    @FXML
    private Button Tan;

    @FXML
    private Button Zero;

    @FXML
    private Button add;

    @FXML
    private Button arcCos;

    @FXML
    private Button arcSin;

    @FXML
    private Button arcTan;

    @FXML
    private Button decimalPoint;

    @FXML
    private Button div;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Button exit;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button oneOverX;

    @FXML
    private Label resultDisplay;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button sqrRoot;

    @FXML
    private Button subtract;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    void btnActionHandler(ActionEvent event)
    {
        if (event.getSource() == Zero)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "0");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "0");
            }
        }
        else if (event.getSource() == one)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "1");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "1");
            }
        }
        else if (event.getSource() == two)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "2");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "2");
            }
        }
        else if (event.getSource() == three)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "3");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "3");
            }
        }
        else if (event.getSource() == four)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "4");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "4");
            }
        }
        else if (event.getSource() == five)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "5");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "5");
            }
        }
        else if (event.getSource() == six)
        {

            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "6");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "6");
            }
        }
        else if (event.getSource() == seven)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "7");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "7");
            }
        }
        else if (event.getSource() == eight)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "8");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "8");
            }
        }
        else if (event.getSource() == nine)
        {
            if (resultDisplay.getText().equals("0.0"))
            {
                resultDisplay.setText("");
                resultDisplay.setText(resultDisplay.getText() + "9");
            }
            else
            {
                resultDisplay.setText(resultDisplay.getText() + "9");
            }
        }
        else if (event.getSource() == decimalPoint)
        {
            int point = resultDisplay.getText().codePointCount(0, resultDisplay.getText().length());

            if (resultDisplay.getText().contains("1") || resultDisplay.getText().contains("2") || resultDisplay.getText().contains("3") || resultDisplay.getText().contains("4") || resultDisplay.getText().contains("5") || resultDisplay.getText().contains("6") || resultDisplay.getText().contains("7") || resultDisplay.getText().contains("8") || resultDisplay.getText().contains("9") || resultDisplay.getText().contains("0") )
            {
                resultDisplay.setText(resultDisplay.getText()+".");
            }
        }
        else if (event.getSource() == Clear)
        {
            resultDisplay.setText("");
        }
    }

    @FXML
    void btnOperatorHandler(ActionEvent event)
    {
        if (event.getSource() == add)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "+";
        }
        else if (event.getSource() == subtract)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "-";
        }
        else if (event.getSource() == div)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "÷";
        }
        else if (event.getSource() == multiply)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "×";
        }
        else if (event.getSource() == oneOverX)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "1/X";
        }
        else if (event.getSource() == sqrRoot)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "√";
        }
        else if (event.getSource() == Pow)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "^";
        }
        else if (event.getSource() == Sin)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "Sin";
        }
        else if (event.getSource() == Cos)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "Cos";
        }
        else if (event.getSource() == Tan)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "Tan";
        }
        else if (event.getSource() == arcSin)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "ArcSin";
        }
        else if (event.getSource() == arcCos)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "ArcCos";
        }
        else if (event.getSource() == arcTan)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "ArcTan";
        }
        else if (event.getSource() == NLog)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "NLog";
        }
        else if (event.getSource() == Log_Ten)
        {
            num = Float.parseFloat(resultDisplay.getText());
            resultDisplay.setText("");
            operator = "Log10";
        }
        else if (event.getSource() == equals)
        {
            if (operator.contains("+") || operator.contains("-") || operator.contains("×") || operator.contains("÷"))
            {
                numSecond = Float.parseFloat(resultDisplay.getText());
                switch (operator)
                {
                    case "+" -> resultDisplay.setText(String.valueOf(num+numSecond));
                    case "-" -> resultDisplay.setText(String.valueOf(num-numSecond));
                    case "×" -> resultDisplay.setText(String.valueOf(num*numSecond));
                    case "÷" -> {
                        try
                        {
                            resultDisplay.setText(String.valueOf(num/numSecond));
                        }
                        catch (ArithmeticException ae)
                        {
                            resultDisplay.setText("Error");
                        }
                    }
                }
            }
            else if (operator.contains("1/X") || operator.contains("√") || operator.contains("^") || operator.contains("Sin") || operator.contains("Cos") || operator.contains("Tan") || operator.contains("NLog") || operator.contains("ArcSin") || operator.contains("ArcCos") || operator.contains("ArcTan") || operator.contains("Log10"))
            {
                if (operator.contains("^"))
                {
                    numSecond = Float.parseFloat(resultDisplay.getText());
                    resultDisplay.setText(String.valueOf(Math.pow(num,numSecond)));
                }
                else
                {
                    switch (operator)
                    {
                        case "1/X" -> {
                            try
                            {
                                resultDisplay.setText(String.valueOf(1 / num));
                            }
                            catch (ArithmeticException ae)
                            {
                                resultDisplay.setText("ERR");
                            }
                        }
                        case "√" -> resultDisplay.setText(String.valueOf(Math.sqrt(num)));
                        case "Sin" -> resultDisplay.setText(String.valueOf(Math.sin(Math.toRadians(num))));
                        case "ArcSin" -> resultDisplay.setText(String.valueOf(Math.asin(Math.toRadians(num))));
                        case "Cos" -> resultDisplay.setText(String.valueOf(Math.cos(Math.toRadians(num))));
                        case "ArcCos" -> resultDisplay.setText(String.valueOf(Math.acos(Math.toRadians(num))));
                        case "Tan" -> resultDisplay.setText(String.valueOf(Math.tan(Math.toRadians(num))));
                        case "ArcTan" -> resultDisplay.setText(String.valueOf(Math.atan(Math.toRadians(num))));
                        case "NLog" -> resultDisplay.setText(String.valueOf(Math.log(num)));
                        case "Log10" -> resultDisplay.setText(String.valueOf(Math.log10(num)));
                    }
                }
            }
        }
    }
    public void btnDelete(ActionEvent actionEvent) {
    }

    public void Exit(ActionEvent actionEvent)
    {
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
