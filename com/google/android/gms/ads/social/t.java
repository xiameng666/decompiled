package com.google.android.gms.ads.social;

import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.ab;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.future.e;
import glyi;
import glzd;
import gmbu;
import gmcd;
import hopm;
import hosd;
import hosg;

public final class t {
    public final aa a;
    private static t b;
    private final Context c;
    private final z d;

    public t(Context context0) {
        z z0 = new z(context0, GmsDoritosProvider.a(context0), aa.a(context0), new VersionInfoParcel(0xF1B18AD, 0xF1B18AD), new ab(context0));
        aa aa0 = aa.a(context0);
        super();
        this.c = context0;
        this.d = z0;
        this.a = aa0;
    }

    public static t a(Context context0) {
        synchronized(t.class) {
            if(t.b == null) {
                t.b = new t(context0);
            }
        }
        return t.b;
    }

    public final gmcd b(String s) {
        gmcd gmcd0;
        Context context0 = this.c;
        if(!u.a(context0, s)) {
            return gmbu.i(null);
        }
        if(hopm.a.e().k() && u.b(context0, s)) {
            return gmbu.i(null);
        }
        a a0 = !hopm.j() || !u.b(context0, s) ? a.a : a.b;
        aa aa0 = this.a;
        if(!aa0.f(a0)) {
            return gmbu.i(aa0.c(a0));
        }
        z z0 = this.d;
        if(!z0.f.f(a0)) {
            h.d("Refresh not needed.");
            gmcd0 = gmbu.i(null);
        }
        else if(hosg.f() && z.a.getAndSet(true)) {
            h.d("Refresh in progress.");
            gmcd0 = gmbu.i(null);
        }
        else {
            h.d("Token refresh triggered.");
            Uri.Builder uri$Builder0 = Uri.parse(hosd.c()).buildUpon();
            uri$Builder0.appendQueryParameter("afma_version", z0.d.a);
            Uri uri0 = uri$Builder0.build();
            gmcd gmcd1 = z0.c.getDoritosCookieAsynchronouslyWithType(s, a0);
            gmcd gmcd2 = z0.c.getDoritosCookiesAsynchronouslyWithType(s, a0);
            gmcd gmcd3 = glzd.g(glzd.g(glzd.g(gmbu.f(new gmcd[]{gmcd1, gmcd2}), new v(z0, gmcd1, gmcd2, s, uri0), e.a), new w(), e.a), new x(z0, a0), e.a);
            y y0 = new y();
            gmcd0 = glyi.g(gmcd3, Throwable.class, y0, e.a);
        }
        gmcd gmcd4 = glzd.f(gmcd0, new r(this), e.a);
        s s1 = new s();
        return glyi.g(gmcd4, Throwable.class, s1, e.a);
    }
}

