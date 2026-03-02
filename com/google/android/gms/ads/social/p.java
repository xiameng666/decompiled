package com.google.android.gms.ads.social;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.h;
import gfsi;
import hopm;

public final class p implements gfsi {
    public final GmsDoritosProvider a;
    public final String b;

    public p(GmsDoritosProvider gmsDoritosProvider0, String s) {
        this.a = gmsDoritosProvider0;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        GmsDoritosProvider gmsDoritosProvider0 = this.a;
        e e0 = gmsDoritosProvider0.c;
        e0.b();
        a a0 = a.a;
        a a1 = !hopm.j() || !u.b(gmsDoritosProvider0.a, this.b) ? a0 : a.b;
        if(!TextUtils.isEmpty(((String)object0))) {
            b b0 = gmsDoritosProvider0.d;
            Object object1 = b0.a(((String)object0), a1);
            if(TextUtils.isEmpty(((CharSequence)object1))) {
                h.d("DSID cookie not found. Running refresh task.");
                e0.c();
                return b0.a(((String)object0), a0);
            }
            return object1;
        }
        return null;
    }
}

