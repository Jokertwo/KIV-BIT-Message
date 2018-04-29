package my.bit.sem.message;

import java.io.Serializable;
import my.bit.sem.key.Key;


public class Message implements Serializable {

    private static final long serialVersionUID = -585085161844650095L;

    private String message;
    private Key key;
    private MessageType type;
    private Operation operation;


    public Message(String message, Key key, MessageType type, Operation operation) {
        super();
        this.message = message;
        this.key = key;
        this.type = type;
        this.operation = operation;
    }


    public MessageType getType() {
        return type;
    }


    public String getMessage() {
        return message;
    }


    public Key getKey() {
        return key;
    }


    public Operation getOperation() {
        return operation;
    }
}
