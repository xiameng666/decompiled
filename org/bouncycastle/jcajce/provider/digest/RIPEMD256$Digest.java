package org.bouncycastle.jcajce.provider.digest;

import ieet;

public class RIPEMD256.Digest extends BCMessageDigest implements Cloneable {
    public RIPEMD256.Digest() {
        super(new ieet());
    }

    @Override
    public Object clone() {
        Object object0 = (RIPEMD256.Digest)super.clone();
        object0.digest = new ieet(((ieet)this.digest));
        return object0;
    }
}

