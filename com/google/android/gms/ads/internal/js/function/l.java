package com.google.android.gms.ads.internal.js.function;

import com.google.android.gms.ads.internal.gmsg.d;
import com.google.android.gms.ads.internal.js.ab;
import com.google.android.gms.ads.internal.js.ai;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.future.i;
import com.google.android.gms.ads.internal.util.promise.c;
import j..util.Objects;
import java.util.UUID;
import org.json.JSONObject;

final class l implements c {
    final ab a;
    final Object b;
    final i c;
    final o d;

    public l(o o0, ab ab0, Object object0, i i0) {
        this.a = ab0;
        this.b = object0;
        this.c = i0;
        Objects.requireNonNull(o0);
        this.d = o0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.promise.c
    public final void a(Object object0) {
        o o0 = this.d;
        ab ab0 = this.a;
        ai ai0 = (ai)object0;
        Object object1 = this.b;
        i i0 = this.c;
        try {
            String s = UUID.randomUUID().toString();
            n n0 = new n(o0, ab0, i0);
            synchronized(d.b.a) {
                d.b.b.put(s, n0);
            }
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("id", s);
            jSONObject0.put("args", o0.b.b(object1));
            ai0.e(o0.c, jSONObject0);
        }
        catch(Exception unused_ex) {
            try {
                i0.c(exception0);
                h.h("Unable to invokeJavascript", exception0);
            }
            finally {
                ab0.a();
            }
        }
    }
}

