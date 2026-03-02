package org.bouncycastle.jcajce.provider.digest;

import ieeb;

public class GOST3411.Digest extends BCMessageDigest implements Cloneable {
    public GOST3411.Digest() {
        super(new ieeb());
    }

    @Override
    public Object clone() {
        Object object0 = (GOST3411.Digest)super.clone();
        object0.digest = new ieeb(((ieeb)this.digest));
        return object0;
    }
}

