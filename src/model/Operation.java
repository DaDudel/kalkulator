package model;

/**
 * The type Operation.
 */
public class Operation {
    private Double a;
    private Double b;
    private Double c;
    private String symbol;

    /**
     * Gets a.
     *
     * @return the a
     */
    public Double getA() {
        return a;
    }

    /**
     * Sets a.
     *
     * @param a the a
     */
    public void setA(Double a) {
        this.a = a;
    }

    /**
     * Gets b.
     *
     * @return the b
     */
    public Double getB() {
        return b;
    }

    /**
     * Sets b.
     *
     * @param b the b
     */
    public void setB(Double b) {
        this.b = b;
    }

    /**
     * Gets c.
     *
     * @return the c
     */
    public Double getC() {
        return c;
    }

    /**
     * Sets c.
     *
     * @param c the c
     */
    public void setC(Double c) {
        this.c = c;
    }

    /**
     * Gets symbol.
     *
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets symbol.
     *
     * @param symbol the symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Instantiates a new Operation.
     */
    public Operation() {
    }

    /**
     * Calculate.
     */
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
