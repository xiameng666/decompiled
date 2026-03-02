package com.google.android.gms.ads.identifier.settings;

import bbfv;
import glzn;
import gmcd;
import gmcu;
import grtg;
import grth;
import j..util.Objects;
import java.util.HashMap;

public final class h implements glzn {
    public final n a;

    public h(n n0) {
        this.a = n0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        gmcd gmcd0 = new gmcu();
        byte[] arr_b = ((grtg)object0).toBytesArray();
        Objects.requireNonNull(gmcd0);
        j j0 = new j(((gmcu)gmcd0));
        Objects.requireNonNull(gmcd0);
        k k0 = new k(((gmcu)gmcd0));
        HashMap hashMap0 = new HashMap();
        bbfv bbfv0 = new bbfv(1, "https://deviceintegritytokens-pa.googleapis.com/v1/getAdEventToken?alt=PROTO&key=AIzaSyA8mcvQcsqT5QLTUyhjjH_DeDkTqP9u2_w", arr_b, grth.a, j0, k0, null, null, false, hashMap0, 0x5700, -1);
        ((gmcu)gmcd0).hB(new l(((gmcu)gmcd0), bbfv0), this.a.b);
        this.a.a.add(bbfv0);
        return gmcd0;
    }
}

