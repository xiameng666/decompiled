package org.bouncycastle.jcajce.provider.asymmetric.x509;

import a;
import idvk;
import idzh;
import iexi;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class KeyFactory extends KeyFactorySpi {
    @Override
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec0) {
        if((keySpec0 instanceof PKCS8EncodedKeySpec)) {
            try {
                idvk idvk0 = idvk.d(((PKCS8EncodedKeySpec)keySpec0).getEncoded());
                PrivateKey privateKey0 = iexi.a(idvk0);
                if(privateKey0 != null) {
                    return privateKey0;
                }
                throw new InvalidKeySpecException("no factory found for OID: " + idvk0.b.a);
            }
            catch(Exception exception0) {
                throw new InvalidKeySpecException(exception0.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec0.getClass().getName());
    }

    @Override
    protected PublicKey engineGeneratePublic(KeySpec keySpec0) {
        if((keySpec0 instanceof X509EncodedKeySpec)) {
            try {
                idzh idzh0 = idzh.b(((X509EncodedKeySpec)keySpec0).getEncoded());
                PublicKey publicKey0 = iexi.c(idzh0);
                if(publicKey0 != null) {
                    return publicKey0;
                }
                throw new InvalidKeySpecException("no factory found for OID: " + idzh0.a.a);
            }
            catch(Exception exception0) {
                throw new InvalidKeySpecException(exception0.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown KeySpec type: " + keySpec0.getClass().getName());
    }

    @Override
    protected KeySpec engineGetKeySpec(Key key0, Class class0) {
        if(class0.isAssignableFrom(PKCS8EncodedKeySpec.class) && key0.getFormat().equals("PKCS#8")) {
            return new PKCS8EncodedKeySpec(key0.getEncoded());
        }
        if(class0.isAssignableFrom(X509EncodedKeySpec.class) && key0.getFormat().equals("X.509")) {
            return new X509EncodedKeySpec(key0.getEncoded());
        }
        throw new InvalidKeySpecException(a.Q(class0, key0, "not implemented yet ", " "));
    }

    @Override
    protected Key engineTranslateKey(Key key0) {
        throw new InvalidKeyException("not implemented yet " + key0);
    }
}

