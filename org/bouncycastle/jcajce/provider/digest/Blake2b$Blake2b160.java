package org.bouncycastle.jcajce.provider.digest;

import iedw;

public class Blake2b.Blake2b160 extends BCMessageDigest implements Cloneable {
    public Blake2b.Blake2b160() {
        super(new iedw(0xA0));
    }

    @Override
    public Object clone() {
        Object object0 = (Blake2b.Blake2b160)super.clone();
        object0.digest = new iedw(((iedw)this.digest));
        return object0;
    }
}

