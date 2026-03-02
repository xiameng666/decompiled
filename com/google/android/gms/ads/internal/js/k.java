package com.google.android.gms.ads.internal.js;

import android.content.Context;
import android.os.Looper;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import android.view.View;
import com.google.android.gms.ads.internal.clearcut.b;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.gmsg.e;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.m;
import com.google.android.gms.ads.internal.webview.i;
import com.google.android.gms.ads.internal.webview.n;
import com.google.android.gms.ads.internal.webview.o;
import com.google.android.gms.ads.internal.webview.p;
import com.google.android.gms.ads.internal.webview.r;
import com.google.android.gms.ads.internal.webview.x;
import gful_cronetEngineProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public final class k implements ai, c {
    public final i a;

    public k(Context context0, VersionInfoParcel versionInfoParcel0) {
        Object object0;
        com.google.android.gms.ads.internal.webview.ai ai0 = new com.google.android.gms.ads.internal.webview.ai();
        b b0 = new b();
        s.c(context0);
        try {
            o o0 = new o(context0, ai0, versionInfoParcel0, b0);
            StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(strictMode$ThreadPolicy0).permitDiskReads().permitDiskWrites().build());
                object0 = ((gful_cronetEngineProvider)o0).mr();
            }
            finally {
                StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
            }
        }
        catch(Throwable throwable0) {
            throw new p(throwable0);
        }
        this.a = object0;
        ((View)object0).setWillNotDraw(true);
    }

    @Override  // com.google.android.gms.ads.internal.js.a
    public final void b(String s, JSONObject jSONObject0) {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.js.c
    public final void c(String s, String s1) {
        com.google.android.gms.ads.internal.js.b.a(this, s, s1);
    }

    public final void d() {
        i i0 = ((r)this.a).a;
        i0.p();
        if(((Boolean)s.aG.g()).booleanValue()) {
            i0.o();
        }
        i0.destroy();
    }

    @Override  // com.google.android.gms.ads.internal.js.l
    public final void e(String s, JSONObject jSONObject0) {
        com.google.android.gms.ads.internal.js.b.b(this, s, jSONObject0);
    }

    public final void f(String s, e e0) {
        j j0 = new j(this, e0);
        n n0 = ((x)((r)this.a).a).b;
        if(n0 != null) {
            synchronized(n0.c) {
                HashMap hashMap0 = n0.b;
                List list0 = (List)hashMap0.get(s);
                if(list0 == null) {
                    list0 = new CopyOnWriteArrayList();
                    hashMap0.put(s, list0);
                }
                list0.add(j0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.js.ai
    public final void g(String s, e e0) {
        d d0 = new d(e0);
        n n0 = ((x)((r)this.a).a).b;
        if(n0 != null) {
            synchronized(n0.c) {
                List list0 = (List)n0.b.get(s);
                if(list0 == null) {
                    return;
                }
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list0) {
                    e e1 = (e)object1;
                    if(d0.a(e1)) {
                        arrayList0.add(e1);
                    }
                }
                list0.removeAll(arrayList0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.js.c, com.google.android.gms.ads.internal.js.l
    public final void gc(String s) {
        k.h(new g(this, s));
    }

    public static final void h(Runnable runnable0) {
        if(Looper.myLooper() != Looper.getMainLooper()) {
            if(!m.a.post(runnable0)) {
                h.k("runOnUiThread > the runnable could not be placed to the message queue");
            }
            return;
        }
        runnable0.run();
    }
}

