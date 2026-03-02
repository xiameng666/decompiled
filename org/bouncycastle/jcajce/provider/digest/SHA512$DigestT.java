package org.bouncycastle.jcajce.provider.digest;

import iefb;

public class SHA512.DigestT extends BCMessageDigest implements Cloneable {
    public SHA512.DigestT(int v) {
        super(new iefb(v));
    }

    @Override
    public Object clone() {
        Object object0 = (SHA512.DigestT)super.clone();
        object0.digest = new iefb(((iefb)this.digest));
        return object0;
    }
}

