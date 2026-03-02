package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import anj;
import ank;
import anl;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.customtabs.d;
import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.internal.util.l;
import com.google.android.gms.ads.internal.util.m;
import ifvz;
import ifwa;

public final class a {
    public static final void a(Context context0, Intent intent0, i i0, h h0, boolean z) {
        if(z) {
            a.b(context0, intent0.getData(), i0, h0);
            return;
        }
        try {
            intent0.toURI();
            if(((Boolean)s.cd.g()).booleanValue()) {
                m.t(context0, intent0);
            }
            else {
                m.s(context0, intent0);
            }
            if(i0 != null) {
                i0.a();
            }
            if(h0 != null) {
                h0.b();
            }
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            com.google.android.gms.ads.internal.util.client.h.k(activityNotFoundException0.getMessage());
            if(h0 != null) {
                h0.b();
            }
        }
    }

    private static final void b(Context context0, Uri uri0, i i0, h h0) {
        try {
            m m0 = c.e();
            if(context0 != null) {
                if(!(context0 instanceof Activity)) {
                    m.f(context0, uri0);
                }
                else if(((Boolean)s.aB.g()).booleanValue()) {
                    com.google.android.gms.ads.internal.customtabs.c c0 = c.a.f;
                    if(c0.b == null) {
                        com.google.android.gms.ads.internal.customtabs.a a0 = new com.google.android.gms.ads.internal.customtabs.a();
                        e.a.execute(a0);
                    }
                    anl anl0 = new ank(c0.b).a();
                    if(!((Boolean)s.aC.g()).booleanValue() || !m.j()) {
                        String s = ifvz.a(context0);
                        anl0.a.setPackage(s);
                        anl0.a(context0, uri0);
                    }
                }
                else if(((Boolean)s.az.g()).booleanValue()) {
                    d d0 = new d();
                    d0.c = new l(m0, d0, context0, uri0);
                    if(d0.a == null) {
                        String s1 = ifvz.a(((Activity)context0));
                        if(s1 != null) {
                            d0.b = new ifwa(d0);
                            anj.b(((Activity)context0), s1, d0.b);
                        }
                    }
                }
                else {
                    m.f(context0, uri0);
                }
            }
            if(i0 != null) {
                i0.a();
            }
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            com.google.android.gms.ads.internal.util.client.h.k(activityNotFoundException0.getMessage());
        }
        if(h0 != null) {
            h0.a();
        }
    }
}

