package my.bit.sem.key;

import java.io.Serializable;
import java.math.BigInteger;


public interface Key extends Serializable {

    BigInteger getLeft();


    BigInteger getRight();
}
