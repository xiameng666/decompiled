package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.Signature;

interface SignatureCreator {
    Signature createSignature(String arg1);
}

