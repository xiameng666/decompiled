package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.text.TextUtils;
import bboy;
import gmmn;
import gmmv;
import gmmx;
import gmnb;
import gmvt;
import gmwj;
import gmwv;
import gmxk;
import gnqp;
import gnqr;
import gnqs;
import hosu;
import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

final class s {
    private final ad a;

    public s(Context context0) {
        this.a = new ad(hosu.a.e().d(), hosu.a.e().c());
        try {
            gmwj.a();
        }
        catch(GeneralSecurityException generalSecurityException0) {
            d.c(context0, "HybridConfig.register", generalSecurityException0);
        }
    }

    public final gmmn a(String s) {
        gmmn gmmn1;
        gmmn gmmn0 = null;
        synchronized(this) {
            if(!s.b(s)) {
                return null;
            }
            String s1 = (String)DesugarCollections.unmodifiableMap(hosu.d().b).get(s);
            if(s1 == null) {
                return null;
            }
            ad ad0 = this.a;
            gmmn1 = (gmmn)ad0.a(s1);
            if(gmmn1 == null) {
                if(!TextUtils.isEmpty(s1) && s1.length() % 2 == 0) {
                    byte[] arr_b = bboy.d(s1);
                    ECPoint eCPoint0 = gnqs.i(gnqp.a, gnqr.b, arr_b);
                    gmvt gmvt0 = gmvt.d(gmxk.a, eCPoint0, null);
                    gmmx gmmx0 = new gmmx();
                    gmmv gmmv0 = gmnb.b(gmvt0);
                    gmmv0.b(0);
                    gmmv0.a();
                    gmmx0.c(gmmv0);
                    gmmn0 = (gmmn)gmmx0.a().o(gmwv.a(), gmmn.class);
                }
                if(gmmn0 != null) {
                    ad0.b(s1, gmmn0);
                    return gmmn0;
                }
                gmmn1 = null;
            }
        }
        return gmmn1;
    }

    public static final boolean b(String s) {
        return "doubleclick.net".equals(s) || DesugarCollections.unmodifiableMap(hosu.d().b).containsKey(s);
    }
}

