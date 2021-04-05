package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Operation;

import javafx.scene.control.TextField;

public class Controller {
    private Operation op = new Operation();

    @FXML
    private TextField numbers;

    @FXML
    public void equals(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.calculate();
        numbers.setText(op.getC().toString());
    }
    @FXML
    public void add(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("+");
        op.setB(op.getA());
        numbers.setText("");
    }

    @FXML
    public void minus(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("-");
        op.setB(op.getA());
        numbers.setText("");
    }

    @FXML
    public void multiply(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("*");
        op.setB(op.getA());
        numbers.setText("");
    }

    @FXML
    public void divide(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("/");
        op.setB(op.getA());
        numbers.setText("");
    }

    @FXML
    public void setMinus(ActionEvent actionEvent) {
        if(numbers.getText().startsWith("-")) {
            numbers.setText(numbers.getText().substring(1));
        }else{
            numbers.setText("-"+numbers.getText());
        }
    }

    @FXML
    public void set0(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"0");
    }

    @FXML
    public void set1(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"1");
    }

    @FXML
    public void set2(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"2");
    }

    @FXML
    public void set3(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"3");
    }

    @FXML
    public void set4(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"4");
    }

    @FXML
    public void set5(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"5");
    }

    @FXML
    public void set6(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"6");
    }

    @FXML
    public void set7(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"7");
    }

    @FXML
    public void set8(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"8");
    }

    @FXML
    public void set9(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"9");
    }

    @FXML
    public void setPoint(ActionEvent actionEvent) {
        if(numbers.getText().indexOf('.')==-1) {
            numbers.setText(numbers.getText()+".");
        }
    }
}
