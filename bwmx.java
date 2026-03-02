import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.gms.appdatasearch.CorpusStatus;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import j..time.Instant;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

public final class bwmx {
    public static long a;
    public final Context b;
    public final bwzn c;
    public final String d;
    public final Semaphore e;
    public bxax f;
    public bwng g;
    public bwqf h;
    public bwuj i;
    public bxgu j;
    bxgy k;
    public bwuc l;
    public NativeIndex m;
    public bwvg n;
    bwjz o;
    public bwrc p;
    public bwtl q;
    public final bwts r;
    public final boolean s;
    public final List t;
    public bxgq u;
    public String v;
    public bwki w;
    public final bxaa x;
    public final bwmj y;
    public final bwmm z;

    public bwmx(Context context0, bwzn bwzn0) {
        this.e = new Semaphore(1);
        this.t = new ArrayList();
        this.u = null;
        this.y = new bwmj(this);
        this.z = new bwmm(this);
        this.b = context0;
        this.c = bwzn0;
        this.r = new bwts(context0);
        this.d = "main";
        this.s = true;
        bwly bwly0 = new bwly(this);
        synchronized(bwzn0.a) {
            bwzn0.c.add(bwly0);
            synchronized(bwzn0.a) {
                bwzn0.d();
            }
            if(bwzn0.d > 0) {
                bwzn0.b.add(bwly0);
            }
        }
        this.x = new bxaa();
    }

    public final void A(bwom bwom0) {
        if((bwom0.b & 4) != 0) {
            if(glry.a((bwom0.e == null ? glok.a : bwom0.e).b) != 3) {
                this.r.d("init_full_lost");
            }
            if(glry.a((bwom0.e == null ? glok.a : bwom0.e).c) != 3) {
                this.r.d("init_lite_lost");
            }
            bwts bwts0 = this.r;
            glok glok0 = bwom0.e == null ? glok.a : bwom0.e;
            long v = huax.a.g().l();
            if(bwts0.m(v, false)) {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                glnz glnz0 = (glnz)hftp0.b_message;
                glok0.getClass();
                glnz0.y = glok0;
                glnz0.b |= 0x20000000;
                if(huae.g()) {
                    bwts0.t(hftp0);
                    bwts0.a.d(cdef.dJ, 6007, hftp0);
                    return;
                }
                bwts0.s(6007, hftp0, v);
            }
        }
    }

    public final void B(Account[] arr_account) {
        boolean z;
        this.c.c(2);
        bwuc bwuc0 = this.l;
        if(bwuc0 != null) {
            bxax bxax0 = this.f;
            if(bxax0 != null) {
                bwmj bwmj0 = this.y;
                if(arr_account == null) {
                    z = false;
                }
                else {
                    Set set0 = bxax0.r();
                    int v1 = 0;
                    for(int v = 0; v < arr_account.length; ++v) {
                        v1 |= set0.remove(arr_account[v]) ^ 1;
                    }
                    z = v1 != 0 || !set0.isEmpty();
                }
                bwuv.c(false, bwuc0, arr_account, z, bwmj0);
                if(z) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwjx.a).v_newBuilder();
                    for(int v2 = 0; v2 < arr_account.length; ++v2) {
                        Account account0 = arr_account[v2];
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwjw.a).v_newBuilder();
                        String s = account0.name;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        bwjw bwjw0 = (bwjw)hftp1.b_message;
                        s.getClass();
                        bwjw0.b |= 1;
                        bwjw0.c = s;
                        String s1 = account0.type;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        bwjw bwjw1 = (bwjw)hftp1.b_message;
                        s1.getClass();
                        bwjw1.b |= 2;
                        bwjw1.d = s1;
                        bwjw bwjw2 = (bwjw)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        bwjx bwjx0 = (bwjx)hftp0.b_message;
                        bwjw2.getClass();
                        hfuo hfuo0 = bwjx0.b;
                        if(!hfuo0.c()) {
                            bwjx0.b = ProtoLiteMessage.E(hfuo0);
                        }
                        bwjx0.b.add(bwjw2);
                    }
                    String s2 = Base64.encodeToString(((bwjx)hftp0.N_build()).toBytesArray(), 0);
                    bxax0.c.edit().putString("known-accounts", s2).apply();
                }
            }
        }
    }

    public final void C() {
        this.c.c(2);
        if(this.m == null || !this.m.z(bwux.a())) {
            bwne.k("Failed to rebuild index.");
        }
        this.r.d("index_rebuilt");
    }

    public final void D(long v) {
        bwmh bwmh0 = new bwmh(this, gltq.J, v);
        this.c.h(bwmh0);
    }

    public final void E(String[] arr_s) {
        bwms bwms0 = new bwms(this, gltq.aD, arr_s);
        bwms0.a = this;
        this.c.h(bwms0);
    }

    public final boolean F() {
        boolean z;
        if(this.c.e(2)) {
            return this.I();
        }
        this.e.acquireUninterruptibly();
        try {
            z = this.I();
        }
        finally {
            this.e.release();
        }
        return z;
    }

    public final boolean G(bwnq bwnq0, String s) {
        NativeIndex nativeIndex0 = this.m;
        return nativeIndex0 == null ? false : bwur.D(bwnq0) && NativeIndex.nativeClearUsageReportDataForIdAndUri(nativeIndex0.b, bwnq0.j, NativeIndex.B(s)) && nativeIndex0.q(0L, bwnq0.c, s) == glte.a;
    }

    public final boolean H(bwud bwud0, bwuw bwuw0) {
        this.c.c(2);
        int v = bwsa.i(((RegisterCorpusInfo)bwuw0.e()).a);
        bwuc bwuc0 = this.l;
        if(bwuc0 == null) {
            bwne.s("Failed to register corpus info for package, null \'clients\'");
            return false;
        }
        bwua bwua0 = bwuc0.d(bwud0);
        if(v) {
            bwne.b("Set global search info for package %s.", bwua0.b);
            bwua0.k();
            bwua0.B(System.currentTimeMillis());
        }
        String s = bwua0.b;
        bwvy bwvy0 = new bwvy(s, ((RegisterCorpusInfo)bwuw0.e()), (v ? this.b.getResources() : bwua0.d()));
        bwvy0.d();
        RegisterCorpusInfo registerCorpusInfo0 = (RegisterCorpusInfo)bwuw0.e();
        bwnp bwnp0 = (bwnp)((ProtoLiteMessage)bwnq.a).v_newBuilder();
        String s1 = registerCorpusInfo0.a;
        String s2 = gfta.b(s1);
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq0 = (bwnq)bwnp0.b_message;
        bwnq0.b |= 2;
        bwnq0.d = s2;
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq1 = (bwnq)bwnp0.b_message;
        bwnq1.b |= 8;
        bwnq1.f = s;
        String s3 = gfta.b(registerCorpusInfo0.b);
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq2 = (bwnq)bwnp0.b_message;
        bwnq2.b |= 4;
        bwnq2.e = s3;
        boolean z = registerCorpusInfo0.f;
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq3 = (bwnq)bwnp0.b_message;
        bwnq3.b |= 0x20;
        bwnq3.h = z;
        int v1 = registerCorpusInfo0.k;
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq4 = (bwnq)bwnp0.b_message;
        bwnq4.b |= 0x4000;
        bwnq4.s = v1;
        Uri uri0 = registerCorpusInfo0.c;
        if(uri0 != null) {
            String s4 = uri0.toString();
            if(!bwnp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwnp0).ensureMutable();
            }
            bwnq bwnq5 = (bwnq)bwnp0.b_message;
            s4.getClass();
            bwnq5.b |= 16;
            bwnq5.g = s4;
        }
        boolean z1 = registerCorpusInfo0.e != null && Feature.a(1, registerCorpusInfo0.e.b) != null;
        if(!bwnp0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwnp0).ensureMutable();
        }
        bwnq bwnq6 = (bwnq)bwnp0.b_message;
        bwnq6.b |= 0x200;
        bwnq6.n = z1;
        Account account0 = registerCorpusInfo0.g;
        if(account0 != null && account0.type != null && account0.name != null) {
            String s5 = account0.type;
            if(!bwnp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwnp0).ensureMutable();
            }
            bwnq bwnq7 = (bwnq)bwnp0.b_message;
            s5.getClass();
            bwnq7.b |= 0x800;
            bwnq7.p = s5;
            String s6 = account0.name;
            if(!bwnp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwnp0).ensureMutable();
            }
            bwnq bwnq8 = (bwnq)bwnp0.b_message;
            s6.getClass();
            bwnq8.b |= 0x1000;
            bwnq8.q = s6;
        }
        else if(((bwnq)bwnp0.b_message).f.equals("com.google.android.gm") && s1 != null) {
            if(!bwnp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwnp0).ensureMutable();
            }
            bwnq bwnq9 = (bwnq)bwnp0.b_message;
            bwnq9.b |= 0x800;
            bwnq9.p = "com.google";
            if(!bwnp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwnp0).ensureMutable();
            }
            bwnq bwnq10 = (bwnq)bwnp0.b_message;
            bwnq10.b |= 0x1000;
            bwnq10.q = s1;
        }
        String s7 = registerCorpusInfo0.i;
        if(s7 != null) {
            if(!bwnp0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwnp0).ensureMutable();
            }
            bwnq bwnq11 = (bwnq)bwnp0.b_message;
            bwnq11.b |= 0x2000;
            bwnq11.r = s7;
        }
        for(int v2 = 0; true; ++v2) {
            RegisterSectionInfo[] arr_registerSectionInfo = registerCorpusInfo0.d;
            if(v2 >= arr_registerSectionInfo.length) {
                break;
            }
            bwnp0.k(bwur.b(arr_registerSectionInfo[v2]));
        }
        bwnq bwnq12 = (bwnq)((ProtoLiteBuilder)bwnp0).N_build();
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnq12).jf(5, null);
        hftp0.X(((ProtoLiteMessage)bwnq12));
        List list0 = bwvy0.c();
        if(list0 != null) {
            if(!((bwnp)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
            }
            ((bwnq)((bwnp)hftp0).b_message).l = hfvv.a;
            ((bwnp)hftp0).a(list0);
        }
        bwvl bwvl0 = new bwvl(s, ((RegisterCorpusInfo)bwuw0.e()).a);
        bwnq bwnq13 = this.e().c(bwvl0);
        bwnq bwnq14 = this.a(bwud0, bwua0, ((boolean)(v ^ 1)), bwuw0.d(((bwnq)((ProtoLiteBuilder)(((bwnp)hftp0))).N_build())));
        return bwnq13 != null && bwnq13.c != bwnq14.c;
    }

    public final boolean I() {
        batl.l(this.c.e(2) || this.e.availablePermits() == 0);
        return this.m != null;
    }

    public static boolean J(String s) {
        return hubu.a.b().k() ? !bwsa.i(s) : true;
    }

    public final boolean K(bwua bwua0) {
        this.c.c(2);
        String s = bwua0.b;
        boolean z = false;
        if(this.l != null && this.l.r(s) && huau.a.c().g() && "true".equals(SystemProperties.get("ro.mobile_ninjas.is_emulated", ""))) {
            try {
                this.b.getPackageManager().getApplicationInfo("com.google.android.gms.apitest", 0);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                bwne.j(packageManager$NameNotFoundException0, "Could not get app info for %s", new Object[]{"com.google.android.gms.apitest"});
            }
        }
        gged_interceptors gged0 = this.e().m(bwua0);
        boolean z1 = hubg.h().b.contains(s);
        ArrayList arrayList0 = new ArrayList();
        int v = ((ggna)gged0).c;
        boolean z2 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            bwvl bwvl0 = (bwvl)gged0.get(v1);
            String s1 = null;
            if(z1) {
                bwnr bwnr0 = this.e().e(bwvl0);
                if(bwnr0 != null && bwua0.A(bwvl0)) {
                    s1 = bwsa.g((bwnr0.c == null ? bwnq.a : bwnr0.c).d);
                }
            }
            boolean z3 = this.L(bwvl0, bwua0);
            z2 = z3 || z2;
            if(z1 && z3 && !gfta.c(s1)) {
                arrayList0.add(s1);
            }
        }
        if(!arrayList0.isEmpty()) {
            gmcd gmcd0 = this.j();
            glzd.g(gmcd0, new bwlw(this, arrayList0, s, gmcd0), gmap.a);
        }
        try {
            bwsx.a(this.b).e(bwua0.b);
        }
        catch(SQLiteException unused_ex) {
            this.d();
            huax.h();
            bwne.x();
        }
        bwuc bwuc0 = this.l;
        if(bwuc0 != null) {
            synchronized(bwuc0.b) {
                if(bwua0 != null) {
                    if(bwua0 == bwuc0.c.get(bwua0.b)) {
                        z = true;
                    }
                    batl.l(z);
                    synchronized(bwua0.e) {
                        bwua0.f.clear();
                    }
                    try {
                        bwua0.m(bwuw.a);
                    }
                    catch(bwvo bwvo0) {
                        throw new bwvq(bwvo0);
                    }
                    bwua0.p();
                }
            }
            return z2;
        }
        return z2;
    }

    public final boolean L(bwvl bwvl0, bwua bwua0) {
        boolean z1;
        boolean z;
        this.c.c(2);
        String s = bwvl0.c();
        String s1 = bwua0.b;
        bwne.n("Removing corpus key %s for package %s", s, s1);
        bwur bwur0 = this.e();
        bwnr bwnr0 = bwur0.e(bwvl0);
        if(bwnr0 != null && bwua0.A(bwvl0)) {
            this.q.c(s1, (bwnr0.c == null ? bwnq.a : bwnr0.c).d);
            synchronized(bwur0.p()) {
                Map map0 = bwur0.f;
                bwnr bwnr1 = (bwnr)map0.get(bwvl0);
                if(bwnr1 == null) {
                    z = true;
                }
                else {
                    bwny bwny0 = bwnr1.d == null ? bwny.a : bwnr1.d;
                    if(bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) {
                        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr1).jf(5, null);
                        hftp0.X(((ProtoLiteMessage)bwnr1));
                        bwny bwny1 = bwnr1.d == null ? bwny.a : bwnr1.d;
                        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny1).jf(5, null);
                        hftp1.X(((ProtoLiteMessage)bwny1));
                        if(!((bwnt)hftp1).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((bwnt)hftp1))).ensureMutable();
                        }
                        ((bwny)((bwnt)hftp1).b_message).d = 1;
                        ((bwny)((bwnt)hftp1).b_message).b |= 4;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        bwnr bwnr2 = (bwnr)hftp0.b_message;
                        bwny bwny2 = (bwny)((ProtoLiteBuilder)(((bwnt)hftp1))).N_build();
                        bwny2.getClass();
                        bwnr2.d = bwny2;
                        bwnr2.b |= 2;
                        bwnr bwnr3 = (bwnr)hftp0.N_build();
                        map0.put(bwvl0, bwnr3);
                        z = bwur0.h.d(bwnr3);
                    }
                    else {
                        z = true;
                    }
                }
            }
            if(!z) {
                bwne.g("Failed to start deactivating corpus key %s", bwvl0.c());
                this.r.d("start_deactivate_corpus_failed");
                return false;
            }
            if(this.m == null || !NativeIndex.nativeDeleteCorpus(this.m.b, (bwnr0.c == null ? bwnq.a : bwnr0.c).c)) {
                bwne.g("Failed to delete corpus key %s", bwvl0.c());
                this.r.d("delete_corpus_failed");
                return false;
            }
            synchronized(bwur0.p()) {
                if(!bwua0.A(bwvl0)) {
                    goto label_98;
                }
                Map map1 = bwur0.f;
                bwnr bwnr4 = (bwnr)map1.get(bwvl0);
                if(bwnr4 != null && bwnx.a((bwnr4.d == null ? bwny.a : bwnr4.d).d) == 2) {
                    bwnr bwnr5 = (bwnr)map1.remove(bwvl0);
                    if(bwnr5 == null) {
                        bwne.g("Can\'t find corpus with key %s", bwvl0.c());
                    }
                    else {
                        String s2 = (bwnr5.c == null ? bwnq.a : bwnr5.c).d;
                        if(bwnx.a((bwnr5.d == null ? bwny.a : bwnr5.d).d) == 2) {
                            bwne.b("Removing inactive corpus %s", s2);
                            bwur0.g = true;
                            bwur0.c.e((bwnr5.c == null ? bwnq.a : bwnr5.c).f).l(bwvl0);
                        }
                        else {
                            bwny bwny3 = bwnr5.d == null ? bwny.a : bwnr5.d;
                            bwne.h("Can\'t remove corpus %s, not in expected state %s, actual state=%s", new Object[]{s2, ((int)1), ((int)((bwnx.a(bwny3.d) == 0 ? 1 : bwnx.a(bwny3.d)) - 1))});
                        }
                    }
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnr4).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)bwnr4));
                    bwny bwny4 = bwnr4.d == null ? bwny.a : bwnr4.d;
                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny4).jf(5, null);
                    hftp3.X(((ProtoLiteMessage)bwny4));
                    if(!((bwnt)hftp3).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((bwnt)hftp3))).ensureMutable();
                    }
                    ((bwny)((bwnt)hftp3).b_message).d = 2;
                    ((bwny)((bwnt)hftp3).b_message).b |= 4;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    bwnr bwnr6 = (bwnr)hftp2.b_message;
                    bwny bwny5 = (bwny)((ProtoLiteBuilder)(((bwnt)hftp3))).N_build();
                    bwny5.getClass();
                    bwnr6.d = bwny5;
                    bwnr6.b |= 2;
                    bwnr bwnr7 = bwur.K(((bwnr)hftp2.N_build()));
                    bwur0.w(bwnr7);
                    SharedPreferences.Editor sharedPreferences$Editor0 = bwur0.h.a.edit();
                    sharedPreferences$Editor0.remove("corpuskey:" + bwur0.h.a(bwvl0));
                    bwvl bwvl1 = new bwvl(bwnr7);
                    sharedPreferences$Editor0.putString("corpuskey:" + bwur0.h.a(bwvl1), bwwh.g(((MessageLite)bwnr7)));
                    z1 = sharedPreferences$Editor0.commit();
                }
                else {
                    z1 = false;
                }
            }
            if(!z1) {
                bwne.g("Failed to finish deactivating corpus key %s", bwvl0.c());
                this.r.d("finish_deactivate_corpus_failed");
                return false;
            label_98:
                String s3 = bwvl0.b();
                throw new IllegalArgumentException(a.l(bwua0.b, s3, "Key ", " doesn\'t exist for pkg "));
            }
        }
        return true;
    }

    final boolean M(String s) {
        bwne.b("Checking if upgrade is available for mdd group = %s", s);
        return this.g.b(s);
    }

    public final void N() {
        this.e.acquireUninterruptibly();
        synchronized(this.c.a) {
            this.c.d();
            ++this.c.f;
        }
        this.c.e.block();
        synchronized(this.c.a) {
            --this.c.f;
            this.c.d();
        }
        bwmp bwmp0 = new bwmp(this, gltq.z);
        this.c.h(bwmp0);
    }

    public final bwnq O(bwud bwud0, String s, String s1) {
        Object object1;
        bwut bwut0 = this.f();
        synchronized(bwut0.p()) {
            Set set0 = bwut0.v(bwud0, new String[]{s}, false, s1);
            if(set0.isEmpty()) {
                return null;
            }
            object1 = set0.iterator().next();
        }
        return bwut0.c(((bwvl)object1));
    }

    public final CorpusStatus P(bwud bwud0, String s, String s1) {
        bwny bwny0;
        String s2;
        long v2;
        long v1;
        Bundle bundle0;
        bwut bwut0 = this.f();
        synchronized(bwut0.p()) {
            Set set0 = bwut0.v(bwud0, new String[]{s}, false, s1);
            if(set0.isEmpty()) {
                return new CorpusStatus();
            }
            Object object1 = set0.iterator().next();
            bwnr bwnr0 = bwut0.e(((bwvl)object1));
            batl.s(bwnr0);
            bundle0 = new Bundle();
            for(Object object2: (bwnr0.d == null ? bwny.a : bwnr0.d).c) {
                bundle0.putInt(((bwnu)object2).c, ((bwnu)object2).d);
            }
            NativeIndex nativeIndex0 = this.m;
            if(nativeIndex0 == null) {
                return new CorpusStatus();
            }
            v1 = nativeIndex0.f((bwnr0.c == null ? bwnq.a : bwnr0.c).c, false);
            v2 = nativeIndex0.f((bwnr0.c == null ? bwnq.a : bwnr0.c).c, true);
            s2 = (bwnr0.c == null ? bwnq.a : bwnr0.c).e;
            bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
        }
        return new CorpusStatus(true, v1, v2, 0L, bundle0, s2, bwny0.h);
    }

    public final void Q(double f, int v) {
        int[] arr_v1;
        long[] arr_v;
        bwnq bwnq1;
        double f1;
        this.c.c(2);
        NativeIndex nativeIndex0 = this.m;
        if(nativeIndex0 == null) {
            bwne.s("Null \'index\', unable to compact and purge");
            return;
        }
        bwqf bwqf0 = this.h;
        if(bwqf0 == null) {
            bwne.k("Null \'storageMonitor\', using dummy disk fraction numbers.");
            f1 = 0.0;
        }
        else {
            f1 = bwqf0.a() * 100.0;
        }
        bwne.m("Starting purge with target free %.3f%% min disk %.3f%% min index %.3f%%", new Object[]{((double)(f * 100.0)), f1, ((double)(nativeIndex0.a() * 100.0))});
        int v1 = bwur.b;
        bwoj bwoj0 = bwux.a();
        bwur bwur0 = this.e();
        synchronized(bwur0.p()) {
            batl.b(Thread.holdsLock(bwur0.p()));
            Map map0 = bwur0.f;
            int v3 = -1;
            for(Object object1: map0.values()) {
                bwnq bwnq0 = ((bwnr)object1).c;
                if(bwnq0 == null) {
                    bwnq0 = bwnq.a;
                }
                int v4 = bwnq0.c;
                if(v4 > v3) {
                    v3 = v4;
                }
            }
            arr_v = new long[v3 + 1];
            CRC32 cRC320 = new CRC32();
            for(Object object2: map0.values()) {
                bwnr bwnr0 = (bwnr)object2;
                cRC320.reset();
                try {
                    cRC320.update((bwnr0.c == null ? bwnq.a : bwnr0.c).f.getBytes("UTF-8"));
                    bwnq1 = bwnr0.c;
                }
                catch(UnsupportedEncodingException unused_ex) {
                    throw new IllegalArgumentException("CannotHappenException");
                }
                if(bwnq1 == null) {
                    bwnq1 = bwnq.a;
                }
                int v5 = bwnq1.c;
                arr_v[v5] = cRC320.getValue();
            }
        }
        bwur bwur1 = this.e();
        synchronized(bwur1.p()) {
            Collection collection0 = bwur1.f.values();
            int v7 = 0;
            int v8 = 0;
            for(Object object4: collection0) {
                bwnq bwnq2 = ((bwnr)object4).c;
                if(bwnq2 == null) {
                    bwnq2 = bwnq.a;
                }
                if(!bwnq2.h) {
                    ++v8;
                }
            }
            arr_v1 = new int[v8];
            for(Object object5: collection0) {
                bwnq bwnq3 = ((bwnr)object5).c;
                if(bwnq3 == null) {
                    bwnq3 = bwnq.a;
                }
                if(!bwnq3.h) {
                    arr_v1[v7] = bwnq3.c;
                    ++v7;
                }
            }
        }
        giuz giuz0 = nativeIndex0.l(f, v1, bwoj0, arr_v, arr_v1, this.e().a());
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)giuz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)giuz0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giuz)hftp0.b_message).b = v - 2;
        this.U(((giuz)hftp0.N_build()));
    }

    public final void R(int v) {
        double f;
        this.c.c(2);
        NativeIndex nativeIndex0 = this.m;
        if(nativeIndex0 == null) {
            bwne.s("Null \'index\', unable to compact");
            return;
        }
        bwqf bwqf0 = this.h;
        if(bwqf0 == null) {
            bwne.k("Null \'storageMonitor\', using dummy disk fraction numbers.");
            f = 0.0;
        }
        else {
            f = bwqf0.a() * 100.0;
        }
        bwne.n("Starting compaction min disk %.3f%% min index %.3f%%", Double.valueOf(f), Double.valueOf(nativeIndex0.a() * 100.0));
        bwoj bwoj0 = bwux.a();
        SparseIntArray sparseIntArray0 = this.e().a();
        giuz giuz0 = nativeIndex0.l(0.0, bwur.b, bwoj0, null, null, sparseIntArray0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)giuz0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)giuz0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giuz)hftp0.b_message).b = v - 2;
        this.U(((giuz)hftp0.N_build()));
    }

    private final bwnq S(bwvl bwvl0, bwuw bwuw0) {
        this.c.c(2);
        bwur bwur0 = this.e();
        bwur0.I(bwvl0, bwuw0, new bwmq(this));
        bwnq bwnq0 = bwur0.c(bwvl0);
        batl.s(bwnq0);
        if(bwur.F(bwnq0) && bwmx.J(bwnq0.d)) {
            bwvg bwvg0 = this.n;
            if(bwvg0 != null) {
                bwvg0.a(bwvl0);
                bwrc bwrc0 = this.p;
                if(bwrc0 != null) {
                    bwrc0.c();
                }
            }
        }
        return bwnq0;
    }

    private final void T(String s) {
        this.m();
        bwne.l("doRemovePackageData %s", s);
        batl.s(this.l);
        bwua bwua0 = this.l.f(s);
        if(bwua0 != null) {
            if(this.K(bwua0)) {
                batl.s(this.m);
                bwpz bwpz0 = this.m.j();
                batl.s(this.h);
                if(bwpz0 != null && bwqf.g(bwpz0)) {
                    this.R(3);
                }
            }
            this.E(new String[]{s});
            return;
        }
        bwne.p("doRemovePackageData %s: not a known client", s);
    }

    private final void U(giuz giuz0) {
        HashSet hashSet1;
        int v = 2;
        this.c.c(2);
        switch(giuz0.c) {
            case 0: {
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            case 3: {
                v = 5;
                break;
            }
            case 4: {
                v = 6;
                break;
            }
            case 5: {
                v = 7;
                break;
            }
            case 6: {
                v = 8;
                break;
            }
            case 7: {
                v = 9;
                break;
            }
            case 8: {
                v = 10;
                break;
            }
            case 9: {
                v = 11;
                break;
            }
            case 10: {
                v = 12;
                break;
            }
            case 11: {
                v = 13;
                break;
            }
            case 12: {
                v = 14;
                break;
            }
            case 13: {
                v = 15;
                break;
            }
            case 14: {
                v = 16;
                break;
            }
            case 15: {
                v = 17;
                break;
            }
            case 16: {
                v = 18;
                break;
            }
            case 17: {
                v = 19;
                break;
            }
            case 18: {
                v = 20;
                break;
            }
            case 19: {
                v = 21;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v != 3) {
            bwne.f("Compaction failed");
            this.r.d("compaction_failed");
            this.r.c(giuz0);
            return;
        }
        bxax bxax0 = this.f;
        if(bxax0 != null) {
            boolean z = giuz0.e;
            bxax0.c.edit().putBoolean("all_docs_indexed_with_hit_score", z).commit();
        }
        bwuc bwuc0 = this.l;
        if(bwuc0 == null) {
            bwne.f("Null \'clients\', old clients/corpora not expired");
            return;
        }
        bwur bwur0 = this.e();
        synchronized(bwur0.p()) {
            bwvn bwvn0 = bwur0.h;
            HashSet hashSet0 = new HashSet();
            SharedPreferences sharedPreferences0 = bwvn0.a;
            for(Object object1: sharedPreferences0.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(((String)map$Entry0.getKey()).startsWith("corpuskey:")) {
                    bwny bwny0 = ((bwnr)bwwh.e(((String)map$Entry0.getValue()), ((Parser)((ProtoLiteMessage)bwnr.a).jf(7, null)))).d;
                    if(bwny0 == null) {
                        bwny0 = bwny.a;
                    }
                    if(bwnx.a(bwny0.d) == 3) {
                        hashSet0.add(((String)map$Entry0.getKey()));
                    }
                }
            }
            if(!hashSet0.isEmpty()) {
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                for(Object object2: hashSet0) {
                    sharedPreferences$Editor0.remove(((String)object2));
                }
                if(!sharedPreferences$Editor0.commit()) {
                    bwur0.e.d("metadata_union_compact_err");
                }
            }
            bwur0.f.clear();
            for(Object object3: bwur0.c.k()) {
                bwua bwua0 = (bwua)object3;
                for(Object object4: bwua0.i()) {
                    bwua0.l(((bwvl)object4));
                }
            }
            for(Object object5: bwvn0.b()) {
                bwur0.w(bwur.K(((bwnr)object5)));
            }
            bwur0.g = false;
        }
        Set set0 = bwuc0.k();
        synchronized(bwuc0.b) {
            hashSet1 = new HashSet(bwuc0.c.values());
        }
        hashSet1.removeAll(set0);
        for(Object object6: hashSet1) {
            ((bwua)object6).p();
        }
        if(giuz0.d > 0) {
            this.r.d("compaction_with_errors");
        }
        this.r.c(giuz0);
    }

    final bwnq a(bwud bwud0, bwua bwua0, boolean z, bwuw bwuw0) {
        int v11;
        int v9;
        int v6;
        String s3;
        int v = 0;
        this.c.c(2);
        if(bwua0.x()) {
            throw new bwvr("Package " + bwua0.b + " is blocked.");
        }
        if(!((bwnq)bwuw0.e()).g.isEmpty()) {
            Context context0 = this.b;
            Uri uri0 = Uri.parse(((bwnq)bwuw0.e()).g);
            String s = uri0.getAuthority();
            if(s == null) {
                throw new bwvo("Content Provider uri authority is empty");
            }
            ProviderInfo providerInfo0 = context0.getPackageManager().resolveContentProvider(s, 0);
            if(providerInfo0 == null) {
                throw new bwvo(a.O(uri0, "ContentProvider ", " does not exist"));
            }
            if((!"com.google.android.gms.icing.indexapi".equals(uri0.getAuthority()) || !"com.google.android.gms".equals(providerInfo0.applicationInfo.packageName)) && !bwud0.b) {
                int v1 = bwud0.a;
                if(v1 != providerInfo0.applicationInfo.uid) {
                    throw new SecurityException("ContentProvider " + uri0 + " authority " + uri0.getAuthority() + " uid " + providerInfo0.applicationInfo.uid + " does not match calling uid " + v1);
                }
                String s1 = providerInfo0.applicationInfo.packageName;
                if(!bbqw.b(context0, v1, s1)) {
                    throw new SecurityException("ContentProvider " + uri0 + " package name " + s1 + " does not match client package names");
                }
            }
        }
        int v2 = bwua0.b(z);
        if(v2 == 2) {
            bwne.l("App %s registering with different sigs, clearing old corpora", bwua0.b);
            this.K(bwua0);
            this.E(new String[]{bwua0.b});
            v2 = bwua0.b(z);
        }
        if(v2 != 0) {
            this.r.d("register_auth_fail");
            String s2 = bwua0.b;
            switch(v2) {
                case 1: {
                    s3 = "App not allowed";
                    break;
                }
                case 2: {
                    s3 = "Has different fingerprint";
                    break;
                }
                default: {
                    s3 = "App unknown";
                }
            }
            throw new bwvr(a.l(s3, s2, "Package ", " cannot register: "));
        }
        bwur bwur0 = this.e();
        if(bwuw0.a() == 2) {
            gged_interceptors gged0 = bwur0.m(bwua0);
            int v3 = ((ggna)gged0).c;
            for(int v4 = 0; v4 < v3; ++v4) {
                bwvl bwvl0 = (bwvl)gged0.get(v4);
                bwuw bwuw1 = bwur0.k(bwvl0);
                if(bwuw1 != null && bwuw1.a() == 1) {
                    bwnq bwnq0 = ((bwnr)bwuw1.e()).c;
                    if(bwnq0 == null) {
                        bwnq0 = bwnq.a;
                    }
                    if(!bwur.D(bwnq0)) {
                        bwnq bwnq1 = ((bwnr)bwuw1.e()).c;
                        if(bwnq1 == null) {
                            bwnq1 = bwnq.a;
                        }
                        if(!bwur.C(bwnq1)) {
                            bwne.n("Removing api-based corpus %s for %s", bwvl0.c(), bwua0.b);
                            this.L(bwvl0, bwua0);
                        }
                    }
                }
            }
        }
        String s4 = ((bwnq)bwuw0.e()).d;
        bwvl bwvl1 = new bwvl(bwua0.b, s4);
        bwuw bwuw2 = bwur0.j(bwvl1);
        if(bwuw2 == null) {
            String s8 = ((bwnq)bwuw0.e()).d;
            synchronized(bwur0.p()) {
                for(Object object1: bwur0.c.m(bwud0)) {
                    gged_interceptors gged1 = bwur0.m(((bwua)object1));
                    if(!gged1.isEmpty() && gged1.contains(new bwvl(((bwua)object1).b, s8))) {
                        throw new bwvo("Corpus " + ((bwnq)bwuw0.e()).d + " already exists in a different package from this uid");
                    }
                }
            }
        }
        else {
            if(!bwuw2.j(bwuw0)) {
                throw new bwvo("CorpusConfig: cannot " + bwuw0.g() + " when previously " + bwuw2.g());
            }
            bwny bwny0 = bwur0.f(bwvl1);
            if(bwny0 != null && (bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1)) {
                bwnq bwnq2 = (bwnq)bwuw2.e();
                bwnq bwnq3 = (bwnq)bwuw0.e();
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwnq2).jf(5, null);
                hftp0.X(((ProtoLiteMessage)bwnq2));
                if(bwuw2.a() == bwuw0.a()) {
                    v6 = 0;
                }
                else {
                    int v5 = bwuw0.a();
                    if(!((bwnp)hftp0).b_message.isImmutable()) {
                        ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                    }
                    bwnq bwnq4 = (bwnq)((bwnp)hftp0).b_message;
                    bwnq4.b |= 0x100;
                    bwnq4.m = v5;
                    v6 = 1;
                }
                if(bwnq2.d.equals(bwnq3.d) && bwnq2.e.equals(bwnq3.e) && bwnq2.f.equals(bwnq3.f) && bwnq2.g.equals(bwnq3.g)) {
                    boolean z1 = bwnq3.h;
                    if(bwnq2.h != z1) {
                        if(!((bwnp)hftp0).b_message.isImmutable()) {
                            ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                        }
                        bwnq bwnq5 = (bwnq)((bwnp)hftp0).b_message;
                        bwnq5.b |= 0x20;
                        bwnq5.h = z1;
                        v6 = 1;
                    }
                    if(bwnq2.k.size() == bwnq3.k.size()) {
                        while(v < bwnq2.k.size()) {
                            bwlo bwlo0 = (bwlo)bwnq2.k.get(v);
                            bwlo bwlo1 = (bwlo)bwnq3.k.get(v);
                            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwlo0).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)bwlo0));
                            bwlf bwlf0 = (bwlf)hftp1;
                            if(!bwlo0.d.equals(bwlo1.d) || bwlo0.e != bwlo1.e || ((bwll.b(bwlo0.f) == null ? bwll.a : bwll.b(bwlo0.f)) != (bwll.b(bwlo1.f) == null ? bwll.a : bwll.b(bwlo1.f)) || bwlo0.h != bwlo1.h)) {
                                goto label_201;
                            }
                            hfug hfug0 = bwlo.a;
                            if(!bwur.s(new hfuh(bwlo0.j, hfug0)).equals(bwur.s(new hfuh(bwlo1.j, hfug0))) || bwlo0.l != bwlo1.l || bwlo0.m != bwlo1.m || (bwlh.a(bwlo0.p) == 0 ? 1 : bwlh.a(bwlo0.p)) != (bwlh.a(bwlo1.p) == 0 ? 1 : bwlh.a(bwlo1.p)) || ((bwlj.a(bwlo0.q) == 0 ? 1 : bwlj.a(bwlo0.q)) != (bwlj.a(bwlo1.q) == 0 ? 1 : bwlj.a(bwlo1.q)) || bwlo0.r != bwlo1.r)) {
                                goto label_201;
                            }
                            if(new hfuh(bwlo0.j, hfug0).equals(new hfuh(bwlo1.j, hfug0))) {
                                v6 = v6;
                            }
                            else {
                                if(!bwlf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)bwlf0).ensureMutable();
                                }
                                ((bwlo)bwlf0.b_message).j = hfty.a;
                                bwlf0.k(new hfuh(bwlo1.j, hfug0));
                                v6 = 1;
                            }
                            if(!bwlo0.k.equals(bwlo1.k)) {
                                if(!bwlf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)bwlf0).ensureMutable();
                                }
                                ((bwlo)bwlf0.b_message).k = hfvv.a;
                                bwlf0.a(bwlo1.k);
                                v6 = 1;
                            }
                            if(!bwlo0.i.equals(bwlo1.i)) {
                                String s5 = bwlo1.i;
                                if(!bwlf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)bwlf0).ensureMutable();
                                }
                                bwlo bwlo2 = (bwlo)bwlf0.b_message;
                                s5.getClass();
                                bwlo2.c |= 0x20;
                                bwlo2.i = s5;
                                v6 = 1;
                            }
                            int v7 = bwlo1.g;
                            if(bwlo0.g != v7) {
                                if(!bwlf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)bwlf0).ensureMutable();
                                }
                                ((bwlo)bwlf0.b_message).c |= 8;
                                ((bwlo)bwlf0.b_message).g = v7;
                                v6 = 1;
                            }
                            if(!bwlo0.n.equals(bwlo1.n)) {
                                String s6 = bwlo1.n;
                                if(!bwlf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)bwlf0).ensureMutable();
                                }
                                bwlo bwlo3 = (bwlo)bwlf0.b_message;
                                s6.getClass();
                                bwlo3.c |= 0x100;
                                bwlo3.n = s6;
                                v6 = 1;
                            }
                            int v8 = bwlo1.o;
                            if(bwlo0.o != v8) {
                                if(!bwlf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)bwlf0).ensureMutable();
                                }
                                ((bwlo)bwlf0.b_message).c |= 0x200;
                                ((bwlo)bwlf0.b_message).o = v8;
                                v6 = 1;
                            }
                            if(v6 != 0) {
                                if(!((bwnp)hftp0).b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                                }
                                bwnq bwnq6 = (bwnq)((bwnp)hftp0).b_message;
                                bwlo bwlo4 = (bwlo)((ProtoLiteBuilder)bwlf0).N_build();
                                bwlo4.getClass();
                                bwnq6.b();
                                bwnq6.k.set(v, bwlo4);
                            }
                            ++v;
                            bwuw2 = bwuw2;
                        }
                        if(bwnq2.l.equals(bwnq3.l)) {
                            v9 = v6;
                        }
                        else {
                            if(!((bwnp)hftp0).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                            }
                            ((bwnq)((bwnp)hftp0).b_message).l = hfvv.a;
                            ((bwnp)hftp0).a(bwnq3.l);
                            v9 = 1;
                        }
                        boolean z2 = bwnq3.n;
                        if(bwnq2.n != z2) {
                            if(!((bwnp)hftp0).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                            }
                            bwnq bwnq7 = (bwnq)((bwnp)hftp0).b_message;
                            bwnq7.b |= 0x200;
                            bwnq7.n = z2;
                            v9 = 1;
                        }
                        long v10 = bwnq3.o;
                        if(bwnq2.o != v10) {
                            if(!((bwnp)hftp0).b_message.isImmutable()) {
                                ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                            }
                            bwnq bwnq8 = (bwnq)((bwnp)hftp0).b_message;
                            bwnq8.b |= 0x400;
                            bwnq8.o = v10;
                            v9 = 1;
                        }
                        if(bwnq2.p.equals(bwnq3.p) && bwnq2.q.equals(bwnq3.q)) {
                            if(bwnq2.r.equals(bwnq3.r)) {
                                v11 = v9;
                            }
                            else {
                                String s7 = bwnq3.r;
                                if(!((bwnp)hftp0).b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                                }
                                bwnq bwnq9 = (bwnq)((bwnp)hftp0).b_message;
                                s7.getClass();
                                bwnq9.b |= 0x2000;
                                bwnq9.r = s7;
                                v11 = 1;
                            }
                            int v12 = bwnq3.s;
                            if(bwnq2.s != v12) {
                                if(!((bwnp)hftp0).b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)(((bwnp)hftp0))).ensureMutable();
                                }
                                bwnq bwnq10 = (bwnq)((bwnp)hftp0).b_message;
                                bwnq10.b |= 0x4000;
                                bwnq10.s = v12;
                                bwur0.y(bwvl1, bwuw0.d(((bwnq)((ProtoLiteBuilder)(((bwnp)hftp0))).N_build())));
                                return (bwnq)bwuw2.e();
                            }
                            if(v11 != 0) {
                                bwur0.y(bwvl1, bwuw0.d(((bwnq)((ProtoLiteBuilder)(((bwnp)hftp0))).N_build())));
                            }
                            return (bwnq)bwuw2.e();
                        }
                    }
                }
            }
        label_201:
            bwne.a("Corpus registration info changed, replacing corpus");
            if(!this.L(bwvl1, bwua0)) {
                throw new bwvr("Could not unregister old corpus");
            }
        }
        return this.S(bwvl1, bwuw0);
    }

    public static bwog b(boolean z) {
        if(z) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwog.a).v_newBuilder();
            int v = (int)TimeUnit.DAYS.toSeconds(14L);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((bwog)hftv0).b |= 1;
            ((bwog)hftv0).c = v;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((bwog)hftv1).b |= 2;
            ((bwog)hftv1).d = 1;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((bwog)hftv2).b |= 4;
            ((bwog)hftv2).e = 20;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            bwog bwog0 = (bwog)hftp0.b_message;
            bwog0.b |= 8;
            bwog0.f = 20;
            return (bwog)hftp0.N_build();
        }
        return bwog.a;
    }

    public final bwop c() {
        bxax bxax0 = this.f;
        bwon bwon0 = (bwon)((ProtoLiteMessage)bwop.a).v_newBuilder();
        String s = Locale.getDefault().getLanguage();
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop0 = (bwop)bwon0.b_message;
        s.getClass();
        bwop0.b |= 2;
        bwop0.c = s;
        bwki bwki0 = bxax0 == null || !bxax0.B() ? null : this.g.a("cld3-model");
        if(bwki0 == null) {
            bwki0 = this.w;
        }
        if(bwki0 != null) {
            bwon0.a(bwki0);
        }
        int v = (int)htzm.a.b().a();
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop1 = (bwop)bwon0.b_message;
        bwop1.b |= 4;
        bwop1.e = v;
        if(huar.j()) {
            bwki bwki1 = this.g.a("saft-segmenter-model");
            if(bwki1 != null) {
                bwon0.a(bwki1);
            }
        }
        if(bwvu.h()) {
            bwki bwki2 = this.g.a("nicknames");
            if(bwki2 != null) {
                bwon0.a(bwki2);
            }
        }
        if(huar.g()) {
            bwki bwki3 = this.g.a("address_data");
            if(bwki3 != null) {
                bwon0.a(bwki3);
            }
        }
        boolean z = bxax0 == null || bxax0.c.getBoolean("all_docs_indexed_with_hit_score", true);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwoo.a).v_newBuilder();
        boolean z1 = ((Boolean)bwvu.g.b()).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo0 = (bwoo)hftp0.b_message;
        bwoo0.b |= 1;
        bwoo0.c = z1;
        boolean z2 = bwvu.d();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo1 = (bwoo)hftp0.b_message;
        bwoo1.b |= 2;
        bwoo1.d = z2;
        boolean z3 = ((Boolean)bwvu.d.b()).booleanValue();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo2 = (bwoo)hftp0.b_message;
        bwoo2.b |= 8;
        bwoo2.e = z3;
        hubu hubu0 = hubu.a;
        boolean z4 = hubu0.b().x();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo3 = (bwoo)hftp0.b_message;
        bwoo3.b |= 16;
        bwoo3.f = z4;
        boolean z5 = hubu0.b().O();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo4 = (bwoo)hftp0.b_message;
        bwoo4.b |= 0x20;
        bwoo4.g = z5;
        boolean z6 = hubu0.b().F();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo5 = (bwoo)hftp0.b_message;
        bwoo5.b |= 0x40;
        bwoo5.h = z6;
        boolean z7 = hubu0.b().z();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo6 = (bwoo)hftp0.b_message;
        bwoo6.b |= 0x80;
        bwoo6.i = z7;
        boolean z8 = hubu0.b().w();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoo bwoo7 = (bwoo)hftp0.b_message;
        bwoo7.b |= 0x100;
        bwoo7.j = z8;
        bwoo bwoo8 = (bwoo)hftp0.N_build();
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop2 = (bwop)bwon0.b_message;
        bwoo8.getClass();
        bwop2.f = bwoo8;
        bwop2.b |= 8;
        String s1 = this.b.getFilesDir().getAbsolutePath();
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop3 = (bwop)bwon0.b_message;
        s1.getClass();
        bwop3.b |= 16;
        bwop3.g = s1;
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop4 = (bwop)bwon0.b_message;
        "com.google.android.gms".getClass();
        bwop4.b |= 0x20;
        bwop4.h = "com.google.android.gms";
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop5 = (bwop)bwon0.b_message;
        bwop5.b |= 0x800;
        bwop5.l = z;
        byte[] arr_b = hubg.a.j().x().toBytesArray();
        if(arr_b.length > 0) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)bwkp.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                if(!bwon0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)bwon0).ensureMutable();
                }
                bwop bwop6 = (bwop)bwon0.b_message;
                ((bwkp)hftv0).getClass();
                bwop6.i = (bwkp)hftv0;
                bwop6.b |= 0x40;
            }
            catch(hfur unused_ex) {
                bwne.f("Failed to parse pushed acl");
            }
        }
        else {
            bwko bwko0 = (bwko)((ProtoLiteMessage)bwkp.a).v_newBuilder();
            if(!bwko0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwko0).ensureMutable();
            }
            bwkp bwkp0 = (bwkp)bwko0.b_message;
            bwkp0.b |= 1;
            bwkp0.d = 1;
            bwkw bwkw0 = bwkw.a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwkw0).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((bwkw)hftp1.b_message).e = 2;
            ((bwkw)hftp1.b_message).b |= 1;
            bwkw bwkw1 = (bwkw)hftp1.N_build();
            bwkv bwkv0 = bwkv.a;
            bwkt bwkt0 = (bwkt)((ProtoLiteMessage)bwkv0).v_newBuilder();
            bwks bwks0 = bwks.a;
            bwkq bwkq0 = (bwkq)((ProtoLiteMessage)bwks0).v_newBuilder();
            String[] arr_s = TextUtils.split(hubg.l(), ",");
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                String s2 = arr_s[v1];
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)bwkr.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                bwkr bwkr0 = (bwkr)hftp2.b_message;
                s2.getClass();
                bwkr0.b |= 1;
                bwkr0.c = s2;
                bwkr bwkr1 = (bwkr)hftp2.N_build();
                if(!bwkq0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)bwkq0).ensureMutable();
                }
                bwks bwks1 = (bwks)bwkq0.b_message;
                bwkr1.getClass();
                bwks1.b();
                bwks1.b.add(bwkr1);
            }
            if(!bwkq0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwkq0).ensureMutable();
            }
            bwks.c(((bwks)bwkq0.b_message));
            bwkt0.a(((bwks)((ProtoLiteBuilder)bwkq0).N_build()));
            bwkt0.k(bwkw1);
            bwkt0.l();
            bwko0.a(((bwkv)((ProtoLiteBuilder)bwkt0).N_build()));
            if(hubn.a.b().i()) {
                bwkq bwkq1 = (bwkq)((ProtoLiteMessage)bwks0).v_newBuilder();
                if(!bwkq1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)bwkq1).ensureMutable();
                }
                bwks.c(((bwks)bwkq1.b_message));
                for(Object object0: bwtj.a()) {
                    ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)bwkr.a).v_newBuilder();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    bwkr bwkr2 = (bwkr)hftp3.b_message;
                    ((String)object0).getClass();
                    bwkr2.b |= 1;
                    bwkr2.c = (String)object0;
                    bwkq1.a(hftp3);
                }
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)bwkw0).v_newBuilder();
                List list0 = Arrays.asList(htzs.a.b().a().split(","));
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                bwkw bwkw2 = (bwkw)hftp4.b_message;
                hfuo hfuo0 = bwkw2.c;
                if(!hfuo0.c()) {
                    bwkw2.c = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(list0, bwkw2.c);
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ((bwkw)hftp4.b_message).e = 2;
                ((bwkw)hftp4.b_message).b |= 1;
                bwkw bwkw3 = (bwkw)hftp4.N_build();
                bwkt bwkt1 = (bwkt)((ProtoLiteMessage)bwkv0).v_newBuilder();
                if(!bwkt1.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)bwkt1).ensureMutable();
                }
                bwkv bwkv1 = (bwkv)bwkt1.b_message;
                bwks bwks2 = (bwks)((ProtoLiteBuilder)bwkq1).N_build();
                bwks2.getClass();
                bwkv1.b();
                bwkv1.b.add(bwks2);
                bwkt1.k(bwkw3);
                bwkt1.l();
                bwko0.a(((bwkv)((ProtoLiteBuilder)bwkt1).N_build()));
            }
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: bxgi.a().entrySet()) {
                bwkq bwkq2 = (bwkq)((ProtoLiteMessage)bwks0).v_newBuilder();
                if(!bwkq2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)bwkq2).ensureMutable();
                }
                bwks.c(((bwks)bwkq2.b_message));
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)bwkr.a).v_newBuilder();
                String s3 = (String)((Map.Entry)object1).getKey();
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                bwkr bwkr3 = (bwkr)hftp5.b_message;
                s3.getClass();
                bwkr3.b |= 1;
                bwkr3.c = s3;
                bwkq2.a(hftp5);
                bwks bwks3 = (bwks)((ProtoLiteBuilder)bwkq2).N_build();
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)bwkw0).v_newBuilder();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                ((bwkw)hftp6.b_message).e = 2;
                ((bwkw)hftp6.b_message).b |= 1;
                for(Object object2: ((Set)((Map.Entry)object1).getValue())) {
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    bwkw bwkw4 = (bwkw)hftp6.b_message;
                    ((String)object2).getClass();
                    hfuo hfuo1 = bwkw4.d;
                    if(!hfuo1.c()) {
                        bwkw4.d = ProtoLiteMessage.E(hfuo1);
                    }
                    bwkw4.d.add(((String)object2));
                }
                bwkt bwkt2 = (bwkt)((ProtoLiteMessage)bwkv0).v_newBuilder();
                bwkt2.a(bwks3);
                if(!bwkt2.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)bwkt2).ensureMutable();
                }
                bwkv bwkv2 = (bwkv)bwkt2.b_message;
                bwkw bwkw5 = (bwkw)hftp6.N_build();
                bwkw5.getClass();
                bwkv2.c();
                bwkv2.c.add(bwkw5);
                bwkt2.l();
                arrayList0.add(((bwkv)((ProtoLiteBuilder)bwkt2).N_build()));
            }
            if(!bwko0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwko0).ensureMutable();
            }
            bwkp bwkp1 = (bwkp)bwko0.b_message;
            bwkp1.b();
            hfrj.E(arrayList0, bwkp1.c);
            bwkp bwkp2 = (bwkp)((ProtoLiteBuilder)bwko0).N_build();
            if(!bwon0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)bwon0).ensureMutable();
            }
            bwop bwop7 = (bwop)bwon0.b_message;
            bwkp2.getClass();
            bwop7.i = bwkp2;
            bwop7.b |= 0x40;
        }
        long v2 = huar.a.d().n();
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop8 = (bwop)bwon0.b_message;
        bwop8.b |= 0x80;
        bwop8.j = v2;
        int v3 = 2;
        if(!Log.isLoggable("Icing", 2)) {
            v3 = Log.isLoggable("Icing", 3) ? 1 : 0;
        }
        if(!bwon0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwon0).ensureMutable();
        }
        bwop bwop9 = (bwop)bwon0.b_message;
        bwop9.b |= 0x200;
        bwop9.k = v3;
        return (bwop)((ProtoLiteBuilder)bwon0).N_build();
    }

    public final bwtu d() {
        return new bwtu(this.b);
    }

    public final bwur e() {
        batl.s(this.i);
        return this.i.a();
    }

    public final bwut f() {
        batl.s(this.i);
        return this.i.b;
    }

    public final bwzy g() {
        this.m();
        bwzy bwzy0 = new bwme(this, gltq.G);
        this.c.h(((bwzp)bwzy0));
        return bwzy0;
    }

    public final bwzy h() {
        bwzy bwzy0 = new bwmg(this, gltq.I);
        this.c.h(((bwzp)bwzy0));
        return bwzy0;
    }

    public final bwzy i(boolean z) {
        bwzy bwzy0 = new bwmn(this, gltq.y, z);
        this.e.acquireUninterruptibly();
        try {
            this.c.h(((bwzp)bwzy0));
            return bwzy0;
        }
        catch(IllegalStateException illegalStateException0) {
            bwne.j(illegalStateException0, "Unable to initialize index manager due to start service failure: %s", new Object[]{illegalStateException0.getMessage()});
            this.r.d("init_index_manager_svc_failed");
            this.e.release();
            return new bwmo(this);
        }
    }

    public final gmcd j() {
        gmcd gmcd1;
        gmcd gmcd2;
        gmcd gmcd0 = bxby.a;
        if(gmcd0 == null) {
            synchronized(bxby.class) {
                gmcd1 = bxby.a;
                if(gmcd1 == null) {
                    long v1 = Instant.now().toEpochMilli();
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnj.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((glnj)hftp0.b_message).d = 1;
                    ((glnj)hftp0.b_message).b |= 2;
                    bwts bwts0 = this.r;
                    Context context0 = this.b;
                    if(Build.VERSION.SDK_INT < 33) {
                        ExecutorService executorService0 = bxbw.b;
                        ibuq.f(context0, "context");
                        ibuq.f(executorService0, "executor");
                        ibuq.f(bxbw.a, "scope");
                        ibrt ibrt0 = ((icqb)bxbw.a).a;
                        ibuq.f(context0, "context");
                        ibuq.f(executorService0, "executor");
                        ibuq.f(ibrt0, "coroutineContext");
                        if(!ibzk.G("legacyIcingGlobalDb", "/")) {
                            gmcd2 = fkpm.a(new fkpl(context0, executorService0, ibrt0));
                            bxbw.b(gmcd2, hftp0, bwts0, v1);
                            gmcd1 = glzd.g(gmcd2, new bxbx(bwts0, context0, gmcd2), gmap.a);
                            bxby.a = gmcd1;
                            return gmcd1;
                        }
                    }
                    else {
                        ExecutorService executorService1 = bxbw.b;
                        ibuq.f(context0, "context");
                        ibuq.f(executorService1, "executor");
                        ibuq.f(bxbw.a, "scope");
                        ibrt ibrt1 = ((icqb)bxbw.a).a;
                        ibuq.f(context0, "context");
                        ibuq.f(executorService1, "executor");
                        ibuq.f(ibrt1, "coroutineContext");
                        if(!ibzk.G("legacyIcingGlobalDb", "/")) {
                            fkpg fkpg0 = new fkpg(context0, executorService1, ibrt1);
                            icfg icfg0 = new icfg(null);
                            icck icck0 = iccl.b(fkpg0.d.plus(icfg0));
                            gmcd gmcd3 = icpu.e(icck0, new fkpe(fkpg0, icck0, null));
                            gmcd2 = glzd.g(gmcd3, new bxbq(gmcd3, context0), gmap.a);
                            bxbw.b(gmcd2, hftp0, bwts0, v1);
                            gmcd1 = glzd.g(gmcd2, new bxbx(bwts0, context0, gmcd2), gmap.a);
                            bxby.a = gmcd1;
                            return gmcd1;
                        }
                    }
                    throw new IllegalArgumentException("Database name cannot contain \'/\'");
                }
            }
            return gmcd1;
        }
        return gmcd0;
    }

    public final String k(String s, String s1) {
        bwne.d("handleCorpusDataCleared package:%s, corpus:%s", s, s1);
        bwuc bwuc0 = this.l;
        if(bwuc0 == null) {
            return String.format("Null \'clients\', IndexManager may not be initialized properly.");
        }
        bwua bwua0 = bwuc0.f(s);
        if(bwua0 != null) {
            try {
                this.p(bwua0, s1);
                return null;
            }
            catch(bwvr | bwvo exception0) {
                return String.format("handleCorpusDataCleared failed: %s", exception0);
            }
        }
        return String.format("handleCorpusDataCleared %s: not a known client.", s);
    }

    public final List l(bwud bwud0, GlobalSearchQuerySpecification globalSearchQuerySpecification0, boolean z) {
        List list0 = this.f().r(bwud0, globalSearchQuerySpecification0, z);
        if(bwud0.b()) {
            bwne.p("package %s is a global search app.", bwud0.e);
            return list0;
        }
        bwne.p("package %s is NOT a global search app.", bwud0.e);
        batl.s(this.l);
        Set set0 = this.l.m(bwud0);
        HashSet hashSet0 = new HashSet(set0.size());
        for(Object object0: set0) {
            hashSet0.add(((bwua)object0).b);
        }
        List list1 = new ArrayList();
        for(Object object1: list0) {
            bwnq bwnq0 = (bwnq)object1;
            if(hashSet0.contains(bwnq0.f)) {
                list1.add(bwnq0);
            }
            else {
                bwne.r("CorpusConfig package name : %s, Corpus name : %s is not active for global search because it doesn\'t belong to caller.", bwnq0.f, bwnq0.d);
            }
        }
        return list1;
    }

    public final void m() {
        if(this.F()) {
            return;
        }
        throw new bwvq("Not initialized");
    }

    public final void n(bwmw bwmw0, bwom bwom0) {
        if(bwom0.d) {
            this.r.d("init_docstore_recovery");
            bwmw0.b = true;
        }
    }

    public final void o(String s) {
        this.c.c(2);
        bwuc bwuc0 = this.l;
        if(bwuc0 != null) {
            bxax bxax0 = this.f;
            if(bxax0 != null) {
                Set set0 = bxax0.r();
                bwuv.f(s, bwuc0, ((Account[])set0.toArray(new Account[set0.size()])), this.y);
            }
        }
    }

    public final void p(bwua bwua0, String s) {
        bwur bwur0 = this.e();
        String s1 = bwua0.b;
        bwvl bwvl0 = new bwvl(s1, s);
        bwuw bwuw0 = bwur0.j(bwvl0);
        if(bwuw0 == null) {
            throw new bwvo(a.l(s1, s, "No CorpusConfig for ", " of "));
        }
        this.L(bwvl0, bwua0);
        NativeIndex nativeIndex0 = this.m;
        if(nativeIndex0 != null) {
            long v = ((bwnq)bwuw0.e()).j;
            if(NativeIndex.nativeClearUsageReportDataForIdAndUri(nativeIndex0.b, v, NativeIndex.B(""))) {
                this.S(bwvl0, bwuw0);
                return;
            }
        }
        throw new bwvr("Failed to clear usage report data for corpus " + s);
    }

    public final void q() {
        this.m();
        bwmb bwmb0 = new bwmb(this, gltq.D);
        this.c.h(bwmb0);
        bwmb0.v();
    }

    public final void r() {
        this.c.c(2);
        NativeIndex nativeIndex0 = this.m;
        if(nativeIndex0 != null) {
            nativeIndex0.w();
            this.m = null;
        }
        this.f = null;
        this.u = null;
        this.h = null;
        this.i = null;
        this.l = null;
        this.k = null;
        bxgu bxgu0 = this.j;
        if(bxgu0 != null) {
            bxgu0.d();
            this.j = null;
        }
        this.n = null;
        bwjz bwjz0 = this.o;
        if(bwjz0 != null) {
            bwjz0.a.j(bwjz0);
            this.o = null;
        }
        bwrc bwrc0 = this.p;
        if(bwrc0 != null) {
            bwrc0.c.d("com.google.android.gms.icing.service.IcingGcmTaskService", "drain-request-queue");
            try {
                bwrc0.a.close();
            }
            catch(IOException iOException0) {
                bwrc0.b.d("rq_close_failure");
                bwne.j(iOException0, "Failed to close request queue", new Object[0]);
            }
            this.p = null;
        }
    }

    final void s() {
        ProtoLiteBuilder hftp0;
        gloc gloc0;
        bwmu bwmu0;
        double f2;
        double f1;
        boolean z1;
        long v1;
        double f;
        bwqf bwqf0;
        boolean z;
        Object object2;
        NativeIndex nativeIndex0;
        Object object1;
        bxax bxax0;
        this.r.p(6003);
        bwne.k("Performing maintenance.");
        this.c.c(2);
        bwut bwut0 = this.f();
        Object object0 = bwut0.p();
        __monitor_enter(object0);
        try {
            bxax0 = this.f;
            if(bxax0 == null) {
                bwne.k("Null \'settings\', could not finish maintenance");
                __monitor_exit(object0);
                return;
            }
            object1 = bxax0.h;
            __monitor_enter(object1);
        }
        catch(Throwable throwable0) {
            object2 = object0;
            goto label_216;
        }
        try {
            nativeIndex0 = this.m;
            if(nativeIndex0 == null) {
                bwne.k("Null \'index\', could not finish maintenance");
                __monitor_exit(object1);
                goto label_17;
            }
            goto label_22;
        }
        catch(Throwable throwable1) {
            object2 = object0;
            goto label_211;
        }
        try {
        label_17:
            __monitor_exit(object0);
            return;
        }
        catch(Throwable throwable0) {
            try {
                object2 = object0;
            }
            catch(Throwable throwable0) {
            }
            goto label_216;
        }
        try {
        label_22:
            __monitor_enter(object1);
        }
        catch(Throwable throwable1) {
            object2 = object0;
            goto label_211;
        }
        try {
            bxax0.c.edit().putLong("last-maintenance", System.currentTimeMillis()).commit();
            __monitor_exit(object1);
        }
        catch(Throwable throwable2) {
            object2 = object0;
            while(true) {
                try {
                    __monitor_exit(object1);
                    throw throwable2;
                }
                catch(Throwable throwable2) {
                    try {
                    }
                    catch(Throwable throwable1) {
                        goto label_211;
                    }
                }
            }
        }
        try {
            bwzn bwzn0 = this.c;
            bwzn0.c(2);
            bwuc bwuc0 = this.l;
            if(bwuc0 != null) {
                bxax bxax1 = this.f;
                if(bxax1 != null) {
                    bwmj bwmj0 = this.y;
                    Set set0 = bxax1.r();
                    Account[] arr_account = (Account[])set0.toArray(new Account[set0.size()]);
                    List list0 = bwuc0.a.c.getInstalledPackages(0x80);
                    bwne.p("updateResources: found %d total apps", Integer.valueOf(list0.size()));
                    Set set1 = bwuc0.l();
                    for(Object object3: list0) {
                        PackageInfo packageInfo0 = (PackageInfo)object3;
                        if(packageInfo0.applicationInfo.enabled) {
                            set1.remove(packageInfo0.packageName);
                            bwuv.b(packageInfo0, false, bwuc0, arr_account, false, bwmj0);
                        }
                        else {
                            bwne.p("Package %s is disabled", packageInfo0.packageName);
                        }
                    }
                    bwne.r("Apps that are now uninstalled (%d): %s", Integer.valueOf(set1.size()), set1);
                    for(Object object4: set1) {
                        bwmj0.a(((String)object4));
                    }
                }
            }
            if(bxax0.D()) {
                bwuc bwuc1 = this.l;
                if(bwuc1 != null) {
                    bwzn0.h(new elfn(this.b, bxax0, bwut0, bwuc1));
                }
            }
            long v = System.currentTimeMillis();
            giux giux0 = nativeIndex0.k();
            z = v > (giux0 == null ? v : giux0.b * 1000L) + huar.a.d().h();
            bwqf0 = this.h;
            if(bwqf0 == null) {
                object2 = object0;
                z1 = z;
                goto label_92;
            }
            else {
                f = nativeIndex0.a();
                v1 = bwqf0.e();
                object2 = object0;
                goto label_77;
            }
            goto label_93;
        }
        catch(Throwable throwable1) {
            try {
                object2 = object0;
                goto label_211;
            label_77:
                long v2 = bwqf0.b();
                if(v1 > v2) {
                    z1 = z;
                    f1 = 0.0;
                }
                else {
                    z1 = z;
                    f1 = ((double)(v2 - v1)) / ((double)v2);
                }
                boolean z2 = f <= 0.05 || f1 <= 0.05;
                long v3 = (long)(((double)Math.min(v2, (Double.compare(f, 0.0) < 0 || !(f < 1.0) ? 0x7FFFFFFFFFFFFFFFL : ((long)(((double)v1) / (1.0 - f)))))) * 0.7);
                bwne.m("Performing maintenance usage %s budget %s free %.3f%% index free %.3f%% purge? %s target %s", new Object[]{v1, v2, ((double)(f1 * 100.0)), ((double)(f * 100.0)), Boolean.valueOf(z2), v3});
                if(z2 && v3 < v1) {
                    f2 = (((double)v1) - ((double)v3)) / ((double)v1);
                }
                else {
                label_92:
                    f2 = 0.0;
                }
            label_93:
                bxax bxax2 = this.f;
                batl.s(bxax2);
                if(!hubu.a.b().E()) {
                    if(bxax2.B()) {
                        bwne.a("Migrating away from newly downloaded model.");
                        bxax2.y(false);
                        bwmu0 = bwmu.c;
                    }
                    else {
                        bwmu0 = bwmu.a;
                    }
                }
                else if(!this.M("cld3-model")) {
                    bwmu0 = bwmu.a;
                }
                else if(bxax2.B()) {
                    bwne.a("Upgrading downloaded model.");
                    bwmu0 = bwmu.d;
                }
                else {
                    bwne.a("Migrating to newly downloaded model.");
                    bxax2.y(true);
                    bwmu0 = bwmu.b;
                }
                bwne.b("LangId model change status = %s", bwmu0);
                boolean z3 = huar.j() && this.M("saft-segmenter-model");
                boolean z4 = huar.g() && this.M("address_data");
                boolean z5 = bwvu.h() && this.M("nicknames");
                bwop bwop0 = this.c();
                String s = ghgz.a.a((bwop0.i == null ? bwkp.a : bwop0.i).toBytesArray()).toString();
                if(bwmu0 != bwmu.a || z3 || z4 || z5 || !this.v.equals(s)) {
                    if(nativeIndex0.A(bwop0)) {
                        this.v = s;
                    }
                    else {
                        bwne.k("Failed to update native config.");
                    }
                    if(z3) {
                        this.C();
                    }
                }
                else {
                    bwne.a("Not attempting to update native config as no configuration changed.");
                }
                NativeIndex.nativeOnMaintenance(nativeIndex0.b, z1);
                bwqf bwqf1 = this.h;
                if(bwqf1 != null) {
                    byte[] arr_b = NativeIndex.nativeGetStorageState(nativeIndex0.b);
                    if(arr_b == null) {
                        gloc0 = null;
                    }
                    else {
                        try {
                            hftc hftc0 = hftc.a();
                            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gloc.a), arr_b, 0, arr_b.length, hftc0);
                            ProtoLiteMessage.P_makeImmutable(hftv0);
                            gloc0 = (gloc)hftv0;
                        }
                        catch(hfur hfur0) {
                            bwne.j(hfur0, "Failed parsing storage state", new Object[0]);
                            gloc0 = null;
                        }
                    }
                    bwts bwts0 = this.r;
                    double f3 = nativeIndex0.a();
                    if(bwts0.l()) {
                        if(gloc0 == null) {
                            hftp0 = ((ProtoLiteMessage)gloc.a).v_newBuilder();
                        }
                        else {
                            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gloc0).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)gloc0));
                            hftp0 = hftp1;
                        }
                        int v4 = bwqf1.h(f3);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gloc)hftp0.b_message).c = v4 - 2;
                        ((gloc)hftp0.b_message).b |= 1;
                        long v5 = bwqf1.d();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gloc gloc1 = (gloc)hftp0.b_message;
                        gloc1.b |= 2;
                        gloc1.d = v5;
                        long v6 = bwqf1.c();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv1 = hftp0.b_message;
                        ((gloc)hftv1).b |= 4;
                        ((gloc)hftv1).e = v6;
                        long v7 = bwqf1.b;
                        if(!hftv1.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gloc gloc2 = (gloc)hftp0.b_message;
                        gloc2.b |= 8;
                        gloc2.f = v7;
                        boolean z6 = bwqf1.f();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gloc gloc3 = (gloc)hftp0.b_message;
                        gloc3.b |= 16;
                        gloc3.g = z6;
                        gloc gloc4 = (gloc)hftp0.N_build();
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        glnz glnz0 = (glnz)hftp2.b_message;
                        gloc4.getClass();
                        glnz0.f = gloc4;
                        glnz0.b |= 2;
                        if(huae.g()) {
                            bwts0.t(hftp2);
                            bwts0.a.c(cdef.dJ, "sstate", hftp2);
                        }
                        else {
                            long v8 = huax.c();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            glnz glnz1 = (glnz)hftp2.b_message;
                            glnz1.b |= 0x80000;
                            glnz1.s = v8;
                            bwts0.r("sstate", hftp2);
                        }
                    }
                }
                if(f2 != 0.0) {
                    this.Q(f2, 5);
                    __monitor_exit(object1);
                    goto label_213;
                }
                else if(z1) {
                    this.R(4);
                }
                else {
                    this.v();
                    __monitor_exit(object1);
                    goto label_213;
                }
                __monitor_exit(object1);
                goto label_213;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
        }
        catch(Throwable throwable0) {
            goto label_216;
        }
    label_211:
        __monitor_exit(object1);
        try {
            throw throwable1;
        label_213:
            __monitor_exit(object2);
            goto label_218;
        label_216:
            __monitor_exit(object2);
        }
        catch(Throwable throwable0) {
            goto label_216;
        }
        throw throwable0;
        try {
        label_218:
            bwsx bwsx0 = bwsx.a(this.b);
            if(hubn.a.b().g()) {
                bwsx0.f("errors", 2592000);
            }
            bwsx0.f("user_actions", 7776000);
        }
        catch(SQLiteException unused_ex) {
            this.d();
            huax.h();
            bwne.x();
        }
        bwts bwts1 = this.r;
        if(!bwts1.m(huax.c(), false)) {
            return;
        }
        long v9 = SystemClock.elapsedRealtime();
        NativeIndex nativeIndex1 = this.m;
        if(nativeIndex1 == null) {
            bwne.f("Null \'index\', couldn\'t get usage stats for logging.");
            return;
        }
        bwpz bwpz0 = nativeIndex1.j();
        if(bwpz0 == null) {
            bwne.f("Failed to get usage stats for logging.");
        }
        else {
            SparseArray sparseArray0 = new SparseArray();
            for(Object object5: bwpz0.b) {
                sparseArray0.put(((bwpy)object5).b, ((bwpy)object5));
            }
            glnt glnt0 = (glnt)((ProtoLiteMessage)glnu.a).v_newBuilder();
            bwut bwut1 = this.f();
            synchronized(((bwur)bwut1).p()) {
                ArrayList arrayList0 = new ArrayList(((bwur)bwut1).f.size());
                for(Object object7: ((bwur)bwut1).f.values()) {
                    arrayList0.add(((bwnr)object7));
                }
            }
            for(Object object8: arrayList0) {
                bwnr bwnr0 = (bwnr)object8;
                boolean z7 = bwnx.a((bwnr0.d == null ? bwny.a : bwnr0.d).d) != 0 && bwnx.a((bwnr0.d == null ? bwny.a : bwnr0.d).d) != 1;
                bwpy bwpy0 = (bwpy)sparseArray0.get((bwnr0.c == null ? bwnq.a : bwnr0.c).c);
                if(!((Boolean)bwvu.j.b()).booleanValue()) {
                    if(bwpy0 == null || z7) {
                        continue;
                    }
                    z7 = false;
                }
                ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glqc.a).v_newBuilder();
                String s1 = (bwnr0.c == null ? bwnq.a : bwnr0.c).f;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp3.b_message;
                s1.getClass();
                ((glqc)hftv2).b |= 16;
                ((glqc)hftv2).g = s1;
                if(!hftv2.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp3.b_message;
                ((glqc)hftv3).b |= 0x40;
                ((glqc)hftv3).i = z7;
                if(bwpy0 != null) {
                    int v11 = bwpy0.c;
                    if(!hftv3.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp3.b_message;
                    ((glqc)hftv4).b |= 1;
                    ((glqc)hftv4).c = v11;
                    int v12 = bwpy0.d;
                    if(!hftv4.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp3.b_message;
                    ((glqc)hftv5).b |= 4;
                    ((glqc)hftv5).e = v12;
                    long v13 = bwpy0.e;
                    if(!hftv5.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp3.b_message;
                    ((glqc)hftv6).b |= 2;
                    ((glqc)hftv6).d = v13;
                    long v14 = bwpy0.f;
                    if(!hftv6.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    glqc glqc0 = (glqc)hftp3.b_message;
                    glqc0.b |= 8;
                    glqc0.f = v14;
                }
                String s2 = bxge.a((bwnr0.c == null ? bwnq.a : bwnr0.c));
                if(s2 != null) {
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    glqc glqc1 = (glqc)hftp3.b_message;
                    glqc1.b |= 0x20;
                    glqc1.h = s2;
                }
                glnt0.a(hftp3);
            }
            glnu glnu0 = (glnu)((ProtoLiteBuilder)glnt0).N_build();
            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            glnz glnz2 = (glnz)hftp4.b_message;
            glnu0.getClass();
            glnz2.l = glnu0;
            glnz2.b |= 0x40;
            if(huae.g()) {
                bwts1.t(hftp4);
                bwts1.a.c(cdef.dJ, "cstats", hftp4);
            }
            else {
                long v15 = huax.c();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                glnz glnz3 = (glnz)hftp4.b_message;
                glnz3.b |= 0x80000;
                glnz3.s = v15;
                bwts1.r("cstats", hftp4);
            }
        }
        this.z(glro.j, v9);
    }

    public final void t() {
        ggfp ggfp0;
        if("*".equals(hubx.d())) {
            ggfp0 = this.e().n();
        }
        else {
            ggfn ggfn0 = new ggfn();
            for(Object object0: gfud.e(',').l(hubx.d())) {
                bwuc bwuc0 = this.l;
                if(bwuc0 == null) {
                    break;
                }
                bwua bwua0 = bwuc0.f(((String)object0));
                if(bwua0 != null) {
                    ggfn0.k(this.e().m(bwua0));
                }
            }
            ggfp0 = ggfn0.h();
        }
        ggqj ggqj0 = ggfp0.om();
        while(ggqj0.hasNext()) {
            Object object1 = ggqj0.next();
            bwvl bwvl0 = (bwvl)object1;
            bwvg bwvg0 = this.n;
            if(bwvg0 != null) {
                bwnr bwnr0 = this.e().e(bwvl0);
                if(bwnr0 != null) {
                    bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                    if((bwnx.a(bwny0.d) == 0 || bwnx.a(bwny0.d) == 1) && bwur.C((bwnr0.c == null ? bwnq.a : bwnr0.c))) {
                        bwvg0.a(bwvl0);
                    }
                }
            }
        }
    }

    public final void u(PrintWriter printWriter0, boolean z, int v) {
        bwno bwno0;
        long v6;
        long v4;
        String s9;
        bwnq bwnq3;
        StringBuilder stringBuilder2;
        String s4;
        String s2;
        Iterator iterator3;
        if(!this.F()) {
            printWriter0.println("Init failed");
            return;
        }
        NativeIndex nativeIndex0 = this.m;
        batl.s(nativeIndex0);
        bxax bxax0 = this.f;
        batl.s(bxax0);
        try {
            PackageInfo packageInfo0 = this.b.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            printWriter0.format("Apk version code: %d\n", new Object[]{((int)packageInfo0.versionCode)});
            printWriter0.format("Apk version name: %s\n", new Object[]{packageInfo0.versionName});
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        printWriter0.format("Version: %d\n", new Object[]{bxax0.b()});
        bwqf bwqf0 = this.h;
        if(bwqf0 != null) {
            double f = nativeIndex0.a();
            printWriter0.format("Storage state: %s\n", new Object[]{bwqf.i(bwqf0.h(f))});
            long v1 = bwqf0.e();
            long v2 = bwqf0.b();
            printWriter0.format("Disk usage %s budget %s free frac %.3f%% index free frac %.3f%%\n", new Object[]{bwwh.f(v1), bwwh.f(v2), ((double)(Long.compare(v1, v2) <= 0 ? (((double)v2) - ((double)v1)) / ((double)v2) * 100.0 : 0.0)), ((double)(f * 100.0))});
        }
        giux giux0 = nativeIndex0.k();
        if(giux0 == null) {
            giux0 = giux.a;
        }
        bwut bwut0 = this.f();
        synchronized(((bwur)bwut0).p()) {
            v4 = ((bwur)bwut0).h.a.getLong("created", 0L);
        }
        Date date0 = new Date(v4);
        byte[] arr_b = NativeIndex.nativeGetStatus(nativeIndex0.b, false);
        bwoa bwoa0 = bwoa.a;
        bwoa bwoa1 = (bwoa)NativeIndex.s(arr_b, ((Parser)((ProtoLiteMessage)bwoa0).jf(7, null)));
        if(bwoa1 == null) {
            printWriter0.println("Error parsing index status proto. Using dummy data.");
            bwoa1 = bwoa0;
        }
        bwoa bwoa2 = (bwoa)NativeIndex.s(NativeIndex.nativeGetStatus(nativeIndex0.b, true), ((Parser)((ProtoLiteMessage)bwoa0).jf(7, null)));
        if(bwoa2 == null) {
            printWriter0.println("Error parsing committed status proto. Using dummy data.");
        }
        else {
            bwoa0 = bwoa2;
        }
        Date date1 = new Date(bwoa0.b * 1000L);
        Date date2 = new Date(bxax0.e());
        Date date3 = new Date(bwoa0.b * 1000L);
        Date date4 = new Date(giux0.b * 1000L);
        DateFormat dateFormat0 = SimpleDateFormat.getDateTimeInstance(2, 2, Locale.US);
        printWriter0.format("Created \"%s\"\n", new Object[]{dateFormat0.format(date0)});
        printWriter0.format("Committed \"%s\"\n", new Object[]{dateFormat0.format(date1)});
        printWriter0.format("Maintained \"%s\"\n", new Object[]{dateFormat0.format(date2)});
        printWriter0.format("Flushed \"%s\" num docs %d\n", new Object[]{dateFormat0.format(date3), ((int)bwoa0.d)});
        printWriter0.format("Compacted \"%s\" num docs %d err %d\n", new Object[]{dateFormat0.format(date4), ((int)giux0.c), ((int)giux0.d)});
        Boolean boolean0 = Boolean.valueOf(bxax0.D());
        synchronized(bxax0.h) {
            v6 = bxax0.c.getLong("app-params-last-update", 0L);
        }
        printWriter0.format("App params: %s lu: %s ttl: %d\n", new Object[]{boolean0, dateFormat0.format(new Date(v6)), ((int)bxax0.g)});
        synchronized(bxax0.h) {
            bwno0 = (bwno)bwwh.e(bxax0.c.getString("app-history-upload-status", null), ((Parser)((ProtoLiteMessage)bwno.a).jf(7, null)));
        }
        printWriter0.format("App history upl %sp: %s ls: %d/%d\n", new Object[]{(huar.f() ? "" : "DISABLED "), Boolean.valueOf(bxax0.C()), ((long)bwno0.b), ((long)bwno0.c)});
        printWriter0.println("\nCorpora:");
        bwut bwut1 = this.f();
        hfuo hfuo0 = bwoa1.c;
        hfuo hfuo1 = bwoa0.c;
        synchronized(((bwur)bwut1).p()) {
            Map map0 = ((bwur)bwut1).f;
            if(map0.isEmpty()) {
                printWriter0.append("No corpora\n");
            }
            else {
                ArrayList arrayList0 = new ArrayList(map0.entrySet());
                Collections.sort(arrayList0, new bwui(((bwur)bwut1)));
                for(Iterator iterator0 = arrayList0.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                    Object object2 = iterator0.next();
                    bwnq bwnq0 = ((bwnr)((Map.Entry)object2).getValue()).c;
                    if(bwnq0 == null) {
                        bwnq0 = bwnq.a;
                    }
                    int v9 = bwnq0.c;
                    long v10 = v9 >= hfuo0.size() ? 0L : ((bwnz)hfuo0.get(v9)).b;
                    long v11 = v9 >= hfuo1.size() ? 0L : ((bwnz)hfuo1.get(v9)).b;
                    String s = ((bwvl)((Map.Entry)object2).getKey()).b();
                    bwnr bwnr0 = (bwnr)((Map.Entry)object2).getValue();
                    StringBuilder stringBuilder0 = new StringBuilder();
                    int v12 = 0;
                    for(Object object3: (bwnr0.c == null ? bwnq.a : bwnr0.c).k) {
                        bwlo bwlo0 = (bwlo)object3;
                        stringBuilder0.append("    ");
                        stringBuilder0.append(v12);
                        stringBuilder0.append(' ');
                        stringBuilder0.append(bwlo0.d);
                        if(!bwlo0.e) {
                            stringBuilder0.append("(noindex)");
                        }
                        switch((bwll.b(bwlo0.f) == null ? bwll.a : bwll.b(bwlo0.f)).ordinal()) {
                            case 0: {
                                break;
                            }
                            case 1: {
                                stringBuilder0.append("(html)");
                                break;
                            }
                            case 2: {
                                stringBuilder0.append("(rfc822)");
                                break;
                            }
                            case 3: {
                                stringBuilder0.append("(url)");
                                break;
                            }
                            case 4: {
                                stringBuilder0.append("(none)");
                                break;
                            }
                            default: {
                                stringBuilder0.append("(unknown: ");
                                stringBuilder0.append((bwll.b(bwlo0.f) == null ? bwll.a : bwll.b(bwlo0.f)).g);
                                stringBuilder0.append(')');
                            }
                        }
                        if(bwlo0.g != 1) {
                            stringBuilder0.append(" w:");
                            stringBuilder0.append(bwlo0.g);
                        }
                        hfug hfug0 = bwlo.a;
                        if(!new hfuh(bwlo0.j, hfug0).isEmpty()) {
                            stringBuilder0.append(" (variants");
                            for(Iterator iterator2 = new hfuh(bwlo0.j, hfug0).iterator(); iterator2.hasNext(); iterator2 = iterator3) {
                                Object object4 = iterator2.next();
                                String s1 = "unknown";
                                int v13 = ((bwln)object4).ordinal();
                                if(v13 == 0) {
                                    iterator3 = iterator2;
                                    s1 = "nick";
                                }
                                else {
                                    iterator3 = iterator2;
                                    if(v13 == 2) {
                                        s1 = "annotation";
                                    }
                                }
                                stringBuilder0.append(' ');
                                stringBuilder0.append(s1);
                            }
                            stringBuilder0.append(')');
                        }
                        if(bwlh.a(bwlo0.p) != 0 && bwlh.a(bwlo0.p) != 1) {
                            stringBuilder0.append(" (omni ");
                            switch((bwlh.a(bwlo0.p) == 0 ? 1 : bwlh.a(bwlo0.p)) - 1) {
                                case 1: {
                                    stringBuilder0.append("url)");
                                    break;
                                }
                                case 2: {
                                    stringBuilder0.append("title)");
                                    break;
                                }
                                default: {
                                    stringBuilder0.append("?)");
                                }
                            }
                        }
                        if(!bwlo0.n.isEmpty()) {
                            stringBuilder0.append(" p:");
                            stringBuilder0.append(bwlo0.n);
                        }
                        stringBuilder0.append('\n');
                        ++v12;
                        iterator0 = iterator0;
                    }
                    stringBuilder0.append("Global Search Sections: ");
                    stringBuilder0.append((bwnr0.c == null ? bwnq.a : bwnr0.c).l.size());
                    stringBuilder0.append("\n");
                    Iterator iterator4 = (bwnr0.c == null ? bwnq.a : bwnr0.c).l.iterator();
                    while(true) {
                        s2 = "";
                        if(!iterator4.hasNext()) {
                            break;
                        }
                        Object object5 = iterator4.next();
                        stringBuilder0.append("    ");
                        stringBuilder0.append(abvx.b(((bwpw)object5).c));
                        stringBuilder0.append(": 0x");
                        stringBuilder0.append(Integer.toHexString(((bwpw)object5).e) + (((bwpw)object5).e == 0 ? " (template literal)" : ""));
                        stringBuilder0.append(" parts: \"");
                        bwpv bwpv0 = ((bwpw)object5).d;
                        if(bwpv0 == null) {
                            bwpv0 = bwpv.a;
                        }
                        for(Object object6: bwpv0.b) {
                            bwpu bwpu0 = (bwpu)object6;
                            int v14 = bwpu0.b;
                            if((v14 & 4) != 0) {
                                stringBuilder0.append("%$bestMatch");
                            }
                            else if((v14 & 2) == 0) {
                                if(!bwpu0.c.isEmpty()) {
                                    stringBuilder0.append(bwpu0.c);
                                }
                                else if((bwpu0.b & 8) == 0) {
                                    stringBuilder0.append("[?unknown template part]");
                                }
                                else {
                                    stringBuilder0.append("%$uri");
                                }
                            }
                            else if((bwpu0.d == null ? bwps.a : bwpu0.d).c >= (bwnr0.c == null ? bwnq.a : bwnr0.c).k.size()) {
                                stringBuilder0.append("[?invalid section ID:");
                                stringBuilder0.append((bwpu0.d == null ? bwps.a : bwpu0.d).c);
                                stringBuilder0.append(" (total:");
                                stringBuilder0.append((bwnr0.c == null ? bwnq.a : bwnr0.c).k.size());
                                stringBuilder0.append(")]");
                            }
                            else {
                                stringBuilder0.append("$");
                                stringBuilder0.append(((bwlo)(bwnr0.c == null ? bwnq.a : bwnr0.c).k.get((bwpu0.d == null ? bwps.a : bwpu0.d).c)).d);
                            }
                        }
                        stringBuilder0.append("\"\n");
                    }
                    if(!(bwnr0.c == null ? bwnq.a : bwnr0.c).q.isEmpty()) {
                        if(!Build.TYPE.equals("eng") && !Build.TYPE.equals("userdebug")) {
                            s2 = "  account:<redacted>\n";
                        }
                        else {
                            bwnq bwnq1 = bwnr0.c;
                            String s3 = (bwnq1 == null ? bwnq.a : bwnq1).q;
                            if(bwnq1 == null) {
                                bwnq1 = bwnq.a;
                            }
                            s2 = "  account:" + s3 + "(" + bwnq1.p + ")\n";
                        }
                    }
                    StringBuilder stringBuilder1 = new StringBuilder();
                    for(Object object7: (bwnr0.d == null ? bwny.a : bwnr0.d).c) {
                        stringBuilder1.append("    ");
                        stringBuilder1.append(((bwnu)object7).c);
                        stringBuilder1.append(": ");
                        stringBuilder1.append(((bwnu)object7).d);
                        stringBuilder1.append('\n');
                    }
                    bwny bwny0 = bwnr0.d == null ? bwny.a : bwnr0.d;
                    switch((bwnx.a(bwny0.d) == 0 ? 1 : bwnx.a(bwny0.d)) - 1) {
                        case 0: {
                            s4 = "active";
                            break;
                        }
                        case 1: {
                            s4 = "LIMBO";
                            break;
                        }
                        default: {
                            s4 = "DELETED";
                        }
                    }
                    Locale locale0 = Locale.US;
                    Integer integer0 = (int)(bwnr0.c == null ? bwnq.a : bwnr0.c).c;
                    bwnq bwnq2 = bwnr0.c;
                    String s5 = (bwnq2 == null ? bwnq.a : bwnq2).d;
                    String s6 = (bwnq2 == null ? bwnq.a : bwnq2).e;
                    if(bwnq2 == null) {
                        stringBuilder2 = stringBuilder1;
                        bwnq3 = bwnq.a;
                    }
                    else {
                        stringBuilder2 = stringBuilder1;
                        bwnq3 = bwnq2;
                    }
                    String s7 = bwnq3.f;
                    if(bwnq2 == null) {
                        bwnq2 = bwnq.a;
                    }
                    printWriter0.format("%s:\n%s\n", new Object[]{s, String.format(locale0, "  id:%d\n  name:%s\n  version:\"%s\"\n  package:%s\n  uri:%s\n  trimmable:%s\n  state:%s\n  last indexed/committed:%d/%d\n  source:%s\n  sourcedTime:%s\n  usageReportId:%d\n  content incarnation:[%s]\n  type:%s\n  %s  sections:\n%s  counters:\n%s", integer0, s5, s6, s7, (bwnq2.g.isEmpty() ? "(push)" : (bwnr0.c == null ? bwnq.a : bwnr0.c).g), Boolean.valueOf((bwnr0.c == null ? bwnq.a : bwnr0.c).h), s4, v10, v11, bwuw.f((bwnr0.c == null ? bwnq.a : bwnr0.c).m), DateFormat.getInstance().format(Long.valueOf((bwnr0.c == null ? bwnq.a : bwnr0.c).o)), ((long)(bwnr0.c == null ? bwnq.a : bwnr0.c).j), (bwnr0.d == null ? bwny.a : bwnr0.d).h, (bwnr0.c == null ? bwnq.a : bwnr0.c).r, s2, stringBuilder0.toString(), stringBuilder2.toString())});
                    hfuo0 = hfuo0;
                }
            }
        }
        printWriter0.println("\nInternal Corpora:");
        printWriter0.println("Gservices flags:");
        printWriter0.format("  disableSMS: %b disableApps: %b disableContacts: %b clearInternalCorporaOnContentIncarnationMismatch: %b\n", new Object[]{Boolean.valueOf(hubn.a.b().d()), Boolean.valueOf(hubg.n()), Boolean.valueOf(hubn.c()), Boolean.valueOf(true)});
        printWriter0.format("  Min AGSA version: %d\n", new Object[]{huau.b()});
        bwwy bwwy0 = bwwy.c(this.b);
        if(bwwy0 != null) {
            printWriter0.println("Apps:");
            printWriter0.format("  File version: %d\n", new Object[]{((int)4)});
            printWriter0.format("  Last seqno: %d\n", new Object[]{bwwy0.b()});
            bwyv bwyv0 = bwwy0.c;
            if(bwyv0 != null) {
                synchronized(bwyv.a) {
                    printWriter0.format("  Size of journal: %d bytes\n", new Object[]{bwyv0.c.getFileStreamPath(bwyv0.d).length()});
                    printWriter0.format("  Number of component names: %d\n", new Object[]{bwyv0.a().size()});
                }
            }
        }
        printWriter0.println("\nClientInfo:");
        bwuc bwuc0 = this.l;
        if(bwuc0 != null) {
            synchronized(bwuc0.b) {
                printWriter0.write("\nRegistered client info:");
                for(Object object9: bwuc0.c.values()) {
                    bwua bwua0 = (bwua)object9;
                    synchronized(bwua0.d.h) {
                        printWriter0.format("\nInfo for package %s", new Object[]{bwua0.b});
                        kau kau0 = bwua0.d.g(bwua0.b);
                        printWriter0.format("\n  version code: %d cert: %s", new Object[]{kau0.a, kau0.b});
                        try {
                            printWriter0.format("\n  version name: %s", new Object[]{bwua0.c.c.getPackageInfo(bwua0.b, 0).versionName});
                        }
                        catch(PackageManager.NameNotFoundException unused_ex) {
                            printWriter0.print("\n  failed to get package info for this client.");
                        }
                        bxax bxax1 = bwua0.d;
                        String s8 = bwua0.b;
                        printWriter0.format("\n  fingerprint: %s", new Object[]{bxax1.o(s8)});
                        printWriter0.format("\n  resource fingerprint: %s", new Object[]{bxax1.p(s8)});
                        printWriter0.format("\n  blocked: %s", new Object[]{Boolean.valueOf(bxax1.E(s8))});
                        synchronized(bxax1.h) {
                            bxag bxag0 = (bxag)bxax1.f.get(s8);
                        }
                        if(bxag0 != null && bxag0.c) {
                            printWriter0.format("\n  ***blacklisted***", new Object[0]);
                        }
                        if(bwua0.t()) {
                            printWriter0.format("\n  per-acct-template", new Object[0]);
                        }
                        printWriter0.print("\n  global search info:");
                        printWriter0.format("\n    sourced at %d %s", new Object[]{bxax1.c(s8), bwuw.f(bxax1.a(s8))});
                        if("com.google.android.gms".equals(s8)) {
                            for(Object object11: bxax1.q()) {
                                printWriter0.format("\n    %s (%s)", new Object[]{((GlobalSearchApplicationInfo)object11), bxax1.j(((GlobalSearchApplicationInfo)object11).b)});
                            }
                        }
                        else {
                            printWriter0.format("\n    %s (%s)", new Object[]{bxax1.h(s8), bxax1.i(s8)});
                        }
                    }
                }
            }
        }
        printWriter0.println("\nCorpus Usage Stats:");
        bwpz bwpz0 = nativeIndex0.j();
        if(bwpz0 == null) {
            printWriter0.println("\nError getting usage stats");
        }
        else {
            for(Object object12: bwpz0.b) {
                printWriter0.format("id: %d\n", new Object[]{((int)((bwpy)object12).b)});
                printWriter0.format("docs: %d\n", new Object[]{((int)((bwpy)object12).c)});
                printWriter0.format("size: %s\n", new Object[]{bwwh.f(((bwpy)object12).e)});
                printWriter0.format("deleted docs: %d\n", new Object[]{((int)((bwpy)object12).d)});
                printWriter0.format("deleted size: %d\n", new Object[]{((long)((bwpy)object12).f)});
                printWriter0.println();
            }
        }
        if(z) {
            printWriter0.println("\nNative Index:");
            byte[] arr_b1 = NativeIndex.nativeGetDebugInfo(nativeIndex0.b, v);
            try {
                s9 = new String(arr_b1, "UTF-8");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                bwne.j(unsupportedEncodingException0, "Can\'t convert byte array to String", new Object[0]);
                s9 = "";
            }
            printWriter0.println(s9);
        }
        bxgq bxgq0 = this.u;
        if(bxgq0 != null) {
            synchronized(bxgq0.a) {
                printWriter0.format("QueryRecorder recording mode: %s\n", new Object[]{Boolean.valueOf(bxgq0.b)});
                printWriter0.format("Records file path %s\n", new Object[]{bxgq0.c.getAbsolutePath()});
            }
            List list0 = bxgq0.a();
            if(list0 != null) {
                for(Object object13: list0) {
                    printWriter0.format("record: {\n%s\n}\n", new Object[]{((ProtoLiteMessage)(((bwow)object13))).toString()});
                }
            }
        }
    }

    public final void v() {
        this.c.c(2);
        NativeIndex nativeIndex0 = this.m;
        if(nativeIndex0 == null) {
            bwne.s("Null \'index\', unable to flush");
            return;
        }
        NativeIndex.nativeFlush(nativeIndex0.b);
        bwur bwur0 = this.e();
        synchronized(bwur0.p()) {
            bwvn bwvn0 = bwur0.h;
            Collection collection0 = bwur0.f.values();
            SharedPreferences.Editor sharedPreferences$Editor0 = bwvn0.a.edit();
            for(Object object1: collection0) {
                sharedPreferences$Editor0.putString("corpuskey:" + bwvn0.a(new bwvl(((bwnr)object1))), bwwh.g(((MessageLite)(((bwnr)object1)))));
            }
            if(!sharedPreferences$Editor0.commit()) {
                bwur0.e.d("metadata_union_writeMetadataBatch_err");
            }
            else if(bwvn0.b.b() && !bwvn0.b.a()) {
                bwne.f("Failed to delete stale scratch file.");
            }
            bwur0.g = false;
        }
    }

    public final void w(String s, String s1) {
        String s2 = this.k(s, s1);
        if(s2 != null) {
            bwne.g("Failed to handle corpus data cleared %s", s2);
        }
    }

    public final void x(String s) {
        this.c.c(2);
        this.T(s);
        bwuc bwuc0 = this.l;
        if(bwuc0 == null) {
            bwne.s("Null \'clients\', unable to clear package data");
            return;
        }
        bwuc0.e(s).k();
        this.o(s);
    }

    final void y(String s) {
        this.c.c(2);
        this.T(s);
    }

    public final void z(glro glro0, long v) {
        int v1 = (int)(SystemClock.elapsedRealtime() - v);
        this.r.j(glro0, v1);
    }
}

