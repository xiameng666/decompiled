package org.bouncycastle.jcajce.provider.symmetric;

import idvi;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

public class RC2.PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
    public RC2.PBEWithSHAAnd128BitKeyFactory() {
        super("PBEwithSHAand128BitRC2-CBC", idvi.aB, true, 2, 1, 0x80, 0x40);
    }
}

