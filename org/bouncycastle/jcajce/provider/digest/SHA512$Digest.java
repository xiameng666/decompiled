package org.bouncycastle.jcajce.provider.digest;

import iefa;

public class SHA512.Digest extends BCMessageDigest implements Cloneable {
    public SHA512.Digest() {
        super(new iefa());
    }

    @Override
    public Object clone() {
        Object object0 = (SHA512.Digest)super.clone();
        object0.digest = new iefa(((iefa)this.digest));
        return object0;
    }
}

