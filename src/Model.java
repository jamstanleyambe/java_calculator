public class Model {
    private Double nb1, nb2;
    private String operator;
    public Model(Double n1, Double n2, String op){
        this.nb1 = n1;
        this.nb2 = n2;
        this.operator = op;
    }

    public Double getNb1() {
        return nb1;
    }
    public void setNb1(Double nb1) {
        this.nb1 = nb1;
    }
    public Double getNb2() {
        return nb2;
    }
    public void setNb2(Double nb2) {
        this.nb2 = nb2;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
}
