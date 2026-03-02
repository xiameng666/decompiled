package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.internal.js.function.d;
import org.json.JSONObject;

final class j implements d {
    @Override  // com.google.android.gms.ads.internal.js.function.d
    public final JSONObject b(Object object0) {
        k k0 = (k)object0;
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("cache", b.a.b(k0.c));
        jSONObject0.put("environment", i.a.b(k0.b));
        return jSONObject0;
    }
}

