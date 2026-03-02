package org.bouncycastle.jcajce.provider.digest;

import ieez;

public class SHA3.DigestSHA3 extends BCMessageDigest implements Cloneable {
    public SHA3.DigestSHA3(int v) {
        super(new ieez(v));
    }

    @Override
    public Object clone() {
        Object object0 = (BCMessageDigest)super.clone();
        object0.digest = new ieez(((ieez)this.digest));
        return object0;
    }
}

