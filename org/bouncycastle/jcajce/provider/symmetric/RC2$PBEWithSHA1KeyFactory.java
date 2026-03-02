package org.bouncycastle.jcajce.provider.symmetric;

import idvi;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

public class RC2.PBEWithSHA1KeyFactory extends PBESecretKeyFactory {
    public RC2.PBEWithSHA1KeyFactory() {
        super("PBEwithSHA1andRC2", idvi.A, true, 0, 1, 0x40, 0x40);
    }
}

