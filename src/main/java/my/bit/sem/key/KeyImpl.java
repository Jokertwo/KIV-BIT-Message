package my.bit.sem.key;

import java.math.BigInteger;


public class KeyImpl implements Key {

    private static final long serialVersionUID = -7744194029578079207L;
    
    private BigInteger left;
    private BigInteger right;


    public KeyImpl(BigInteger left, BigInteger right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public BigInteger getLeft() {
        return left;
    }

    @Override
    public BigInteger getRight() {
        return right;
    }

}
