package org.bouncycastle.jcajce.provider.symmetric;

import idtu;
import idum;
import idur;
import idvi;
import java.util.HashMap;
import java.util.Map;

public class PBEPBKDF2 {
    private static final Map prfCodes;

    static Map -$$Nest$sfgetprfCodes() {
        return PBEPBKDF2.prfCodes;
    }

    static {
        HashMap hashMap0 = new HashMap();
        PBEPBKDF2.prfCodes = hashMap0;
        hashMap0.put(idtu.c, Integer.valueOf(6));
        hashMap0.put(idvi.M, Integer.valueOf(1));
        hashMap0.put(idvi.O, Integer.valueOf(4));
        hashMap0.put(idvi.N, Integer.valueOf(7));
        hashMap0.put(idvi.P, Integer.valueOf(8));
        hashMap0.put(idvi.Q, Integer.valueOf(9));
        hashMap0.put(idur.p, Integer.valueOf(11));
        hashMap0.put(idur.o, Integer.valueOf(10));
        hashMap0.put(idur.q, Integer.valueOf(12));
        hashMap0.put(idur.r, Integer.valueOf(13));
        hashMap0.put(idum.r, Integer.valueOf(14));
    }
}

