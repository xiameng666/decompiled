import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class bwqd extends bwzp {
    private final bwmx a;
    private final boolean b;
    private final boolean c;
    private final Map d;

    public bwqd(bwmx bwmx0, boolean z, boolean z1) {
        super(gltq.b, 2);
        this.d = new HashMap();
        this.a = bwmx0;
        this.b = z;
        this.c = z1;
    }

    @Override  // bwzp
    protected final Object a() {
        Throwable throwable2;
        huau huau1;
        long v6;
        bxgk bxgk2;
        bxgk bxgk1;
        bwny bwny0;
        bwvl bwvl0;
        bwur bwur3;
        bxgk bxgk0;
        bwka bwka2;
        bxax bxax1;
        bxgm bxgm1;
        bwur bwur2;
        bwqd bwqd1;
        bwnq bwnq2;
        bwmx bwmx1;
        int v2;
        bwlb bwlb0;
        Iterator iterator0;
        SparseArray sparseArray0;
        bwld bwld0;
        bwnq bwnq1;
        bxgw bxgw0;
        String s;
        ResolveInfo resolveInfo0;
        UsageEvents usageEvents0;
        bwka bwka1;
        bxfw bxfw1;
        bwqd bwqd0 = this;
        bwmx bwmx0 = bwqd0.a;
        NativeIndex nativeIndex0 = bwmx0.m;
        if(nativeIndex0 == null) {
            bwne.s("Failed to get native index in slurp task.");
            return null;
        }
        if(!nativeIndex0.y()) {
            bwne.s("Failed to apply pending usage report deletions in slurp task. Continuing anyway.");
        }
        bwur bwur0 = bwmx0.e();
        bwka bwka0 = new bwka();
        bxax bxax0 = bwmx0.f;
        if(bxax0 != null) {
            bxgy bxgy0 = bwmx0.k;
            batl.s(bxgy0);
            bxfw bxfw0 = bxgy0.b();
            Context context0 = bwmx0.b;
            bwur bwur1 = bwmx0.e();
            bwts bwts0 = bwmx0.r;
            bwuc bwuc0 = bwmx0.l;
            if(((Boolean)bwvu.q.b()).booleanValue() && bwuc0 != null) {
                bwnq bwnq0 = bwur1.c(bxfv.a);
                if(bwnq0 == null) {
                    bwne.f("Can\'t get CorpusConfig for Apps Corpus.");
                    bxfw1 = bxgl.b();
                    bwka1 = bwka0;
                }
                else {
                    bwka1 = bwka0;
                    long v = System.currentTimeMillis();
                    SharedPreferences sharedPreferences0 = context0.getSharedPreferences("usage_stats_manager_prefs", 0);
                    long v1 = sharedPreferences0.getLong("usage_stats_timestamp", 0L);
                    sharedPreferences0.edit().putLong("usage_stats_timestamp", v).commit();
                    UsageStatsManager usageStatsManager0 = (UsageStatsManager)context0.getSystemService("usagestats");
                    try {
                        usageEvents0 = usageStatsManager0.queryEvents(Math.max(v1, v - bxfv.b), v);
                    }
                    catch(RuntimeException unused_ex) {
                        bwne.f("b/62250956. Bad implementation of UsageStatsManager.queryEvents on LeEco devices");
                        bxfw1 = bxgl.b();
                        goto label_52;
                    }
                    PackageManager packageManager0 = context0.getPackageManager();
                    Intent intent0 = new Intent("android.intent.action.MAIN");
                    intent0.addCategory("android.intent.category.HOME");
                    try {
                        resolveInfo0 = packageManager0.resolveActivity(intent0, 0x10000);
                    }
                    catch(SecurityException securityException0) {
                        bwzd.p("Failed to get default launcher package name. Exception: %s", securityException0);
                        s = null;
                        goto label_47;
                    }
                    s = resolveInfo0 == null || resolveInfo0.activityInfo == null ? null : resolveInfo0.activityInfo.packageName;
                label_47:
                    bxfw1 = new bxfu(context0.getPackageManager(), bwnq0, usageEvents0, bwuc0, s, bwts0);
                }
            }
            else {
                bwka1 = bwka0;
                bwne.a("Apps Usage Signals is not enabled.");
                bxfw1 = bxgl.b();
            }
        label_52:
            bxgm bxgm0 = new bxgm(bxfw0, bxfw1);
            if(bwqd0.b) {
                bxgm0.close();
                return null;
            }
            while(true) {
                try {
                label_54:
                    if(!bxgm0.hasNext()) {
                        break;
                    }
                    bxgw0 = (bxgw)bxgm0.next();
                    bwnq1 = bxgw0.b;
                    if(bwnq1 == null) {
                        bwpx bwpx0 = bxgw0.a;
                        bwld0 = bwpx0.j;
                        if(bwld0 == null) {
                            goto label_61;
                        }
                        goto label_62;
                    }
                    else {
                        goto label_272;
                    }
                    goto label_280;
                }
                catch(Throwable throwable0) {
                    bxgm1 = bxgm0;
                    goto label_287;
                }
                try {
                label_61:
                    bwld0 = bwld.a;
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    bxgm1 = bxgm0;
                    goto label_288;
                }
                try {
                label_62:
                    sparseArray0 = new SparseArray();
                    iterator0 = bwld0.f.iterator();
                    while(true) {
                    label_64:
                        if(!iterator0.hasNext()) {
                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwld0).jf(5, null);
                            hftp0.X(((ProtoLiteMessage)bwld0));
                            bwlb0 = (bwlb)hftp0;
                            if(!bwlb0.b_message.isImmutable()) {
                                break;
                            }
                            goto label_70;
                        }
                        goto label_114;
                    }
                }
                catch(Throwable throwable0) {
                    bxgm1 = bxgm0;
                    goto label_287;
                }
                try {
                    ((ProtoLiteBuilder)bwlb0).ensureMutable();
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    bxgm1 = bxgm0;
                    goto label_288;
                }
                try {
                label_70:
                    ((bwld)bwlb0.b_message).f = hfvv.a;
                    v2 = 0;
                }
                catch(Throwable throwable0) {
                    bxgm1 = bxgm0;
                    goto label_287;
                }
                while(v2 < 5) {
                    try {
                        bwlc bwlc0 = (bwlc)sparseArray0.get(v2);
                        if(bwlc0 == null) {
                            DocumentSection documentSection0 = bxfs.a[v2];
                            bwlo bwlo0 = bwur.b(documentSection0.d);
                            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwlo0).jf(5, null);
                            hftp1.X(((ProtoLiteMessage)bwlo0));
                            bwlf bwlf0 = (bwlf)hftp1;
                            int v3 = documentSection0.e;
                            if(v3 != DocumentSection.a) {
                                if(!bwlf0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)bwlf0).ensureMutable();
                                }
                                ((bwlo)bwlf0.b_message).c |= 0x200;
                                ((bwlo)bwlf0.b_message).o = v3;
                            }
                            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)bwlc.a).v_newBuilder();
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            bwlc bwlc1 = (bwlc)hftp2.b_message;
                            bwlo bwlo1 = (bwlo)((ProtoLiteBuilder)bwlf0).N_build();
                            bwlo1.getClass();
                            bwlc1.e = bwlo1;
                            bwlc1.b |= 0x20;
                            if(!hftp2.b_message.isImmutable()) {
                                hftp2.ensureMutable();
                            }
                            bwlc bwlc2 = (bwlc)hftp2.b_message;
                            bwlc2.b |= 1;
                            bwlc2.c = v2;
                            bwlb0.k(hftp2);
                        }
                        else {
                            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)bwlc0).jf(5, null);
                            hftp3.X(((ProtoLiteMessage)bwlc0));
                            if(!hftp3.b_message.isImmutable()) {
                                hftp3.ensureMutable();
                            }
                            bwlc bwlc3 = (bwlc)hftp3.b_message;
                            bwlc3.b |= 1;
                            bwlc3.c = v2;
                            bwlb0.k(hftp3);
                        }
                    }
                    catch(Throwable throwable1) {
                        throwable2 = throwable1;
                        bxgm1 = bxgm0;
                        goto label_288;
                    }
                    ++v2;
                }
                try {
                    bwld0 = (bwld)((ProtoLiteBuilder)bwlb0).N_build();
                    if(false) {
                        goto label_64;
                    }
                    else {
                        goto label_128;
                    }
                    goto label_114;
                }
                catch(Throwable throwable0) {
                    bxgm1 = bxgm0;
                    goto label_287;
                }
                goto label_128;
                try {
                label_114:
                    Object object0 = iterator0.next();
                    bwlc bwlc4 = (bwlc)object0;
                    String s1 = (bwlc4.e == null ? bwlo.b : bwlc4.e).d;
                    int v4 = 0;
                    while(true) {
                        String[] arr_s = bxfs.b;
                        if(v4 < 5) {
                            if(arr_s[v4].equals(s1)) {
                                break;
                            }
                            else {
                                ++v4;
                                continue;
                            }
                        }
                        v4 = -1;
                        break;
                    }
                    if(v4 == -1) {
                        goto label_128;
                    }
                    else {
                        sparseArray0.put(v4, bwlc4);
                        goto label_64;
                    }
                    goto label_263;
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    bxgm1 = bxgm0;
                    goto label_288;
                }
                try {
                    goto label_64;
                    try {
                    label_128:
                        bwud bwud0 = bxgw0.c;
                        long v5 = System.currentTimeMillis();
                        bwmx1 = bwqd0.a;
                        bwuc bwuc1 = bwmx1.l;
                        batl.s(bwuc1);
                        bwua bwua0 = bwuc1.d(bwud0);
                        if(bwua0.B(v5)) {
                            bwnq2 = bwmx1.a(bwud0, bwua0, false, new bwuw(bwur.d(bwud0.e, bwld0), 1, v5));
                            goto label_144;
                        }
                        goto label_263;
                    }
                    catch(bwvo | bwvr | SecurityException exception0) {
                        bwqd1 = bwqd0;
                        bwur2 = bwur0;
                        bxgm1 = bxgm0;
                        bxax1 = bxax0;
                        bwka2 = bwka1;
                        goto label_270;
                    }
                label_144:
                    bxgk0 = bwqd0.c(bwnq2);
                    bwur3 = bwmx1.e();
                    bwvl0 = new bwvl(bwnq2.f, bwnq2.d);
                    bwny0 = bwur3.f(bwvl0);
                    if(bwny0 == null) {
                        bwur2 = bwur0;
                        bxgm1 = bxgm0;
                        bxax1 = bxax0;
                        bxgk1 = bxgk0;
                        bwka2 = bwka1;
                    }
                    else if(bwur.D(bwnq2)) {
                        NativeIndex nativeIndex1 = bwmx1.m;
                        if(nativeIndex1 == null) {
                            goto label_207;
                        }
                        else {
                            bxgk2 = bxgk0;
                            v6 = NativeIndex.nativeGetCorpusDocumentsSize(nativeIndex1.b, bwnq2.c);
                            goto label_164;
                        }
                        goto label_217;
                    }
                    else {
                        goto label_222;
                    }
                    goto label_227;
                }
                catch(Throwable throwable0) {
                    bxgm1 = bxgm0;
                    goto label_287;
                }
            label_164:
                if(v6 >= 0L) {
                    try {
                        bxax1 = bxax0;
                        long v7 = System.currentTimeMillis();
                        bxgm1 = bxgm0;
                        bwur2 = bwur0;
                        huau huau0 = huau.a;
                        if(v7 - (bwny0.g == null ? bwnv.a : bwny0.g).c > huau0.c().b()) {
                            ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)bwnv.a).v_newBuilder();
                            bwnv bwnv0 = bwnv.a;
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ProtoLiteMessage hftv0 = hftp4.b_message;
                            huau1 = huau0;
                            ((bwnv)hftv0).b |= 1;
                            ((bwnv)hftv0).c = v7;
                            if(!hftv0.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            bwnv bwnv1 = (bwnv)hftp4.b_message;
                            bwnv1.b |= 2;
                            bwnv1.d = v6;
                            bwnv bwnv2 = (bwnv)hftp4.N_build();
                            ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny0).jf(5, null);
                            hftp5.X(((ProtoLiteMessage)bwny0));
                            bwnt bwnt0 = (bwnt)hftp5;
                            if(!bwnt0.b_message.isImmutable()) {
                                ((ProtoLiteBuilder)bwnt0).ensureMutable();
                            }
                            bwny bwny1 = (bwny)bwnt0.b_message;
                            bwnv2.getClass();
                            bwny1.g = bwnv2;
                            bwny1.b |= 0x20;
                            bwny0 = (bwny)((ProtoLiteBuilder)bwnt0).N_build();
                            bwur3.A(bwvl0, null, null, (bwny0.g == null ? bwnv0 : bwny0.g));
                        }
                        else {
                            huau1 = huau0;
                        }
                        if(v6 - (bwny0.g == null ? bwnv.a : bwny0.g).d >= huau1.c().c()) {
                            bwne.t("Too many pushes from %s", bwnq2.f);
                            goto label_217;
                        label_201:
                            bwur2 = bwur0;
                            bxgm1 = bxgm0;
                            bxax1 = bxax0;
                        }
                        bwka2 = bwka1;
                        bxgk1 = bxgk2;
                        goto label_227;
                    }
                    catch(Throwable throwable0) {
                        goto label_287;
                    }
                }
                else {
                    goto label_201;
                }
                bwka2 = bwka1;
                bxgk1 = bxgk2;
                goto label_227;
                try {
                label_207:
                    bwne.s("Failed to get native index in slurp task");
                }
                catch(Throwable throwable1) {
                    throwable2 = throwable1;
                    bxgm1 = bxgm0;
                    goto label_288;
                }
                bwur2 = bwur0;
                bxgm1 = bxgm0;
                bxax1 = bxax0;
                bxgk2 = bxgk0;
                try {
                label_217:
                    ++bwka1.d;
                    bxgk2.b("push index rejected rate limit");
                    bwka1 = bwka1;
                    bxax0 = bxax1;
                    bxgm0 = bxgm1;
                    bwur0 = bwur2;
                    bwqd0 = this;
                    goto label_54;
                label_222:
                    bwur2 = bwur0;
                    bxgm1 = bxgm0;
                    bxax1 = bxax0;
                    bxgk1 = bxgk0;
                    bwka2 = bwka1;
                label_227:
                    ProtoLiteBuilder hftp6 = (ProtoLiteBuilder)((ProtoLiteMessage)bwld0).jf(5, null);
                    hftp6.X(((ProtoLiteMessage)bwld0));
                    bwlb bwlb1 = (bwlb)hftp6;
                    int v8 = bwnq2.c;
                    if(!bwlb1.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)bwlb1).ensureMutable();
                    }
                    bwld bwld1 = (bwld)bwlb1.b_message;
                    bwld1.b |= 1;
                    bwld1.c = v8;
                    bwld bwld2 = (bwld)((ProtoLiteBuilder)bwlb1).N_build();
                    NativeIndex nativeIndex2 = bwmx1.m;
                    if(nativeIndex2 != null) {
                        gloj gloj0 = nativeIndex2.m(0L, bwld2, bwux.a());
                        ++bwka2.c;
                        if(gloj0 != null) {
                            bxgk1.b("push index " + NativeIndex.t((glte.b(gloj0.d) == null ? glte.a : glte.b(gloj0.d))));
                        }
                    }
                    NativeIndex nativeIndex3 = bwmx1.m;
                    if(nativeIndex3 != null) {
                        bwkb.a(nativeIndex3, bxgw0.a(bwnq2), bxgk1, bwka2);
                        if((bwqb.b(bwpx0.i) == null ? bwqb.a : bwqb.b(bwpx0.i)) == bwqb.f) {
                            if(huca.a.b().a()) {
                                try {
                                    bwqd1 = this;
                                    bwqd1.d(bxgw0, bxgk1, bwka2);
                                }
                                catch(IllegalStateException illegalStateException0) {
                                    bwne.g("Error when adding usage for 3p Corpus %s", illegalStateException0.getMessage());
                                }
                            }
                            else {
                                bwqd1 = this;
                                bwqd1.d(bxgw0, bxgk1, bwka2);
                            }
                            goto label_280;
                        }
                    }
                    bwka1 = bwka2;
                    bxax0 = bxax1;
                    bxgm0 = bxgm1;
                    bwur0 = bwur2;
                    bwqd0 = this;
                    goto label_54;
                    try {
                    label_263:
                        bwqd1 = bwqd0;
                        bwur2 = bwur0;
                        bxgm1 = bxgm0;
                        bxax1 = bxax0;
                        bwka2 = bwka1;
                        throw new bwvo("Could not find app.");
                    }
                    catch(bwvo | bwvr | SecurityException exception0) {
                    }
                label_270:
                    bwne.g("Implicit corpus from usage report failed: %s", exception0.getMessage());
                    goto label_280;
                label_272:
                    bwqd1 = bwqd0;
                    bwur2 = bwur0;
                    bxgm1 = bxgm0;
                    bxax1 = bxax0;
                    bwka2 = bwka1;
                    NativeIndex nativeIndex4 = bwqd1.a.m;
                    if(nativeIndex4 != null) {
                        bwkb.a(nativeIndex4, bxgw0.a(bwnq1), bwqd1.c(bwnq1), bwka2);
                    }
                label_280:
                    bwka1 = bwka2;
                    bwqd0 = bwqd1;
                    bxax0 = bxax1;
                    bxgm0 = bxgm1;
                    bwur0 = bwur2;
                    goto label_54;
                }
                catch(Throwable throwable0) {
                }
            label_287:
                throwable2 = throwable0;
                try {
                label_288:
                    bxgm1.close();
                }
                catch(Throwable throwable3) {
                    throwable2.addSuppressed(throwable3);
                }
                throw throwable2;
            }
            bwur bwur4 = bwur0;
            bxgm0.close();
            for(Object object1: bwqd0.d.entrySet()) {
                bwvl bwvl1 = (bwvl)((Map.Entry)object1).getKey();
                bxgk bxgk3 = (bxgk)((Map.Entry)object1).getValue();
                synchronized(bwur4.p()) {
                    bwny bwny2 = bwur4.g(bwvl1, null);
                    if(bwny2 == null) {
                        bwne.g("Cannot update counters for non-existent key: %s", bwvl1.c());
                    }
                    else if(bxgk3.c()) {
                        ProtoLiteBuilder hftp7 = (ProtoLiteBuilder)((ProtoLiteMessage)bwny2).jf(5, null);
                        hftp7.X(((ProtoLiteMessage)bwny2));
                        bwnt bwnt1 = (bwnt)hftp7;
                        if(!bwnt1.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)bwnt1).ensureMutable();
                        }
                        ((bwny)bwnt1.b_message).c = hfvv.a;
                        bwnt1.a(bxgk3.a(bwny2.c));
                        bwur4.x(bwvl1, ((bwny)((ProtoLiteBuilder)bwnt1).N_build()));
                        bwur4.g = true;
                    }
                    bwur4 = bwur4;
                }
            }
            bwmx bwmx2 = bwqd0.a;
            bwne.m("Usage reports ok %d, Failed Usage reports %d, indexed %d, rejected %d", new Object[]{((int)bwka1.a), ((int)bwka1.b), ((int)bwka1.c), ((int)bwka1.d)});
            if(bwka1.a > 0 || bwka1.c > 0 || bwka1.d > 0 || bwka1.b > 0) {
                ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)glqu.a).v_newBuilder();
                int v9 = bwka1.a;
                if(!hftp8.b_message.isImmutable()) {
                    hftp8.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp8.b_message;
                ((glqu)hftv1).b |= 1;
                ((glqu)hftv1).c = v9;
                int v10 = bwka1.b;
                if(!hftv1.isImmutable()) {
                    hftp8.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp8.b_message;
                ((glqu)hftv2).b |= 2;
                ((glqu)hftv2).d = v10;
                int v11 = bwka1.c;
                if(!hftv2.isImmutable()) {
                    hftp8.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp8.b_message;
                ((glqu)hftv3).b |= 4;
                ((glqu)hftv3).e = v11;
                int v12 = bwka1.d;
                if(!hftv3.isImmutable()) {
                    hftp8.ensureMutable();
                }
                bwts bwts1 = bwmx2.r;
                glqu glqu0 = (glqu)hftp8.b_message;
                glqu0.b |= 8;
                glqu0.f = v12;
                glqu glqu1 = (glqu)hftp8.N_build();
                long v13 = huax.a.g().t();
                if(bwts1.m(v13, false)) {
                    ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)glnz.a).v_newBuilder();
                    if(!hftp9.b_message.isImmutable()) {
                        hftp9.ensureMutable();
                    }
                    glnz glnz0 = (glnz)hftp9.b_message;
                    glqu1.getClass();
                    glnz0.D = glqu1;
                    glnz0.c |= 0x200;
                    if(huae.g()) {
                        bwts1.t(hftp9);
                        bwts1.a.d(cdef.dK, 16002, hftp9);
                    }
                    else {
                        bwts1.s(16002, hftp9, v13);
                    }
                }
            }
            if(bwka1.c > 0) {
                if(!bwqd0.c) {
                    Context context1 = bwmx2.b;
                    if(!bxax0.C()) {
                        bwkf.b(context1);
                        Object object3 = bxax0.h;
                        synchronized(object3) {
                            bxax0.c.edit().putBoolean("app-history-upload-pending", true).apply();
                        }
                        return null;
                    }
                }
                else if(bwmx2.l != null) {
                    bwkf bwkf0 = new bwkf();
                    bwmx2.c.h(bwkf0);
                    return null;
                }
            }
        }
        return null;
    }

    private final bxgk c(bwnq bwnq0) {
        bwvl bwvl0 = new bwvl(bwnq0.f, bwnq0.d);
        Map map0 = this.d;
        bxgk bxgk0 = (bxgk)map0.get(bwvl0);
        if(bxgk0 == null) {
            bxgk0 = new bxgk();
            map0.put(bwvl0, bxgk0);
        }
        return bxgk0;
    }

    private final void d(bxgw bxgw0, bxgk bxgk0, bwka bwka0) {
        SQLiteDatabase sQLiteDatabase0;
        gged_interceptors gged0;
        bwmx bwmx0 = this.a;
        NativeIndex nativeIndex0 = bwmx0.m;
        if(nativeIndex0 != null) {
            bwud bwud0 = bxgw0.c;
            Context context0 = bwmx0.b;
            String s = bwud0.e;
            bwqt bwqt0 = bwqt.c(context0, s);
            if(bwqt0 == null) {
                bwne.b("3P AppIndexing disabled for package %s", s);
                gged0 = ggna.a;
            }
            else {
                bwtc bwtc0 = bwtc.d(context0);
                try {
                    sQLiteDatabase0 = bwqt0.getReadableDatabase();
                }
                catch(SQLiteException unused_ex) {
                    gged0 = new ArrayList();
                    goto label_27;
                }
                String s1 = bwud0.e;
                Set set0 = bwqs.a(sQLiteDatabase0, s1, bwtc0);
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: set0) {
                    bwnq bwnq0 = bwmx0.O(bwud0, ((bwsa)object0).c(), s1);
                    if(bwnq0 != null) {
                        arrayList0.add(bwnq0);
                    }
                }
                gged0 = arrayList0;
            }
        label_27:
            Iterator iterator1 = gged0.iterator();
            while(iterator1.hasNext()) {
                String s2 = null;
                Object object1 = iterator1.next();
                bwnq bwnq1 = (bwnq)object1;
                bwpx bwpx0 = bxgw0.a;
                for(Object object2: (bwpx0.j == null ? bwld.a : bwpx0.j).f) {
                    bwlc bwlc0 = (bwlc)object2;
                    if("intent_data".equals((bwlc0.e == null ? bwlo.b : bwlc0.e).d)) {
                        s2 = bwlc0.d.toStringUtf8();
                        break;
                    }
                }
                if(s2 != null) {
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)bwpx0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)bwpx0));
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((bwpx)hftv0).b |= 16;
                    ((bwpx)hftv0).g = s2;
                    String s3 = bwnq1.d;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bwpx bwpx1 = (bwpx)hftp0.b_message;
                    s3.getClass();
                    bwpx1.b |= 8;
                    bwpx1.f = s3;
                    bwld bwld0 = bwpx0.j == null ? bwld.a : bwpx0.j;
                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)bwld0).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)bwld0));
                    bwlb bwlb0 = (bwlb)hftp1;
                    if(!bwlb0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)bwlb0).ensureMutable();
                    }
                    bwld bwld1 = (bwld)bwlb0.b_message;
                    bwld1.b |= 2;
                    bwld1.d = s2;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    bwpx bwpx2 = (bwpx)hftp0.b_message;
                    bwld bwld2 = (bwld)((ProtoLiteBuilder)bwlb0).N_build();
                    bwld2.getClass();
                    bwpx2.j = bwld2;
                    bwpx2.b |= 0x80;
                    bwpx0 = (bwpx)hftp0.N_build();
                }
                bwkb.a(nativeIndex0, bxgy.a(bwnq1, bwpx0), bxgk0, bwka0);
            }
        }
    }
}

