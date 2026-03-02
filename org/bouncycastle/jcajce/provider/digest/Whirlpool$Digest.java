package org.bouncycastle.jcajce.provider.digest;

import iefn;

public class Whirlpool.Digest extends BCMessageDigest implements Cloneable {
    public Whirlpool.Digest() {
        super(new iefn());
    }

    @Override
    public Object clone() {
        Object object0 = (Whirlpool.Digest)super.clone();
        object0.digest = new iefn(((iefn)this.digest));
        return object0;
    }
}

