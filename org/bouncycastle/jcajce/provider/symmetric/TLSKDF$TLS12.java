package org.bouncycastle.jcajce.provider.symmetric;

import iecr;
import iewg;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class TLSKDF.TLS12 extends TLSKDF.TLSKeyMaterialFactory {
    private final iecr prf;

    protected TLSKDF.TLS12(String s, iecr iecr0) {
        super(s);
        this.prf = iecr0;
    }

    private byte[] PRF(iewg iewg0, iecr iecr0) {
        throw null;
    }

    @Override  // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory
    protected SecretKey engineGenerateSecret(KeySpec keySpec0) {
        if((keySpec0 instanceof iewg)) {
            return new SecretKeySpec(this.PRF(((iewg)keySpec0), this.prf), this.algName);
        }
        throw new InvalidKeySpecException("Invalid KeySpec");
    }
}

