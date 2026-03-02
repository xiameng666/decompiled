package org.bouncycastle.jcajce.provider.symmetric;

import idvi;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

public class RC2.PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
    public RC2.PBEWithSHAAnd40BitKeyFactory() {
        super("PBEwithSHAand40BitRC2-CBC", idvi.aC, true, 2, 1, 40, 0x40);
    }
}

