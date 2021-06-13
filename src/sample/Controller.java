package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller{

    @FXML
    private TextField text1;
    @FXML
    private Label label1;

    Stage stage;
    //custom close button
    @FXML
    private void handleButtonAction(ActionEvent event){
    stage = (Stage)((Button)event.getSource()).getScene().getWindow();
    stage.close();
    }
    //custom minimize button
    @FXML
    private void handleButtonAction2(ActionEvent event){
        stage = (Stage)((Button)event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }
    //to metres
    public void calmetre (){
        try {
            float num1 = Float.parseFloat(text1.getText());
            label1.setText(num1 * 1000 + " m");
        }
        catch(Exception e){
            text1.setText("Enter a Number");
            label1.setText("0");
        }
    }
    //to kilometres
    public void calkm (){
        try {
            float num1 = Float.parseFloat(text1.getText());
            label1.setText(num1 / 1000 + " km");
        }
        catch(Exception e){
            text1.setText("Enter a Number");
            label1.setText("0");
        }
    }
    //to Fahrenheit
    public void calc (){
        try {
            float num1 = Float.parseFloat(text1.getText());
            label1.setText((num1-32)*5/9+" C");
        }
        catch(Exception e){
            text1.setText("Enter a Number");
            label1.setText("0");
        }
    }
    //to Celsius
    public void calf (){
        try {
            float num1 = Float.parseFloat(text1.getText());
            label1.setText((num1*9/5)+32+" F");
        }
        catch(Exception e){
            text1.setText("Enter a Number");
            label1.setText("0");
        }
    }
    //to inr
    public void calinr (){
        try {
            float num1 = Float.parseFloat(text1.getText());
            label1.setText(num1*0.37+" INR");
        }
        catch(Exception e){
            text1.setText("Enter a Number");
            label1.setText("0");
        }
    }
    //to volume
    public void calv (){
        try {
            float num1 = Float.parseFloat(text1.getText());
            label1.setText(String.valueOf(num1*num1*num1));
        }
        catch(Exception e){
            text1.setText("Enter a Number");
            label1.setText("0");
        }
    }

}
