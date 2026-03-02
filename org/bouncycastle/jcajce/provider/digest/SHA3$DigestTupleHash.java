package org.bouncycastle.jcajce.provider.digest;

import iefk;

public class SHA3.DigestTupleHash extends BCMessageDigest implements Cloneable {
    public SHA3.DigestTupleHash(int v, int v1) {
        super(new iefk(v, v1));
    }

    @Override
    public Object clone() {
        Object object0 = (BCMessageDigest)super.clone();
        object0.digest = new iefk(((iefk)this.digest));
        return object0;
    }
}

