package org.bouncycastle.jcajce.provider.digest;

import ieeg;

public class Haraka.Digest256 extends BCMessageDigest implements Cloneable {
    public Haraka.Digest256() {
        super(new ieeg());
    }

    @Override
    public Object clone() {
        Object object0 = (Haraka.Digest256)super.clone();
        object0.digest = new ieeg(((ieeg)this.digest));
        return object0;
    }
}

