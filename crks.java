import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.internal.EventParams;
import j..util.Objects;
import java.util.EnumMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

final class crks implements Runnable {
    final crmh a;
    final crkt b;

    public crks(crkt crkt0, crmh crmh0) {
        this.a = crmh0;
        Objects.requireNonNull(crkt0);
        this.b = crkt0;
        super();
    }

    @Override
    public final void run() {
        boolean z5;
        boolean z2;
        crmb crmb1;
        crkt crkt0 = this.b;
        crkt0.s();
        crcu crcu0 = crkt0.d;
        crdl crdl0 = new crdl(crkt0);
        crdl0.o();
        crkt0.o = crdl0;
        InitializationParams initializationParams0 = this.a.d;
        crin crin0 = new crin(crkt0, this.a.c, (initializationParams0 == null ? 0L : initializationParams0.a));
        crin0.b();
        crkt0.p = crin0;
        criq criq0 = new criq(crkt0);
        criq0.b();
        crkt0.m = criq0;
        croz croz0 = new croz(crkt0);
        croz0.b();
        crkt0.n = croz0;
        crkt0.h.p();
        crkt0.e.p();
        crkt0.p.c();
        crno crno0 = new crno(crkt0);
        crno0.b();
        crkt0.q = crno0;
        crkt0.q.c();
        crkt0.aJ().i.b("App measurement initialized, version", Long.valueOf(crcu0.i()));
        boolean z = crkt0.c.a;
        if(!z) {
            crkt0.aJ().i.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            String s = crin0.u();
            if(crkt0.p().Z(s, null)) {
                crkt0.aJ().i.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            }
            else {
                crkt0.aJ().i.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + s);
            }
        }
        crkt0.aJ().j.a("Debug-level message logging enabled");
        AtomicInteger atomicInteger0 = crkt0.v;
        if(crkt0.t != atomicInteger0.get()) {
            crkt0.aJ().c.c("Not all components initialized", Integer.valueOf(crkt0.t), Integer.valueOf(atomicInteger0.get()));
        }
        crkt0.r = true;
        crkt0.s();
        if(z) {
            z2 = true;
        }
        else {
            boolean z1 = crkt0.l().r() == crta.b;
            hvhs.c();
            if(crcu0.t(crif.aD) && crkt0.p().ab()) {
            label_44:
                crqx crqx0 = crkt0.p();
                crqx0.n();
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter0.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                jwe.b(crqx0.aj(), new crcf(crqx0.y), intentFilter0, 2);
                crqx0.aJ().j.a("Registered app receiver");
                if(z1) {
                    crkt0.l().s(((Long)crif.B.a()).longValue());
                }
            }
            else if(z1) {
                z1 = true;
                goto label_44;
            }
            crmb crmb0 = crkt0.g().f();
            int v = crmb0.c;
            crly crly0 = crcu0.l("google_analytics_default_allow_ad_storage", false);
            crly crly1 = crcu0.l("google_analytics_default_allow_analytics_storage", false);
            crly crly2 = crly.a;
            if((crly0 != crly2 || crly1 != crly2) && crkt0.g().k(-10)) {
                EnumMap enumMap0 = new EnumMap(crma.class);
                enumMap0.put(crma.a, crly0);
                enumMap0.put(crma.b, crly1);
                crmb1 = new crmb(enumMap0, -10);
            }
            else {
                if(!TextUtils.isEmpty(crkt0.d().v()) && (v == 0 || v == 30 || (v == 10 || v == 40))) {
                    crkt0.j().D(new crmb(-10), false);
                }
                crmb1 = null;
            }
            if(crmb1 != null) {
                crkt0.j().D(crmb1, true);
                crmb0 = crmb1;
            }
            crkt0.j().C(crmb0);
            int v1 = crkt0.g().d().b;
            crly crly3 = crcu0.l("google_analytics_default_allow_ad_personalization_signals", true);
            if(crly3 != crly2) {
                crkt0.aJ().k.b("Default ad personalization consent from Manifest", crly3);
            }
            crly crly4 = crcu0.l("google_analytics_default_allow_ad_user_data", true);
            if(crly4 != crly2 && crmb.r(-10, v1)) {
                crni crni0 = crkt0.j();
                EnumMap enumMap1 = new EnumMap(crma.class);
                enumMap1.put(crma.c, crly4);
                crni0.B(new crdk(enumMap1, -10, null, null), true);
            }
            else if(!TextUtils.isEmpty(crkt0.d().v()) && (v1 == 0 || v1 == 30)) {
                crkt0.j().B(new crdk(-10), true);
            }
            crcu0.m();
            Boolean boolean0 = crcu0.o("google_analytics_tcf_data_enabled");
            if(boolean0 == null || boolean0.booleanValue()) {
                crkt0.aJ().j.a("TCF client enabled.");
                crni crni1 = crkt0.j();
                crni1.m();
                crni1.n();
                crni1.aJ().j.a("Register tcfPrefChangeListener.");
                if(crni1.j == null) {
                    crni1.k = new crmu(crni1, crni1.y);
                    crni1.j = new crmn(crni1);
                }
                crni1.ap().a().registerOnSharedPreferenceChangeListener(crni1.j);
                crkt0.j().t();
            }
            z2 = false;
        }
        if(crkt0.g().d.a() == 0L) {
            crkt0.aJ().k.b("Persisting first open", Long.valueOf(crkt0.w));
            crkt0.g().d.b(crkt0.w);
        }
        if(!z2) {
            crcg crcg0 = crkt0.j().g;
            if(crcg0.b() && crcg0.c()) {
                crcg0.a.g().v.b(null);
            }
        }
        if(crkt0.x()) {
            if(!z2 && !TextUtils.isEmpty(crkt0.d().v())) {
                crqx crqx1 = crkt0.p();
                String s1 = crkt0.d().v();
                crjx crjx0 = crkt0.g();
                crjx0.n();
                if(crqx1.af(s1, crjx0.b().getString("gmp_app_id", null))) {
                    crkt0.aJ().i.a("Rechecking which service to use due to a GMP App Id change");
                    crjx crjx1 = crkt0.g();
                    crjx1.n();
                    Boolean boolean1 = crjx1.g();
                    SharedPreferences.Editor sharedPreferences$Editor0 = crjx1.b().edit();
                    sharedPreferences$Editor0.clear();
                    sharedPreferences$Editor0.apply();
                    if(boolean1 != null) {
                        crjx1.i(boolean1);
                    }
                    criq criq1 = crkt0.e();
                    criq1.m();
                    criq1.n();
                    try {
                        SQLiteDatabase sQLiteDatabase0 = criq1.q();
                        if(sQLiteDatabase0 != null) {
                            int v2 = sQLiteDatabase0.delete("messages", null, null);
                            if(v2 > 0) {
                                criq1.aJ().k.b("Reset local analytics data. records", Integer.valueOf(v2));
                            }
                        }
                    }
                    catch(SQLiteException sQLiteException0) {
                        criq1.aJ().c.b("Error resetting local analytics data. error", sQLiteException0);
                    }
                    crkt0.n.s();
                    crkt0.n.r();
                    crkt0.g().d.b(crkt0.w);
                    crkt0.g().f.b(null);
                }
                crjx crjx2 = crkt0.g();
                String s2 = crkt0.d().v();
                crjx2.n();
                SharedPreferences.Editor sharedPreferences$Editor1 = crjx2.b().edit();
                sharedPreferences$Editor1.putString("gmp_app_id", s2);
                sharedPreferences$Editor1.apply();
            }
            boolean z3 = crkt0.c.a;
            if(!z3 && !crkt0.g().f().q()) {
                crkt0.g().f.b(null);
            }
            crkt0.j().A(crkt0.g().f.a());
            if(!z3) {
                crqx crqx2 = crkt0.p();
                try {
                    crqx2.aj().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                }
                catch(ClassNotFoundException unused_ex) {
                    if(!TextUtils.isEmpty(crkt0.g().u.a())) {
                        crkt0.aJ().f.a("Remote config removed with active feature rollouts");
                        crkt0.g().u.b(null);
                    }
                }
                if(!TextUtils.isEmpty(crkt0.d().v())) {
                    int v3 = crkt0.v();
                    SharedPreferences sharedPreferences0 = crkt0.g().b;
                    if((sharedPreferences0 == null || !sharedPreferences0.contains("deferred_analytics_collection")) && !crkt0.d.x()) {
                        crjx crjx3 = crkt0.g();
                        crjx3.n();
                        crjx3.aJ().k.b("App measurement setting deferred collection", Boolean.valueOf(((boolean)(v3 ^ 1))));
                        SharedPreferences.Editor sharedPreferences$Editor2 = crjx3.b().edit();
                        sharedPreferences$Editor2.putBoolean("deferred_analytics_collection", ((boolean)(v3 ^ 1)));
                        sharedPreferences$Editor2.apply();
                    }
                    if(v3) {
                        crkt0.j().r();
                    }
                    crkt0.o().c.a();
                    crkt0.n().u(new AtomicReference());
                    croz croz1 = crkt0.n();
                    Bundle bundle0 = crkt0.g().x.a();
                    croz1.n();
                    croz1.a();
                    EventParams eventParams0 = new EventParams(bundle0);
                    boolean z4 = croz1.G();
                    if(croz1.am().t(crif.aL) && z4) {
                        criq criq2 = croz1.g();
                        byte[] arr_b = criq2.aq().ag(eventParams0);
                        if(arr_b == null) {
                            criq2.aJ().d.a("Null default event parameters; not writing to database");
                            z5 = false;
                        }
                        else if(arr_b.length > 0x20000) {
                            criq2.aJ().d.a("Default event parameters too long for local database. Sending directly to service");
                            z5 = false;
                        }
                        else if(criq2.t(4, arr_b)) {
                            z5 = true;
                        }
                        else {
                            z5 = false;
                        }
                    }
                    else {
                        z5 = false;
                    }
                    croz1.x(new croj(croz1, z4, croz1.q(false), z5, eventParams0, bundle0));
                }
            }
        }
        else if(crkt0.v()) {
            if(!crkt0.p().Y("android.permission.INTERNET")) {
                crkt0.aJ().c.a("App is missing INTERNET permission");
            }
            if(!crkt0.p().Y("android.permission.ACCESS_NETWORK_STATE")) {
                crkt0.aJ().c.a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if(!crkt0.c.a) {
                Context context0 = crkt0.a;
                if(!bbsr.b(context0).i() && !crkt0.d.y()) {
                    if(!crqx.ae(context0)) {
                        crkt0.aJ().c.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if(!crqx.au(context0)) {
                        crkt0.aJ().c.a("AppMeasurementService not registered/enabled");
                    }
                }
            }
            crkt0.aJ().c.a("Uploading is not possible. App measurement disabled");
        }
        if(!crkt0.c.a) {
            hvhs.c();
            if(crkt0.d.t(crif.aD) && crkt0.p().ab()) {
                long v4 = Math.max(500L, ((long)(((int)(((Integer)crif.aq.a()))))) * 1000L + ((long)new Random().nextInt(5000)) - SystemClock.elapsedRealtime());
                if(v4 > 500L) {
                    crkt0.aJ().k.b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(v4));
                }
                crni crni2 = crkt0.j();
                crni2.n();
                if(crni2.e == null) {
                    crni2.e = new crmp(crni2, crni2.y);
                }
                crni2.e.c(v4);
            }
        }
        crkt0.g().n.a(true);
    }
}

