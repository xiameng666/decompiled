package org.bouncycastle.jcajce.provider.digest;

import ieew;

public class SHA224.Digest extends BCMessageDigest implements Cloneable {
    public SHA224.Digest() {
        super(new ieew());
    }

    @Override
    public Object clone() {
        Object object0 = (SHA224.Digest)super.clone();
        object0.digest = new ieew(((ieew)this.digest));
        return object0;
    }
}

