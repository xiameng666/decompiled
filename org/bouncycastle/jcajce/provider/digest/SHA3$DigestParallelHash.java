package org.bouncycastle.jcajce.provider.digest;

import ieeq;

public class SHA3.DigestParallelHash extends BCMessageDigest implements Cloneable {
    public SHA3.DigestParallelHash(int v, int v1) {
        super(new ieeq(v, v1));
    }

    @Override
    public Object clone() {
        Object object0 = (BCMessageDigest)super.clone();
        object0.digest = new ieeq(((ieeq)this.digest));
        return object0;
    }
}

