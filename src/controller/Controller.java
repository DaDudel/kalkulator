package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import model.Operation;

import javafx.scene.control.TextField;

/**
 * The type Controller.
 */
public class Controller {
    private Operation op = new Operation();

    @FXML
    private TextField numbers;

    /**
     * Equals.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void equals(ActionEvent actionEvent) {
        if(op.getC()!=null) {
            op.setA(Double.parseDouble(numbers.getText()));
            op.calculate();
            numbers.setText(op.getC().toString());
        }
    }

    /**
     * Add.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void add(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("+");
        op.setB(op.getA());
        numbers.setText("");
    }

    /**
     * Minus.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void minus(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("-");
        op.setB(op.getA());
        numbers.setText("");
    }

    /**
     * Multiply.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void multiply(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("*");
        op.setB(op.getA());
        numbers.setText("");
    }

    /**
     * Divide.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void divide(ActionEvent actionEvent) {
        op.setA(Double.parseDouble(numbers.getText()));
        op.setSymbol("/");
        op.setB(op.getA());
        numbers.setText("");
    }

    /**
     * Sets minus.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void setMinus(ActionEvent actionEvent) {
        if(numbers.getText().startsWith("-")) {
            numbers.setText(numbers.getText().substring(1));
        }else{
            numbers.setText("-"+numbers.getText());
        }
    }

    /**
     * Sets 0.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set0(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"0");
    }

    /**
     * Sets 1.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set1(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"1");
    }

    /**
     * Sets 2.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set2(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"2");
    }

    /**
     * Sets 3.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set3(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"3");
    }

    /**
     * Sets 4.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set4(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"4");
    }

    /**
     * Sets 5.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set5(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"5");
    }

    /**
     * Sets 6.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set6(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"6");
    }

    /**
     * Sets 7.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set7(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"7");
    }

    /**
     * Sets 8.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set8(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"8");
    }

    /**
     * Sets 9.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void set9(ActionEvent actionEvent) {
        numbers.setText(numbers.getText()+"9");
    }

    /**
     * Sets point.
     *
     * @param actionEvent the action event
     */
    @FXML
    public void setPoint(ActionEvent actionEvent) {
        if(numbers.getText().indexOf('.')==-1) {
            numbers.setText(numbers.getText()+".");
        }
    }
}
