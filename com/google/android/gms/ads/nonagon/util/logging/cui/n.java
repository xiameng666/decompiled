package com.google.android.gms.ads.nonagon.util.logging.cui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import azqk;
import bbsr;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.i;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.ads.internal.webview.af;
import hfrj;
import hftc;
import hfui;
import hfuo;
import hfur;
import hgvf;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;
import pza;
import pzc;

public final class n implements Runnable {
    public final o a;
    public final f b;

    public n(o o0, f f0) {
        this.a = o0;
        this.b = f0;
    }

    @Override
    public final void run() {
        String s;
        Bundle bundle0;
        Object object0 = o.c;
        o o0 = this.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        if(o0.l) {
            FIN.finallyExec$NT(v);
        }
        else {
            o0.l = true;
            if(o.a()) {
                try {
                    Context context0 = o0.e.getApplicationContext() == null ? o0.e : o0.e.getApplicationContext();
                    try {
                        bundle0 = bbsr.b(context0).d("com.google.android.gms", 0x80).metaData;
                    }
                    catch(PackageManager.NameNotFoundException | NullPointerException unused_ex) {
                        bundle0 = null;
                    }
                    if(bundle0 == null) {
                        s = "";
                    }
                    else {
                        s = bundle0.getString("com.google.android.gms.ads.APPLICATION_ID");
                        if(TextUtils.isEmpty(s)) {
                            s = "";
                        }
                        else if(!s.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") && !s.matches("^/\\d+~.+$")) {
                            s = "";
                        }
                    }
                    o0.g = s;
                }
                catch(RuntimeException | RemoteException exception0) {
                    c.d().c(exception0, "CuiMonitor.gettingAppIdFromManifest");
                }
                o0.h = azqk.a(o0.e);
                int v1 = (int)(((Integer)s.bm.g()));
                if(((Boolean)s.bU.g()).booleanValue()) {
                    e.b.scheduleWithFixedDelay(o0, ((long)v1), ((long)v1), TimeUnit.MILLISECONDS);
                }
                else {
                    e.b.scheduleAtFixedRate(o0, ((long)v1), ((long)v1), TimeUnit.MILLISECONDS);
                }
                i i0 = s.br;
                if(((Boolean)i0.g()).booleanValue()) {
                    af af0 = o0.k;
                    if(((Boolean)i0.g()).booleanValue() && !af0.c.getAndSet(true) && pza.a("GET_VARIATIONS_HEADER")) {
                        try {
                            if(!pza.g.d()) {
                                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                            }
                            String s1 = pzc.a.a().getVariationsHeader();
                            if(!s1.isEmpty()) {
                                af0.a = s1;
                                byte[] arr_b = Base64.decode(s1, 0);
                                hftc hftc0 = hftc.a();
                                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hgvf.a), arr_b, 0, arr_b.length, hftc0);
                                ProtoLiteMessage.P_makeImmutable(hftv0);
                                af0.b = (hgvf)hftv0;
                            }
                        }
                        catch(IllegalArgumentException | hfur exception1) {
                            c.d().b(exception1, "ChromeVariations");
                        }
                    }
                }
                FIN.finallyCodeBegin$NT(v);
            }
            else {
                FIN.finallyExec$NT(v);
            }
        }
        if(o.a()) {
            f f0 = this.b;
            if(f0 != null) {
                Object object1 = o.b;
                __monitor_enter(object1);
                int v2 = FIN.finallyOpen$NT();
                ProtoLiteBuilder hftp0 = o0.m;
                if(((com.google.android.gms.ads.nonagon.util.logging.cui.s)hftp0.b_message).b.size() >= ((int)(((Integer)s.bn.g())))) {
                    FIN.finallyCodeBegin$NT(v2);
                    __monitor_exit(object1);
                    FIN.finallyCodeEnd$NT(v2);
                    return;
                }
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)q.a).v_newBuilder();
                int v3 = f0.m;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((q)hftv1).c = v3 - 2;
                boolean z = f0.b;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ((q)hftv2).d = z;
                long v4 = f0.a;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp1.b_message;
                ((q)hftv3).e = v4;
                if(!hftv3.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp1.b_message;
                ((q)hftv4).g = 1;
                String s2 = o0.f.a;
                if(!hftv4.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp1.b_message;
                s2.getClass();
                ((q)hftv5).h = s2;
                String s3 = o0.g;
                if(!hftv5.isImmutable()) {
                    hftp1.ensureMutable();
                }
                q q0 = (q)hftp1.b_message;
                s3.getClass();
                q0.i = s3;
                String s4 = Build.VERSION.RELEASE;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                q q1 = (q)hftp1.b_message;
                s4.getClass();
                q1.j = s4;
                int v5 = Build.VERSION.SDK_INT;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp1.b_message;
                ((q)hftv6).k = v5;
                int v6 = f0.o;
                if(!hftv6.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp1.b_message;
                if(v6 != 1) {
                    ((q)hftv7).m = v6 - 2;
                    int v7 = f0.c;
                    if(!hftv7.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv8 = hftp1.b_message;
                    ((q)hftv8).n = v7;
                    long v8 = (long)o0.h;
                    if(!hftv8.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv9 = hftp1.b_message;
                    ((q)hftv9).o = v8;
                    int v9 = f0.n;
                    if(!hftv9.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv10 = hftp1.b_message;
                    if(v9 != 1) {
                        ((q)hftv10).p = v9 - 2;
                        String s5 = f0.d;
                        if(!hftv10.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv11 = hftp1.b_message;
                        ((q)hftv11).q = s5;
                        String s6 = f0.e;
                        if(!hftv11.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv12 = hftp1.b_message;
                        ((q)hftv12).r = s6;
                        String s7 = f0.f;
                        if(!hftv12.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        q q2 = (q)hftp1.b_message;
                        s7.getClass();
                        q2.s = s7;
                        o0.i.a(s7);
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv13 = hftp1.b_message;
                        ((q)hftv13).t = "";
                        String s8 = f0.g;
                        if(!hftv13.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv14 = hftp1.b_message;
                        s8.getClass();
                        ((q)hftv14).u = s8;
                        p p0 = f0.h;
                        if(!hftv14.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        q q3 = (q)hftp1.b_message;
                        q3.y = p0.a();
                        String s9 = f0.k;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv15 = hftp1.b_message;
                        s9.getClass();
                        ((q)hftv15).x = s9;
                        String s10 = f0.i;
                        if(!hftv15.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv16 = hftp1.b_message;
                        s10.getClass();
                        ((q)hftv16).v = s10;
                        String s11 = f0.j;
                        if(!hftv16.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv17 = hftp1.b_message;
                        s11.getClass();
                        ((q)hftv17).w = s11;
                        long v10 = f0.l;
                        if(!hftv17.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((q)hftp1.b_message).f = v10;
                        if(((Boolean)s.bq.g()).booleanValue()) {
                            List list0 = o0.j;
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            q q4 = (q)hftp1.b_message;
                            hfui hfui0 = q4.l;
                            if(!hfui0.c()) {
                                q4.l = ProtoLiteMessage.D(hfui0);
                            }
                            hfrj.E(list0, q4.l);
                        }
                        if(((Boolean)s.br.g()).booleanValue()) {
                            hgvf hgvf0 = o0.k.b;
                            String s12 = o0.k.a;
                            if(hgvf0 != null) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((q)hftp1.b_message).z = hgvf0;
                                ((q)hftp1.b_message).b |= 0x100;
                            }
                            if(s12 != null) {
                                if(!hftp1.b_message.isImmutable()) {
                                    hftp1.ensureMutable();
                                }
                                ((q)hftp1.b_message).A = s12;
                            }
                        }
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)r.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        r r0 = (r)hftp2.b_message;
                        q q5 = (q)hftp1.N_build();
                        q5.getClass();
                        r0.c = q5;
                        r0.b |= 1;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        com.google.android.gms.ads.nonagon.util.logging.cui.s s13 = (com.google.android.gms.ads.nonagon.util.logging.cui.s)hftp0.b_message;
                        r r1 = (r)hftp2.N_build();
                        r1.getClass();
                        hfuo hfuo0 = s13.b;
                        if(!hfuo0.c()) {
                            s13.b = ProtoLiteMessage.E(hfuo0);
                        }
                        s13.b.add(r1);
                        FIN.finallyExec$NT(v2);
                        return;
                    }
                    throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
                }
                throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
            }
        }
    }
}

