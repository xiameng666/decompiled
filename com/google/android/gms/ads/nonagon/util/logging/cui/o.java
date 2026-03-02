package com.google.android.gms.ads.nonagon.util.logging.cui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.flag.h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.internal.util.m;
import com.google.android.gms.ads.internal.webview.af;
import com.google.android.gms.ads.nonagon.adapter.b;
import com.google.android.gms.ads.nonagon.load.a;
import com.google.android.gms.ads.nonagon.load.service.r;
import com.google.android.gms.ads.nonagon.load.service.t;
import ggna;
import hfvv;
import ibnh;
import java.util.HashMap;
import java.util.List;

@ibnh
public final class o implements Runnable {
    public static final Object a;
    public static final Object b;
    public static final Object c;
    public static Boolean d;
    public final Context e;
    public final VersionInfoParcel f;
    public String g;
    public int h;
    public final b i;
    public final List j;
    public final af k;
    public boolean l;
    public final ProtoLiteBuilder m;

    static {
        o.a = new Object();
        o.b = new Object();
        o.c = new Object();
    }

    public o(Context context0, VersionInfoParcel versionInfoParcel0, b b0, af af0) {
        this.m = ((ProtoLiteMessage)s.a).v_newBuilder();
        this.g = "";
        this.l = false;
        this.e = context0;
        this.f = versionInfoParcel0;
        this.i = b0;
        this.k = af0;
        if(((Boolean)com.google.android.gms.ads.internal.config.s.bq.g()).booleanValue()) {
            this.j = m.b();
            return;
        }
        this.j = ggna.a;
    }

    public static boolean a() {
        boolean z = false;
        synchronized(o.a) {
            if(o.d == null) {
                if(((Boolean)h.b.d()).booleanValue()) {
                    if((Math.random() < ((double)(((Double)h.a.d()))))) {
                        z = true;
                    }
                    o.d = Boolean.valueOf(z);
                }
                else {
                    o.d = Boolean.valueOf(false);
                }
            }
        }
        return o.d.booleanValue();
    }

    public final void b(f f0) {
        n n0 = new n(this, f0);
        e.a.d(n0);
    }

    @Override
    public final void run() {
        byte[] arr_b;
        if(o.a()) {
            Object object0 = o.b;
            synchronized(object0) {
                if(((s)this.m.b_message).b.size() == 0) {
                    return;
                }
                goto label_10;
            }
            return;
        label_10:
            try {
                synchronized(object0) {
                    ProtoLiteBuilder hftp0 = this.m;
                    arr_b = ((s)hftp0.N_build()).toBytesArray();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((s)hftp0.b_message).b = hfvv.a;
                }
                r r0 = new r(((String)com.google.android.gms.ads.internal.config.s.bl.g()), 60000, new HashMap(), arr_b, "application/x-protobuf");
                String s = this.f.a;
                int v1 = Binder.getCallingUid();
                new t(this.e, s, v1).a(r0);
            }
            catch(Exception exception0) {
                if(!(exception0 instanceof a)) {
                    goto label_29;
                }
                if(((a)exception0).a != 3) {
                label_29:
                    c.d().b(exception0, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }
}

