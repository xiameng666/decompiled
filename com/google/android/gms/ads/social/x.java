package com.google.android.gms.ads.social;

import glzn;
import gmbu;
import gmcd;
import org.json.JSONObject;

public final class x implements glzn {
    public final z a;
    public final a b;

    public x(z z0, a a0) {
        this.a = z0;
        this.b = a0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = ((JSONObject)object0).getString("newToken");
        this.a.f.e(s, this.b);
        z.a.set(false);
        return gmbu.i(s);
    }
}

