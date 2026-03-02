package org.bouncycastle.jcajce.provider.digest;

import iefj;

public class Tiger.Digest extends BCMessageDigest implements Cloneable {
    public Tiger.Digest() {
        super(new iefj());
    }

    @Override
    public Object clone() {
        Object object0 = (Tiger.Digest)super.clone();
        object0.digest = new iefj(((iefj)this.digest));
        return object0;
    }
}

