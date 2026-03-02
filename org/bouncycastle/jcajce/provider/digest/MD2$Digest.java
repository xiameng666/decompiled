package org.bouncycastle.jcajce.provider.digest;

import ieel;

public class MD2.Digest extends BCMessageDigest implements Cloneable {
    public MD2.Digest() {
        super(new ieel());
    }

    @Override
    public Object clone() {
        Object object0 = (MD2.Digest)super.clone();
        object0.digest = new ieel(((ieel)this.digest));
        return object0;
    }
}

