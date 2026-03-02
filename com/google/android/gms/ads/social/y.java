package com.google.android.gms.ads.social;

import com.google.android.gms.ads.internal.util.client.h;
import glzn;
import gmbu;
import gmcd;

public final class y implements glzn {
    @Override  // glzn
    public final gmcd a(Object object0) {
        h.h("Error occurred while getting trustless token from the server.", ((Throwable)object0));
        z.a.set(false);
        return gmbu.i(null);
    }
}

