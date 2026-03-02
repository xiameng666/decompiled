package com.google.android.gms.ads.nonagon.load.service;

import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.js.function.d;
import org.json.JSONObject;

final class o implements d {
    @Override  // com.google.android.gms.ads.internal.js.function.d
    public final JSONObject b(Object object0) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if(((Boolean)s.bs.g()).booleanValue()) {
            jSONObject1.put("ad_request_url", ((p)object0).d.f);
            jSONObject1.put("ad_request_post_body", ((p)object0).d.c);
        }
        jSONObject1.put("base_url", ((p)object0).d.b);
        jSONObject1.put("signals", ((p)object0).c);
        jSONObject2.put("body", ((p)object0).b.c);
        jSONObject2.put("headers", u.b().f(((p)object0).b.b));
        jSONObject2.put("response_code", ((p)object0).b.a);
        jSONObject2.put("latency", ((p)object0).b.d);
        jSONObject0.put("request", jSONObject1);
        jSONObject0.put("response", jSONObject2);
        jSONObject0.put("flags", ((p)object0).d.h);
        return jSONObject0;
    }
}

