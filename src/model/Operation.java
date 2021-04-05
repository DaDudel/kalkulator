package model;

public class Operation {
    private Double a;
    private Double b;
    private Double c;
    private String symbol;

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Operation() {
    }

    public void calculate(){
        switch (symbol){
            case "+":
                c=a+b;
                break;
            case "-":
                c=b-a;
                break;
            case "*":
                c=a*b;
                break;
            case "/":
                c=b/a;
                break;
            default:
                break;
        }
    }
}
