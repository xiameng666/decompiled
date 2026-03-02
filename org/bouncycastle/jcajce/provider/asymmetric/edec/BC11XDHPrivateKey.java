package org.bouncycastle.jcajce.provider.asymmetric.edec;

import idvk;
import ienr;
import ieqd;
import ieqf;
import ieut;
import j..util.Optional;
import j..util.OptionalConversions;
import java.security.interfaces.XECPrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.NamedParameterSpec;

class BC11XDHPrivateKey extends BCXDHPrivateKey implements XECPrivateKey {
    public BC11XDHPrivateKey(idvk idvk0) {
        super(idvk0);
    }

    public BC11XDHPrivateKey(ienr ienr0) {
        super(ienr0);
    }

    @Override
    public AlgorithmParameterSpec getParams() {
        return (this.xdhPrivateKey instanceof ieqf) ? NamedParameterSpec.X448 : NamedParameterSpec.X25519;
    }

    @Override  // org.bouncycastle.jcajce.provider.asymmetric.edec.BCXDHPrivateKey
    public ieut getPublicKey() {
        return (this.xdhPrivateKey instanceof ieqf) ? new BC11XDHPublicKey(((ieqf)this.xdhPrivateKey).a()) : new BC11XDHPublicKey(((ieqd)this.xdhPrivateKey).a());
    }

    public Optional getScalar() {
        ienr ienr0 = this.xdhPrivateKey;
        return (ienr0 instanceof ieqf) ? Optional.of(((ieqf)ienr0).b()) : Optional.of(((ieqd)ienr0).b());
    }

    @Override
    public java.util.Optional getScalar() {
        return OptionalConversions.convert(this.getScalar());
    }
}

