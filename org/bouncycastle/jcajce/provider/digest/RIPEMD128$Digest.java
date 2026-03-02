package org.bouncycastle.jcajce.provider.digest;

import ieer;

public class RIPEMD128.Digest extends BCMessageDigest implements Cloneable {
    public RIPEMD128.Digest() {
        super(new ieer());
    }

    @Override
    public Object clone() {
        Object object0 = (RIPEMD128.Digest)super.clone();
        object0.digest = new ieer(((ieer)this.digest));
        return object0;
    }
}

