package org.bouncycastle.jcajce.provider.digest;

import iedx;

public class Blake2s.Blake2s256 extends BCMessageDigest implements Cloneable {
    public Blake2s.Blake2s256() {
        super(new iedx(0x100));
    }

    @Override
    public Object clone() {
        Object object0 = (Blake2s.Blake2s256)super.clone();
        object0.digest = new iedx(((iedx)this.digest));
        return object0;
    }
}

