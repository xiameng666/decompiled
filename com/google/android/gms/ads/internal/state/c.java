package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import ccsb;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.csi.a;
import com.google.android.gms.ads.internal.csi.g;
import com.google.android.gms.ads.internal.flag.i;
import com.google.android.gms.ads.internal.flag.j;
import com.google.android.gms.ads.internal.request.service.d;
import com.google.android.gms.ads.internal.util.b;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.m;
import gmcd;
import j..util.Objects;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;

final class c extends b {
    final e a;

    public c(e e0) {
        Objects.requireNonNull(e0);
        this.a = e0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.util.b
    public final void a() {
        e e0 = this.a;
        Context context0 = e0.d;
        String s = e0.e.a;
        String s1 = (String)i.a.d();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("s", "gmob_sdk");
        linkedHashMap0.put("v", "3");
        linkedHashMap0.put("os", Build.VERSION.RELEASE);
        linkedHashMap0.put("api_v", Build.VERSION.SDK);
        linkedHashMap0.put("device", m.o());
        boolean z = context0.getApplicationContext() == null;
        linkedHashMap0.put("app", "com.google.android.gms");
        linkedHashMap0.put("is_lite_sdk", (m.r(context0) ? "1" : "0"));
        d d0 = new d(com.google.android.gms.ads.internal.c.a.g, context0);
        gmcd gmcd0 = com.google.android.gms.ads.internal.util.future.e.a.e(d0);
        try {
            linkedHashMap0.put("network_coarse", Integer.toString(((com.google.android.gms.ads.internal.request.service.c)gmcd0.get()).j));
            linkedHashMap0.put("network_fine", Integer.toString(((com.google.android.gms.ads.internal.request.service.c)gmcd0.get()).k));
        }
        catch(Exception exception0) {
            com.google.android.gms.ads.internal.c.d().c(exception0, "CsiConfiguration.CsiConfiguration");
        }
        if(((Boolean)s.bK.g()).booleanValue()) {
            linkedHashMap0.put("is_bstar", "0");
        }
        if(((Boolean)s.bt.g()).booleanValue() && ((Boolean)s.W.g()).booleanValue() && false) {
            linkedHashMap0.put("plugin", null);
        }
        synchronized(e0.a) {
            try {
                com.google.android.gms.ads.internal.csi.b b0 = e0.f;
                if(TextUtils.isEmpty(s)) {
                    throw new IllegalArgumentException("AfmaVersion can\'t be null or empty. Please set up afmaVersion in CsiConfiguration.");
                }
                b0.e = context0;
                b0.f = s;
                b0.d = s1;
                b0.h = new AtomicBoolean(false);
                b0.h.set(((Boolean)j.c.d()).booleanValue());
                if(b0.h.get()) {
                    File file0 = Environment.getExternalStorageDirectory();
                    if(file0 != null) {
                        b0.i = new File(ccsb.a.b(file0, "sdk_csi_data.txt"));
                    }
                }
                for(Object object1: linkedHashMap0.entrySet()) {
                    String s2 = (String)((Map.Entry)object1).getKey();
                    String s3 = (String)((Map.Entry)object1).getValue();
                    b0.b.put(s2, s3);
                }
                a a0 = new a(b0);
                com.google.android.gms.ads.internal.util.future.e.a.execute(a0);
                b0.c.put("action", g.b);
                b0.c.put("ad_format", g.b);
                b0.c.put("e", g.c);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                h.m("Cannot config CSI reporter.", illegalArgumentException0);
            }
        }
    }
}

