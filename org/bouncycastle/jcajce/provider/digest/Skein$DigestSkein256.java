package org.bouncycastle.jcajce.provider.digest;

import iefe;

public class Skein.DigestSkein256 extends BCMessageDigest implements Cloneable {
    public Skein.DigestSkein256(int v) {
        super(new iefe(0x100, v));
    }

    @Override
    public Object clone() {
        Object object0 = (BCMessageDigest)super.clone();
        object0.digest = new iefe(((iefe)this.digest));
        return object0;
    }
}

