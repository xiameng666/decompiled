package org.bouncycastle.jcajce.provider.symmetric;

import iewg;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class TLSKDF.TLS10 extends TLSKDF.TLSKeyMaterialFactory {
    public TLSKDF.TLS10() {
        super("TLS10KDF");
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory
    protected SecretKey engineGenerateSecret(KeySpec keySpec0) {
        if((keySpec0 instanceof iewg)) {
            return new SecretKeySpec(TLSKDF.PRF_legacy(((iewg)keySpec0)), this.algName);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}

