package org.bouncycastle.jcajce.provider.symmetric.util;

import idqg;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.SecretKeySpec;

public class BaseSecretKeyFactory extends SecretKeyFactorySpi implements PBE {
    protected String algName;
    protected idqg algOid;

    protected BaseSecretKeyFactory(String s, idqg idqg0) {
        this.algName = s;
        this.algOid = idqg0;
    }

    @Override  // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineGenerateSecret(KeySpec keySpec0) {
        if((keySpec0 instanceof SecretKeySpec)) {
            return new SecretKeySpec(((SecretKeySpec)keySpec0).getEncoded(), this.algName);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }

    @Override  // javax.crypto.SecretKeyFactorySpi
    protected KeySpec engineGetKeySpec(SecretKey secretKey0, Class class0) {
        if(class0 == null) {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if(secretKey0 != null) {
            if(SecretKeySpec.class.isAssignableFrom(class0)) {
                return new SecretKeySpec(secretKey0.getEncoded(), this.algName);
            }
            try {
                return (KeySpec)class0.getConstructor(byte[].class).newInstance(secretKey0.getEncoded());
            }
            catch(Exception exception0) {
                throw new InvalidKeySpecException(exception0.toString());
            }
        }
        throw new InvalidKeySpecException("key parameter is null");
    }

    @Override  // javax.crypto.SecretKeyFactorySpi
    protected SecretKey engineTranslateKey(SecretKey secretKey0) {
        if(secretKey0 == null) {
            throw new InvalidKeyException("key parameter is null");
        }
        if(secretKey0.getAlgorithm().equalsIgnoreCase(this.algName)) {
            return new SecretKeySpec(secretKey0.getEncoded(), this.algName);
        }
        throw new InvalidKeyException("Key not of type " + this.algName + ".");
    }
}

