import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.ipa.AppContextProvider;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class cajs {
    public static final bboh a;
    public final Context b;
    public final gopj c;
    public final caju d;
    public final PackageManager e;
    private static cajs f;
    private static final cajz g;

    static {
        cajs.a = bboh.b("GmscoreIpa", bbcu.ee);
        cajs.g = new cajz();
    }

    public cajs(Context context0, gopj gopj0, caju caju0, PackageManager packageManager0) {
        this.b = context0.getApplicationContext();
        this.c = gopj0;
        this.d = caju0;
        this.e = packageManager0;
    }

    // Detected as a lambda impl.
    public final void a() {
        Set set2;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).b = 4;
        long v = SystemClock.elapsedRealtime();
        ekyx ekyx0 = new ekyx();
        ekyx0.a = "IpaAppsCorpus";
        ekyy ekyy0 = new ekyy(ekyx0);
        Context context0 = this.b;
        Set set0 = cajt.c(new elfw(context0, ekyy0));
        if(set0 == null) {
            if(huhz.a.h().E() && this.d.a().isEmpty()) {
                set0 = ggnj.a;
                goto label_19;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisx)hftp0.b_message).i = 2;
            cakj.a().b(((gisx)hftp0.N_build()));
            return;
        }
    label_19:
        gged_interceptors gged0 = cajt.e(this.e);
        if(gged0 == null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gisx)hftp0.b_message).i = 2;
            cakj.a().b(((gisx)hftp0.N_build()));
            cakj.a().c(30);
            return;
        }
        HashSet hashSet0 = new HashSet();
        HashMap hashMap0 = new HashMap();
        for(int v1 = 0; v1 < ((ggna)gged0).c; ++v1) {
            cajj cajj0 = (cajj)gged0.get(v1);
            hashMap0.put(cajj0.d, cajj0);
            hashSet0.add(cajj0.c);
        }
        Set set1 = hashMap0.keySet();
        long v2 = context0.getSharedPreferences("AppsIndexerSharedPrefs", 0).getLong("AppsIndexerAppsRefreshed", 0L);
        if(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(huhz.a.h().g()) >= v2) {
            context0.getSharedPreferences("AppsIndexerSharedPrefs", 0).edit().putLong("AppsIndexerAppsRefreshed", System.currentTimeMillis()).apply();
            set2 = set1;
        }
        else {
            set2 = ggog.d(set1, set0);
        }
        ggoe ggoe0 = ggog.d(set0, set1);
        ggfp ggfp0 = ggfp.G(set2);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ggfp0) {
            cajj cajj1 = (cajj)hashMap0.get(((String)object0));
            if(cajj1 != null) {
                gops gops0 = cajs.d(cajj1);
                if(gops0 != null) {
                    arrayList0.add(gops0);
                }
            }
        }
        int v3 = arrayList0.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gisx)hftv0).c = v3;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).k = hfvv.a;
        if(!arrayList0.isEmpty()) {
            evql evql0 = this.c.g(((gops[])arrayList0.toArray(new gops[arrayList0.size()])));
            evql0.A(new cajr(0x1F, ((gisx)hftp0.N_build()), v));
            evql0.b(new cajq(((gisx)hftp0.N_build()), v));
        }
        ProtoLiteBuilder hftp1 = hftp0.M_clone();
        int v4 = ggoe0.size();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gisx)hftp1.b_message).e = v4;
        gisx gisx0 = (gisx)hftp1.N_build();
        if(!ggoe0.isEmpty()) {
            evql evql1 = this.c.e(((String[])ggoe0.toArray(new String[ggoe0.size()])));
            evql1.A(new cajr(0x20, gisx0, v));
            evql1.b(new cajq(gisx0, v));
        }
        this.d.b(hashSet0);
    }

    // Detected as a lambda impl.
    public final void b() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisx.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).b = 3;
        long v = SystemClock.elapsedRealtime();
        gged_interceptors gged0 = cajt.e(this.e);
        if(gged0 == null) {
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(int v1 = 0; v1 < ((ggna)gged0).c; ++v1) {
            cajj cajj0 = (cajj)gged0.get(v1);
            if(cajj0.b()) {
                arrayList1.add(cajj0.c);
            }
            gops gops0 = cajs.d(cajj0);
            if(gops0 != null) {
                arrayList0.add(gops0);
            }
        }
        int v2 = arrayList0.size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gisx)hftp0.b_message).c = v2;
        evql evql0 = this.c.g(((gops[])arrayList0.toArray(new gops[arrayList0.size()])));
        evql0.b(new cajq(((gisx)hftp0.N_build()), v));
        evql0.A(new cajr(0x1F, ((gisx)hftp0.N_build()), v));
        this.d.b(arrayList1);
    }

    public static cajs c() {
        synchronized(cajs.class) {
            Context context0 = AppContextProvider.a();
            if(!huhz.j()) {
                cajs.f = null;
                gopj.b(context0).f(new String[]{"MobileApplication"});
                return cajs.f;
            }
            if(cajs.f == null) {
                cajs cajs0 = new cajs(context0, gopj.b(context0), new caju(context0), context0.getPackageManager());
                cajs.f = cajs0;
                Context context1 = cajs0.b;
                SharedPreferences sharedPreferences0 = context1.getSharedPreferences("AppsIndexerSharedPrefs", 0);
                int v1 = sharedPreferences0.getInt("Version", 0);
                if(v1 != 1) {
                    sharedPreferences0.edit().putInt("Version", 1).commit();
                    if(v1 != 1) {
                        cakk.a().b(() -> {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisx.a).v_newBuilder();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gisx)hftp0.b_message).b = 3;
                            long v = SystemClock.elapsedRealtime();
                            gged_interceptors gged0 = cajt.e(cajs0.e);
                            if(gged0 == null) {
                                return;
                            }
                            ArrayList arrayList0 = new ArrayList();
                            ArrayList arrayList1 = new ArrayList();
                            for(int v1 = 0; v1 < ((ggna)gged0).c; ++v1) {
                                cajj cajj0 = (cajj)gged0.get(v1);
                                if(cajj0.b()) {
                                    arrayList1.add(cajj0.c);
                                }
                                gops gops0 = cajs.d(cajj0);
                                if(gops0 != null) {
                                    arrayList0.add(gops0);
                                }
                            }
                            int v2 = arrayList0.size();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gisx)hftp0.b_message).c = v2;
                            evql evql0 = cajs0.c.g(((gops[])arrayList0.toArray(new gops[arrayList0.size()])));
                            evql0.b(new cajq(((gisx)hftp0.N_build()), v));
                            evql0.A(new cajr(0x1F, ((gisx)hftp0.N_build()), v));
                            cajs0.d.b(arrayList1);
                        });
                    }
                }
                SharedPreferences sharedPreferences1 = context1.getSharedPreferences("AppsIndexerSharedPrefs", 0);
                String s = sharedPreferences1.getString("CurrentOsBuildId", null);
                if(s == null || !Build.ID.equals(s)) {
                    sharedPreferences1.edit().putString("CurrentOsBuildId", Build.ID).apply();
                    cakk.a().b(() -> {
                        Set set2;
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gisx.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gisx)hftp0.b_message).b = 4;
                        long v = SystemClock.elapsedRealtime();
                        ekyx ekyx0 = new ekyx();
                        ekyx0.a = "IpaAppsCorpus";
                        ekyy ekyy0 = new ekyy(ekyx0);
                        Context context0 = cajs0.b;
                        Set set0 = cajt.c(new elfw(context0, ekyy0));
                        if(set0 == null) {
                            if(huhz.a.h().E() && cajs0.d.a().isEmpty()) {
                                set0 = ggnj.a;
                                goto label_19;
                            }
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gisx)hftp0.b_message).i = 2;
                            cakj.a().b(((gisx)hftp0.N_build()));
                            return;
                        }
                    label_19:
                        gged_interceptors gged0 = cajt.e(cajs0.e);
                        if(gged0 == null) {
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((gisx)hftp0.b_message).i = 2;
                            cakj.a().b(((gisx)hftp0.N_build()));
                            cakj.a().c(30);
                            return;
                        }
                        HashSet hashSet0 = new HashSet();
                        HashMap hashMap0 = new HashMap();
                        for(int v1 = 0; v1 < ((ggna)gged0).c; ++v1) {
                            cajj cajj0 = (cajj)gged0.get(v1);
                            hashMap0.put(cajj0.d, cajj0);
                            hashSet0.add(cajj0.c);
                        }
                        Set set1 = hashMap0.keySet();
                        long v2 = context0.getSharedPreferences("AppsIndexerSharedPrefs", 0).getLong("AppsIndexerAppsRefreshed", 0L);
                        if(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(huhz.a.h().g()) >= v2) {
                            context0.getSharedPreferences("AppsIndexerSharedPrefs", 0).edit().putLong("AppsIndexerAppsRefreshed", System.currentTimeMillis()).apply();
                            set2 = set1;
                        }
                        else {
                            set2 = ggog.d(set1, set0);
                        }
                        ggoe ggoe0 = ggog.d(set0, set1);
                        ggfp ggfp0 = ggfp.G(set2);
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: ggfp0) {
                            cajj cajj1 = (cajj)hashMap0.get(((String)object0));
                            if(cajj1 != null) {
                                gops gops0 = cajs.d(cajj1);
                                if(gops0 != null) {
                                    arrayList0.add(gops0);
                                }
                            }
                        }
                        int v3 = arrayList0.size();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        ((gisx)hftv0).c = v3;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((gisx)hftp0.b_message).k = hfvv.a;
                        if(!arrayList0.isEmpty()) {
                            evql evql0 = cajs0.c.g(((gops[])arrayList0.toArray(new gops[arrayList0.size()])));
                            evql0.A(new cajr(0x1F, ((gisx)hftp0.N_build()), v));
                            evql0.b(new cajq(((gisx)hftp0.N_build()), v));
                        }
                        ProtoLiteBuilder hftp1 = hftp0.M_clone();
                        int v4 = ggoe0.size();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((gisx)hftp1.b_message).e = v4;
                        gisx gisx0 = (gisx)hftp1.N_build();
                        if(!ggoe0.isEmpty()) {
                            evql evql1 = cajs0.c.e(((String[])ggoe0.toArray(new String[ggoe0.size()])));
                            evql1.A(new cajr(0x20, gisx0, v));
                            evql1.b(new cajq(gisx0, v));
                        }
                        cajs0.d.b(hashSet0);
                    });
                }
            }
        }
        return cajs.f;
    }

    public static final gops d(cajj cajj0) {
        gopw gopw0 = new gopw("MobileApplication");
        if(cajj0.a()) {
            gopw0.k(cajj0.a);
            String s = cajj0.d;
            if(!TextUtils.isEmpty(s)) {
                if(s.length() > 0x100) {
                    cakj.a().c(36);
                    ((ggtj)cajs.a.j()).B("Can\'t build MobileApplication indexable: URL too long %s", s);
                    return null;
                }
                gopw0.j(s);
                String s1 = cajj0.b;
                if(!TextUtils.isEmpty(s1)) {
                    gopw0.d(s1);
                }
                Long long0 = cajj0.e;
                int v = 0;
                if(long0 != null) {
                    gopw0.f("dateModified", new long[]{new Date(((long)long0)).getTime()});
                }
                ggfp ggfp0 = cajj0.f;
                if(ggfp0 != null && !ggfp0.isEmpty()) {
                    String[] arr_s = (String[])ggfp0.toArray(new String[ggfp0.size()]);
                    batl.s(arr_s);
                    gopw0.h("alternateName", arr_s);
                }
                if(cajj0.b()) {
                    String s2 = cajj0.c.flattenToShortString();
                    batl.s(s2);
                    gopw0.h("identifier", new String[]{s2});
                    cajz cajz0 = cajs.g;
                    String s3 = cajj0.c.getPackageName();
                    MessageDigest messageDigest0 = cajz0.b;
                    int v1 = 5;
                    if(messageDigest0 != null) {
                        byte[] arr_b = messageDigest0.digest(s3.getBytes());
                        long v2 = 0L;
                        for(int v3 = 0; v3 < 8; ++v3) {
                            v2 = v2 << 8 | ((long)(arr_b[v3] & 0xFF));
                        }
                        while(v < 5) {
                            if(Arrays.binarySearch(cajz0.c[v], v2) >= 0) {
                                goto label_43;
                            }
                            ++v;
                        }
                    }
                    v = -1;
                label_43:
                    if(v != -1) {
                        v1 = v;
                    }
                    Long long1 = (long)cajz.a[v1];
                    gopr gopr0 = new gopr();
                    gopr0.b(long1.intValue());
                    gopr0.c();
                    gopw0.e(gopr0);
                    return gopw0.a();
                }
                gopr gopr1 = new gopr();
                gopr1.c();
                gopw0.e(gopr1);
                return gopw0.a();
            }
            ((ggtj)cajs.a.j()).x("Cant build MobileApplication indexable. URL missing");
            return null;
        }
        ((ggtj)cajs.a.j()).x("Cant build MobileApplication indexable. Name missing.");
        return null;
    }
}

