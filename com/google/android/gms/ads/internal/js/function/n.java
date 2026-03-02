package com.google.android.gms.ads.internal.js.function;

import com.google.android.gms.ads.internal.js.ab;
import com.google.android.gms.ads.internal.util.future.i;
import j..util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {
    final o a;
    private final ab b;
    private final i c;

    public n(o o0, ab ab0, i i0) {
        Objects.requireNonNull(o0);
        this.a = o0;
        super();
        this.b = ab0;
        this.c = i0;
    }

    public final void a(String s) {
        try {
            if(s == null) {
                a a0 = new a();
                this.c.c(a0);
            }
            else {
                a a1 = new a(s);
                this.c.c(a1);
            }
        }
        catch(IllegalStateException unused_ex) {
        }
        finally {
            this.b.a();
        }
    }

    public final void b(JSONObject jSONObject0) {
        try {
            Object object0 = this.a.a.a(jSONObject0);
            this.c.a(object0);
        }
        catch(IllegalStateException jSONException0) {
            this.c.c(jSONException0);
        }
        catch(JSONException unused_ex) {
        }
        finally {
            this.b.a();
        }
    }
}

