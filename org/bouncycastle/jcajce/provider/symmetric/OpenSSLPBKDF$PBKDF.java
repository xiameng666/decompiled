package org.bouncycastle.jcajce.provider.symmetric;

import iekj;
import iepk;
import ifuf;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;

public class OpenSSLPBKDF.PBKDF extends BaseSecretKeyFactory {
    public OpenSSLPBKDF.PBKDF() {
        super("PBKDF-OpenSSL", null);
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory
    protected SecretKey engineGenerateSecret(KeySpec keySpec0) {
        if(!(keySpec0 instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
        if(((PBEKeySpec)keySpec0).getSalt() == null) {
            throw new InvalidKeySpecException("missing required salt");
        }
        if(((PBEKeySpec)keySpec0).getIterationCount() <= 0) {
            throw new InvalidKeySpecException("positive iteration count required: " + ((PBEKeySpec)keySpec0).getIterationCount());
        }
        if(((PBEKeySpec)keySpec0).getKeyLength() <= 0) {
            throw new InvalidKeySpecException("positive key length required: " + ((PBEKeySpec)keySpec0).getKeyLength());
        }
        if(((PBEKeySpec)keySpec0).getPassword().length == 0) {
            throw new IllegalArgumentException("password empty");
        }
        iekj iekj0 = new iekj();
        iekj0.h(ifuf.f(((PBEKeySpec)keySpec0).getPassword()), ((PBEKeySpec)keySpec0).getSalt());
        return new SecretKeySpec(((iepk)iekj0.b(((PBEKeySpec)keySpec0).getKeyLength())).b, "OpenSSLPBKDF");
    }
}

