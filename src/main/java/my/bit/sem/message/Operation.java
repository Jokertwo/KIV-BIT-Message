package my.bit.sem.message;

public enum Operation {
    PLUS("+"),
    MINUS("-");

    private String op;


    private Operation(String op) {
        this.op = op;
    }


    public String getOp() {
        return op;
    }
}
