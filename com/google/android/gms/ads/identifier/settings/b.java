package com.google.android.gms.ads.identifier.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.text.TextUtils;
import android.util.Log;
import batl;
import bbsr;
import cjmf;
import com.google.android.gms.ads.identifier.log.a;
import elfz;
import honl;
import hono;
import hopj;
import hosu;
import hosz;
import hotp;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import jeb.synthetic.FIN;

public final class b {
    protected static final String a;
    public final Object b;
    private static b c;
    private static final AtomicLong d;
    private static final Executor e;
    private final Context f;
    private final u g;

    static {
        b.a = new UUID(0L, 0L).toString();
        b.c = null;
        b.d = new AtomicLong(-1L);
        b.e = Executors.newCachedThreadPool();
    }

    private b(Context context0) {
        this.b = new Object();
        Context context1 = context0.getApplicationContext();
        if(context1 != null) {
            context0 = context1;
        }
        this.f = context0;
        this.g = u.a(context0);
    }

    public final SharedPreferences a() {
        return this.f.getSharedPreferences("per_app_lat", 4);
    }

    final SharedPreferences b() {
        return this.f.getSharedPreferences("adid_settings", 4);
    }

    public static b c(Context context0) {
        synchronized(b.class) {
            if(b.c == null) {
                b.c = new b(context0);
            }
        }
        return b.c;
    }

    public static String d() {
        String s = UUID.randomUUID().toString();
        return s.substring(0, s.length() - 12) + "10ca1ad1abe1";
    }

    public final String e() {
        int v1;
        String s1;
        String s;
        boolean z;
        synchronized(this.b) {
            z = this.m();
            s = z ? b.d() : "";
            this.j();
            s1 = "";
            if(hosu.j() && hosu.a.e().O()) {
                try {
                    s1 = elfz.b(this.g.e()).toString();
                    if(TextUtils.isEmpty(s1)) {
                        throw new IOException("Generated Id is null");
                    }
                }
                catch(IOException | GeneralSecurityException exception0) {
                    d.c(this.f, "generateNewIdError", exception0);
                    s1 = "";
                }
            }
            v1 = TextUtils.isEmpty(s1);
            if(v1 != 0) {
                s1 = UUID.randomUUID().toString();
            }
            if(hosu.a.e().z()) {
                q.a(this.f).b();
                q.a(this.f).c();
            }
            int v2 = this.b().getInt("adid_reset_count", 0) + 1;
            this.b().edit().putInt("adid_reset_count", v2).apply();
        }
        return this.i(z, ((boolean)(v1 ^ 1)), s1, s);
    }

    public final String f(int v) {
        boolean z;
        if(((long)Build.VERSION.SDK_INT) >= hosu.c() && this.n(v)) {
            if(hosu.g()) {
                this.j();
            }
            if(!hosu.a.e().I()) {
                goto label_4;
            }
            return b.a;
        }
    label_4:
        Context context0 = this.f;
        String[] arr_s = bbsr.b(context0).k(Binder.getCallingUid());
        if(arr_s != null && arr_s.length == 1) {
            String s = arr_s[0];
            if(com.google.android.gms.ads.identifier.util.d.a(s) || com.google.android.gms.ads.identifier.util.d.b(s)) {
                z = this.q(s, "android.permission.ACCESS_PRIVILEGED_AD_ID");
            label_13:
                if(!z) {
                    goto label_14;
                }
            }
            else if(com.google.android.gms.ads.identifier.util.d.c(s) && hotp.e()) {
                z = this.q(s, "android.permission.ACCESS_PRIVILEGED_AD_ID_COMPAT");
                goto label_13;
            }
            else {
                goto label_14;
            }
        }
        else {
        label_14:
            if(v != -100) {
                String[] arr_s1 = bbsr.b(context0).k(v);
                if(arr_s1 == null) {
                    Log.w("AdvertisingIdSettings", "Invalid caller uid. Permission check failed");
                    goto label_28;
                }
                else {
                    int v1 = 0;
                    while(v1 < arr_s1.length) {
                        if(36L < hosu.b()) {
                            ++v1;
                            v = v;
                            continue;
                        }
                        else if(cjmf.c(this.f, "com.google.android.gms.permission.AD_ID", -1, v, arr_s1[v1], null) == -1) {
                            if(hosu.a.e().u()) {
                                Log.w("AdvertisingIdSettings", "Package " + arr_s1[v1] + " failed Ad Id permission check. Apps that target Android SDK " + hosu.b() + " or higher should declare com.google.android.gms.permission.AD_ID in the app manifest to access Ad Id.");
                            }
                        label_28:
                            if(((long)Build.VERSION.SDK_INT) >= hosu.a.e().a() && hosu.a.e().t()) {
                                return b.a;
                            }
                        }
                        else {
                            ++v1;
                            v = v;
                            continue;
                        }
                        break;
                    }
                }
            }
        }
        String s1 = this.m() ? this.g() : this.h();
        return s1.isEmpty() ? this.e() : s1;
    }

    public final String g() {
        return this.b().getString("fake_adid_key", "");
    }

    public final String h() {
        return this.b().getString("adid_key", "");
    }

    public final String i(boolean z, boolean z1, String s, String s1) {
        if(z) {
            batl.b(((boolean)(s1.isEmpty() ^ 1)));
        }
        else {
            batl.b(s1.isEmpty());
        }
        this.b().edit().putBoolean("enable_debug_logging", z).putBoolean("using_cert", z1).putString("adid_key", s).putString("fake_adid_key", s1).apply();
        this.k();
        return z ? s1 : s;
    }

    public final void j() {
        synchronized(this.b) {
            this.b().edit().remove("adid_key").remove("fake_adid_key").apply();
            this.g.c();
        }
    }

    public final void k() {
        com.google.android.gms.ads.identifier.util.d d0 = new com.google.android.gms.ads.identifier.util.d();
        a a0 = new a();
        Context context0 = this.f;
        if(honl.c()) {
            com.google.android.gms.ads.identifier.util.a a1 = new com.google.android.gms.ads.identifier.util.a(d0, context0, this.f(-100), this.n(-100), b.e, a0);
            b.e.execute(a1);
        }
        else {
            Log.v("AdvertisingIdSettings", "The feature flag is not enabled. Not updating Adservices Ad ID.");
        }
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(context0, "com.google.android.gms.ads.identifier.service.AdvertisingIdNotificationService"));
        long v = System.currentTimeMillis();
        long v1 = b.d.getAndSet(v);
        intent0.putExtra("time_since_last_update", (v1 == -1L ? -1L : v - v1));
        context0.startService(intent0);
    }

    public final boolean l() {
        synchronized(this.b) {
            if(!this.b().contains("enable_limit_ad_tracking")) {
                this.p(false, 1);
            }
        }
        return this.b().getBoolean("enable_limit_ad_tracking", false);
    }

    public final boolean m() {
        if(hopj.c()) {
            try {
                if(Settings.Global.getInt(this.f.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    return this.b().getBoolean("enable_debug_logging", false);
                }
            }
            catch(Exception exception0) {
                Log.w("AdvertisingIdSettings", "Fail to determine debug setting.", exception0);
            }
            return false;
        }
        return false;
    }

    public final boolean n(int v) {
        boolean z;
        Object object0 = this.b;
        synchronized(object0) {
            if(this.l()) {
                FIN.finallyExec$NT(v1);
                return true;
            }
            if(!hosz.c()) {
                FIN.finallyExec$NT(v1);
                return false;
            }
            synchronized(object0) {
                z = this.a().getBoolean(String.valueOf(v), false);
            }
        }
        return z;
    }

    public final boolean o() {
        return this.b().getBoolean("using_cert", false);
    }

    public final void p(boolean z, int v) {
        synchronized(this.b) {
            if(((long)Build.VERSION.SDK_INT) >= hosu.c() && hosu.g() && z) {
                this.j();
            }
            this.b().edit().putBoolean("enable_limit_ad_tracking", z).apply();
            if(z && hono.c()) {
                this.b().edit().putInt("enable_limit_ad_tracking_reason", v - 1).apply();
            }
            this.k();
        }
    }

    private final boolean q(String s, String s1) {
        int v = Binder.getCallingUid();
        return cjmf.c(this.f, s1, -1, v, s, null) == 0;
    }
}

