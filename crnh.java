import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import j..util.Objects;

final class crnh implements Application.ActivityLifecycleCallbacks {
    final crni a;

    public crnh(crni crni0) {
        Objects.requireNonNull(crni0);
        this.a = crni0;
        super();
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
        crnz crnz0;
        crnh crnh0;
        crkq crkq0;
        String s3;
        String s2;
        Uri uri1;
        crni crni0;
        ScionActivityInfo scionActivityInfo0 = ScionActivityInfo.a(activity0);
        try {
            crni0 = this.a;
            crni0.aJ().k.a("onActivityCreated");
            Intent intent0 = scionActivityInfo0.c;
            if(intent0 == null) {
                goto label_44;
            }
            else {
                Uri uri0 = intent0.getData();
                if(uri0 == null || !uri0.isHierarchical()) {
                    Bundle bundle1 = intent0.getExtras();
                    if(bundle1 == null) {
                        uri1 = null;
                    }
                    else {
                        String s = bundle1.getString("com.android.vending.referral_url");
                        uri1 = TextUtils.isEmpty(s) ? null : Uri.parse(s);
                    }
                }
                else {
                    uri1 = uri0;
                }
                if(uri1 != null && uri1.isHierarchical()) {
                    crni0.aq();
                    String s1 = intent0.getStringExtra("android.intent.extra.REFERRER_NAME");
                    s2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(s1) || "https://www.google.com".equals(s1) || "android-app://com.google.appcrawler".equals(s1) ? "gs" : "auto";
                    s3 = uri1.getQueryParameter("referrer");
                    crkq0 = crni0.aK();
                    crnh0 = this;
                    goto label_32;
                }
                else {
                    crnz0 = crni0.j();
                }
            }
            goto label_45;
        }
        catch(RuntimeException runtimeException0) {
            crnh0 = this;
            goto label_35;
        }
        catch(Throwable throwable0) {
            crnh0 = this;
            crnh0.a.j().v(scionActivityInfo0, bundle0);
            throw throwable0;
        }
        try {
            try {
            label_32:
                crkq0.f(new crng(crnh0, bundle0 == null, uri1, s2, s3));
                crnz0 = crnh0.a.j();
                goto label_45;
            }
            catch(RuntimeException runtimeException0) {
            }
        label_35:
            crnh0.a.aJ().c.b("Throwable caught in onActivityCreated", runtimeException0);
        }
        catch(Throwable throwable0) {
            crnh0.a.j().v(scionActivityInfo0, bundle0);
            throw throwable0;
        }
        crnz0 = crnh0.a.j();
        goto label_45;
    label_44:
        crnz0 = crni0.j();
    label_45:
        crnz0.v(scionActivityInfo0, bundle0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
        ScionActivityInfo scionActivityInfo0 = ScionActivityInfo.a(activity0);
        crnz crnz0 = this.a.j();
        synchronized(crnz0.j) {
            if(Objects.equals(crnz0.e, scionActivityInfo0)) {
                crnz0.e = null;
            }
        }
        if(!crnz0.am().w()) {
            return;
        }
        crnz0.d.remove(Integer.valueOf(scionActivityInfo0.a));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
        ScionActivityInfo scionActivityInfo0 = ScionActivityInfo.a(activity0);
        crnz crnz0 = this.a.j();
        synchronized(crnz0.j) {
            crnz0.i = false;
            crnz0.f = true;
        }
        long v = SystemClock.elapsedRealtime();
        if(crnz0.am().w()) {
            crns crns0 = crnz0.q(scionActivityInfo0);
            crnz0.b = crnz0.a;
            crnz0.a = null;
            crnz0.aK().f(new crnx(crnz0, crns0, v));
        }
        else {
            crnz0.a = null;
            crnz0.aK().f(new crnw(crnz0, v));
        }
        crpq crpq0 = this.a.l();
        long v1 = SystemClock.elapsedRealtime();
        crpq0.aK().f(new crpj(crpq0, v1));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        crns crns2;
        String s;
        ScionActivityInfo scionActivityInfo0 = ScionActivityInfo.a(activity0);
        crpq crpq0 = this.a.l();
        long v = SystemClock.elapsedRealtime();
        crpq0.aK().f(new crpi(crpq0, v));
        crnz crnz0 = this.a.j();
        Object object0 = crnz0.j;
        synchronized(object0) {
            crnz0.i = true;
            s = null;
            if(!Objects.equals(scionActivityInfo0, crnz0.e)) {
                __monitor_enter(object0);
                goto label_11;
            }
            goto label_21;
        }
    label_11:
        crnz0.e = scionActivityInfo0;
        crnz0.f = false;
        __monitor_exit(object0);
        try {
            if(crnz0.am().w()) {
                crnz0.g = null;
                crnz0.aK().f(new crny(crnz0));
            }
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_21:
        __monitor_exit(object0);
        if(!crnz0.am().w()) {
            crnz0.a = crnz0.g;
            crnz0.aK().f(new crnv(crnz0));
            return;
        }
        crns crns0 = crnz0.q(scionActivityInfo0);
        String s1 = scionActivityInfo0.b;
        crns crns1 = crnz0.a == null ? crnz0.b : crnz0.a;
        if(crns0.b == null) {
            if(s1 != null) {
                s = crnz0.x(s1);
            }
            crns2 = new crns(crns0.a, s, crns0.c, crns0.e, crns0.f, crns0.g);
        }
        else {
            crns2 = crns0;
        }
        crnz0.b = crnz0.a;
        crnz0.a = crns2;
        long v1 = SystemClock.elapsedRealtime();
        crnz0.aK().f(new crnu(crnz0, crns2, crns1, v1));
        crbw crbw0 = crnz0.e();
        long v2 = SystemClock.elapsedRealtime();
        crbw0.aK().f(new crbv(crbw0, v2));
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
        ScionActivityInfo scionActivityInfo0 = ScionActivityInfo.a(activity0);
        crnz crnz0 = this.a.j();
        if(crnz0.am().w() && bundle0 != null) {
            crns crns0 = (crns)crnz0.d.get(Integer.valueOf(scionActivityInfo0.a));
            if(crns0 != null) {
                Bundle bundle1 = new Bundle();
                bundle1.putLong("id", crns0.c);
                bundle1.putString("name", crns0.a);
                bundle1.putString("referrer_name", crns0.b);
                bundle0.putBundle("com.google.app_measurement.screen_service", bundle1);
            }
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

