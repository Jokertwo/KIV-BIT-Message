package my.bit.sem.message;

public enum KindOfM {

    MESSAGE(10, "Message"),
    LOGOUT(20, "logOut"),
    LOGIN(0, "logIn");

    private int kind;
    private String name;


    private KindOfM(int kind, String name) {
        this.kind = kind;
        this.name = name;
    }


    public int getKind() {
        return kind;
    }


    public String getName() {
        return name;
    }
}
