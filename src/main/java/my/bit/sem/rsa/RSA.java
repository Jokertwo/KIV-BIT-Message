package my.bit.sem.rsa;

import java.math.BigInteger;
import my.bit.sem.key.Key;


public interface RSA {

    /**
     * Returns public key for distribute
     * 
     * @return
     */
    Key getPublicKey();
    
    
    /**
     * Set server public key
     */
    void setServerKey(Key serverKey);


    /**
     * Encrypt value with public key of receiver
     * 
     * @param value
     *            value to encrypt
     * @param publicKey
     *            receivers public key
     * @return return encrypted value
     */
    BigInteger encryption(String value, Key publicKey) throws NullPointerException;
    
    /**
     * Encrypt value with public key of server
     * 
     * @param value
     *            value to encrypt
     * @param publicKey
     *            receivers public key
     * @return return encrypted value
     */
    BigInteger encryption(String value) throws NullPointerException;


    /**
     * Decription of received value with private key
     * 
     * @param value
     * @return
     */
    BigInteger decription(String value) throws NullPointerException;

}
