package my.bit.sem.message;

import java.io.Serializable;
import my.bit.sem.key.Key;


public class Message implements Serializable {

    private static final long serialVersionUID = -585085161844650095L;

    public static final int MESSAGE = 10, LOGOUT = 20, LOGIN = 0,PUBLIC_KEY = 30;

    private int type;
    private String message;
    private Key key;

    public Message(int type, String message,Key key) {
        this.message = message;
        this.type = type;
        this.key = key;
    }


    public int getType() {
        return type;
    }


    public String getMessage() {
        return message;
    }
    
    public Key getKey(){
        return key;
    }
}
