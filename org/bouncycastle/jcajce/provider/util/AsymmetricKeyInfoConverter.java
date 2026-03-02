package org.bouncycastle.jcajce.provider.util;

import idvk;
import idzh;
import java.security.PrivateKey;
import java.security.PublicKey;

public interface AsymmetricKeyInfoConverter {
    PrivateKey generatePrivate(idvk arg1);

    PublicKey generatePublic(idzh arg1);
}

