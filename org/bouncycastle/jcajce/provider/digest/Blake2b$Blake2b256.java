package org.bouncycastle.jcajce.provider.digest;

import iedw;

public class Blake2b.Blake2b256 extends BCMessageDigest implements Cloneable {
    public Blake2b.Blake2b256() {
        super(new iedw(0x100));
    }

    @Override
    public Object clone() {
        Object object0 = (Blake2b.Blake2b256)super.clone();
        object0.digest = new iedw(((iedw)this.digest));
        return object0;
    }
}

