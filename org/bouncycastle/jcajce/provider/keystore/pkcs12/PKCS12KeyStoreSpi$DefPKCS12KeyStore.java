package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import idvi;
import iewk;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;

public class PKCS12KeyStoreSpi.DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
    public PKCS12KeyStoreSpi.DefPKCS12KeyStore() {
        super(new iewk(), new PKCS12KeyStoreSpi(new iewk(), idvi.az, idvi.aC));
    }
}

