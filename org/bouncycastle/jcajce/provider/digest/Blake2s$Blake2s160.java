package org.bouncycastle.jcajce.provider.digest;

import iedx;

public class Blake2s.Blake2s160 extends BCMessageDigest implements Cloneable {
    public Blake2s.Blake2s160() {
        super(new iedx(0xA0));
    }

    @Override
    public Object clone() {
        Object object0 = (Blake2s.Blake2s160)super.clone();
        object0.digest = new iedx(((iedx)this.digest));
        return object0;
    }
}

