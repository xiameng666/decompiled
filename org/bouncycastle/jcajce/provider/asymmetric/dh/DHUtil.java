package org.bouncycastle.jcajce.provider.asymmetric.dh;

import ienx;
import iftq;
import iftv;
import ifuf;
import java.math.BigInteger;

class DHUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger0, ienx ienx0) {
        return new iftv(iftq.n(bigInteger0.toByteArray(), ienx0.b.toByteArray(), ienx0.a.toByteArray())).toString();
    }

    static String privateKeyToString(String s, BigInteger bigInteger0, ienx ienx0) {
        String s1 = ifuf.a;
        BigInteger bigInteger1 = ienx0.a.modPow(bigInteger0, ienx0.b);
        return s + " Private Key [" + DHUtil.generateKeyFingerprint(bigInteger1, ienx0) + "]" + s1 + "              Y: " + bigInteger1.toString(16) + s1;
    }

    static String publicKeyToString(String s, BigInteger bigInteger0, ienx ienx0) {
        String s1 = ifuf.a;
        return s + " Public Key [" + DHUtil.generateKeyFingerprint(bigInteger0, ienx0) + "]" + s1 + "             Y: " + bigInteger0.toString(16) + s1;
    }
}

