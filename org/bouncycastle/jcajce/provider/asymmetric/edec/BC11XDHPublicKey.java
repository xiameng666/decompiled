package org.bouncycastle.jcajce.provider.asymmetric.edec;

import idzh;
import ienr;
import ieqg;
import java.security.interfaces.XECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.NamedParameterSpec;

class BC11XDHPublicKey extends BCXDHPublicKey implements XECPublicKey {
    public BC11XDHPublicKey(idzh idzh0) {
        super(idzh0);
    }

    public BC11XDHPublicKey(ienr ienr0) {
        super(ienr0);
    }

    public BC11XDHPublicKey(byte[] arr_b, byte[] arr_b1) {
        super(arr_b, arr_b1);
    }

    @Override
    public AlgorithmParameterSpec getParams() {
        return (this.xdhPublicKey instanceof ieqg) ? NamedParameterSpec.X448 : NamedParameterSpec.X25519;
    }
}

