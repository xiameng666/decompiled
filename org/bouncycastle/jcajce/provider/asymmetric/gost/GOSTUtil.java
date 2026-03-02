package org.bouncycastle.jcajce.provider.asymmetric.gost;

import iepd;
import iftq;
import iftv;
import ifuf;
import java.math.BigInteger;

class GOSTUtil {
    private static String generateKeyFingerprint(BigInteger bigInteger0, iepd iepd0) {
        return new iftv(iftq.n(bigInteger0.toByteArray(), iepd0.a.toByteArray(), iepd0.c.toByteArray())).toString();
    }

    static String privateKeyToString(String s, BigInteger bigInteger0, iepd iepd0) {
        String s1 = ifuf.a;
        BigInteger bigInteger1 = iepd0.c.modPow(bigInteger0, iepd0.a);
        return s + " Private Key [" + GOSTUtil.generateKeyFingerprint(bigInteger1, iepd0) + "]" + s1 + "                  Y: " + bigInteger1.toString(16) + s1;
    }

    static String publicKeyToString(String s, BigInteger bigInteger0, iepd iepd0) {
        String s1 = ifuf.a;
        return s + " Public Key [" + GOSTUtil.generateKeyFingerprint(bigInteger0, iepd0) + "]" + s1 + "                 Y: " + bigInteger0.toString(16) + s1;
    }
}

