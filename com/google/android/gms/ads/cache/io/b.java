package com.google.android.gms.ads.cache.io;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.os.Binder;
import bblp;
import bzs;
import com.google.android.gms.ads.cache.c;
import com.google.android.gms.ads.cache.csi.a;
import com.google.android.gms.ads.cache.d;
import com.google.android.gms.ads.cache.e;
import com.google.android.gms.ads.cache.f;
import com.google.android.gms.ads.cache.g;
import com.google.android.gms.ads.cache.q;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.admob.AppContextProvider;
import gmcd;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public final class b {
    public static final b a;
    private final ThreadPoolExecutor b;
    private final bzs c;
    private final bzs d;
    private final bzs e;

    static {
        b.a = new b();
    }

    public b() {
        s.c(AppContextProvider.a());
        this.c = new bzs();
        this.d = new bzs();
        this.e = new bzs();
        this.b = new bblp(((int)(((Integer)s.ak.g()))), (((Boolean)s.al.g()).booleanValue() ? 9 : 10));
    }

    public final void a(String s, long v) {
        synchronized(this) {
            d d0 = (d)this.d.remove(s);
            if(d0 != null) {
                e e0 = d0.a;
                f f0 = e0.h;
                b b0 = f0.a;
                synchronized(b0) {
                    try {
                        e0.a();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)com.google.android.gms.ads.cache.s.a).w(((ProtoLiteMessage)e0.b));
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)q.a).w(((ProtoLiteMessage)(e0.b.f == null ? q.a : e0.b.f)));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        q q0 = (q)hftp1.b_message;
                        q0.b |= 0x20;
                        q0.i = v;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        com.google.android.gms.ads.cache.s s1 = (com.google.android.gms.ads.cache.s)hftp0.b_message;
                        q q1 = (q)hftp1.N_build();
                        q1.getClass();
                        s1.f = q1;
                        s1.b |= 8;
                        e0.b = (com.google.android.gms.ads.cache.s)hftp0.N_build();
                        f0.f(e0.b);
                    }
                    catch(g g0) {
                        h.h("Unable to update entry\'s content length.", g0);
                    }
                }
            }
        }
    }

    public final void b(String s, boolean z) {
        synchronized(this) {
            c c0 = (c)this.c.remove(s);
            if(c0 != null) {
                e e0 = c0.a;
                f f0 = e0.h;
                b b0 = f0.a;
                synchronized(b0) {
                    try {
                        if(e0.f) {
                            a a0 = e0.d;
                            if(a0 != null) {
                                a0.a();
                                e0.d = null;
                            }
                            e0.b();
                        }
                        e0.a();
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)com.google.android.gms.ads.cache.s.a).w(((ProtoLiteMessage)e0.b));
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)q.a).w(((ProtoLiteMessage)(e0.b.f == null ? q.a : e0.b.f)));
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        q q0 = (q)hftp1.b_message;
                        q0.b |= 8;
                        q0.g = z;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        com.google.android.gms.ads.cache.s s1 = (com.google.android.gms.ads.cache.s)hftp0.b_message;
                        q q1 = (q)hftp1.N_build();
                        q1.getClass();
                        s1.f = q1;
                        s1.b |= 8;
                        e0.b = (com.google.android.gms.ads.cache.s)hftp0.N_build();
                        f0.f(e0.b);
                        if(!z) {
                            try {
                                f0.e(e0.c, "onDownloadFinished").close();
                            }
                            catch(IOException iOException0) {
                                h.m("Unable to truncate partially downloaded file.", iOException0);
                            }
                        }
                    }
                    catch(g g0) {
                        h.h("Unable to update entry\'s download state.", g0);
                    }
                }
            }
        }
    }

    public final void c(String s) {
        synchronized(this) {
            Future future0 = (Future)this.e.remove(s);
            if(future0 == null) {
                return;
            }
            this.c.remove(s);
            this.d.remove(s);
            future0.cancel(true);
        }
    }

    public final boolean d(String s) {
        boolean z;
        synchronized(this) {
            z = this.c.containsKey(s);
        }
        return z;
    }

    public final boolean e(String s, OutputStream outputStream0, c c0, d d0) {
        synchronized(this) {
            bzs bzs0 = this.c;
            if(bzs0.containsKey(s)) {
                return false;
            }
            bzs0.put(s, c0);
            if(d0 != null) {
                this.d.put(s, d0);
            }
            com.google.android.gms.ads.cache.io.a a0 = new com.google.android.gms.ads.cache.io.a(this, s, outputStream0, Binder.getCallingUid());
            gmcd gmcd0 = ((bblp)this.b).d(a0);
            this.e.put(s, gmcd0);
        }
        return true;
    }
}

