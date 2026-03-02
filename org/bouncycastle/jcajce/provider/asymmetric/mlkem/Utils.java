package org.bouncycastle.jcajce.provider.asymmetric.mlkem;

import ievt;
import iflh;
import java.util.HashMap;
import java.util.Map;

class Utils {
    private static Map parameters;

    static {
        Utils.parameters = new HashMap();
        Utils.parameters.put(ievt.a.d, iflh.a);
        Utils.parameters.put(ievt.b.d, iflh.b);
        Utils.parameters.put(ievt.c.d, iflh.c);
    }

    static iflh getParameters(String s) {
        return (iflh)Utils.parameters.get(s);
    }
}

