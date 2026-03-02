import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

public final class crcu extends crlu {
    public crct a;
    public Boolean b;
    private Boolean c;

    public crcu(crkt crkt0) {
        super(crkt0);
        this.a = new crcs();
    }

    public static final long A() {
        return (long)(((Long)crif.e.a()));
    }

    public static final int B() {
        return Math.max(0, ((Integer)crif.j.a()).intValue());
    }

    public static final long C() {
        return (long)(((int)(((Integer)crif.l.a()))));
    }

    public static final long D() {
        return (long)(((Long)crif.Q.a()));
    }

    final List E() {
        Integer integer0;
        batl.q("analytics.safelisted_events");
        Bundle bundle0 = this.k();
        if(bundle0 == null) {
            this.aJ().c.a("Failed to load metadata: Metadata bundle is null");
            integer0 = null;
        }
        else {
            integer0 = bundle0.containsKey("analytics.safelisted_events") ? bundle0.getInt("analytics.safelisted_events") : null;
        }
        if(integer0 == null) {
            return null;
        }
        try {
            String[] arr_s = this.aj().getResources().getStringArray(integer0.intValue());
            return arr_s == null ? null : Arrays.asList(arr_s);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            this.aJ().c.b("Failed to load string array from metadata: resource not found", resources$NotFoundException0);
            return null;
        }
    }

    public static final long F() {
        return Math.max(0L, ((Long)crif.K.a()).longValue());
    }

    public static final long G() {
        return (long)(((Long)crif.L.a()));
    }

    public final String H(String s) {
        try {
            String s1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            batl.s(s1);
            return s1;
        }
        catch(ClassNotFoundException classNotFoundException0) {
            this.aJ().c.b("Could not find SystemProperties class", classNotFoundException0);
            return "";
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            this.aJ().c.b("Could not find SystemProperties.get() method", noSuchMethodException0);
            return "";
        }
        catch(IllegalAccessException illegalAccessException0) {
            this.aJ().c.b("Could not access SystemProperties.get()", illegalAccessException0);
            return "";
        }
        catch(InvocationTargetException invocationTargetException0) {
            this.aJ().c.b("SystemProperties.get() threw an exception", invocationTargetException0);
            return "";
        }
    }

    final int a(String s) {
        return this.g(s, crif.V, 500, 2000);
    }

    final int b(String s, boolean z) {
        return z ? this.g(s, crif.aa, 100, 500) : 500;
    }

    final int c(String s, boolean z) {
        return Math.max(this.b(s, z), 0x100);
    }

    public final int d(String s) {
        return this.g(s, crif.W, 25, 100);
    }

    public final int e(String s) {
        return this.f(s, crif.p);
    }

    public final int f(String s, crie crie0) {
        if(TextUtils.isEmpty(s)) {
            return (int)(((Integer)crie0.a()));
        }
        String s1 = this.a.a(s, crie0.a);
        if(TextUtils.isEmpty(s1)) {
            return (int)(((Integer)crie0.a()));
        }
        try {
            return (int)(((Integer)crie0.b(Integer.valueOf(Integer.parseInt(s1)))));
        }
        catch(NumberFormatException unused_ex) {
            return (int)(((Integer)crie0.a()));
        }
    }

    public final int g(String s, crie crie0, int v, int v1) {
        return Math.max(Math.min(this.f(s, crie0), v1), v);
    }

    final long h(String s) {
        return this.j(s, crif.b);
    }

    public final long i() {
        return this.al().a ? 0x3DDFAL : 136000L;
    }

    public final long j(String s, crie crie0) {
        if(TextUtils.isEmpty(s)) {
            return (long)(((Long)crie0.a()));
        }
        String s1 = this.a.a(s, crie0.a);
        if(TextUtils.isEmpty(s1)) {
            return (long)(((Long)crie0.a()));
        }
        try {
            return (long)(((Long)crie0.b(Long.valueOf(Long.parseLong(s1)))));
        }
        catch(NumberFormatException unused_ex) {
            return (long)(((Long)crie0.a()));
        }
    }

    final Bundle k() {
        try {
            if(this.aj().getPackageManager() == null) {
                this.aJ().c.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo0 = bbsr.b(this.aj()).d("com.google.android.gms", 0x80);
            if(applicationInfo0 == null) {
                this.aJ().c.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo0.metaData;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.aJ().c.b("Failed to load metadata: Package name not found", packageManager$NameNotFoundException0);
            return null;
        }
    }

    public final crly l(String s, boolean z) {
        Object object0;
        this.m();
        batl.q(s);
        Bundle bundle0 = this.k();
        if(bundle0 == null) {
            this.aJ().c.a("Failed to load metadata: Metadata bundle is null");
            object0 = null;
        }
        else {
            object0 = bundle0.get(s);
        }
        if(object0 == null) {
            return crly.a;
        }
        if(Boolean.TRUE.equals(object0)) {
            return crly.d;
        }
        if(Boolean.FALSE.equals(object0)) {
            return crly.c;
        }
        if(z && "eu_consent_policy".equals(object0)) {
            return crly.b;
        }
        this.aJ().f.b("Invalid manifest metadata for", s);
        return crly.a;
    }

    final Boolean o(String s) {
        batl.q(s);
        Bundle bundle0 = this.k();
        if(bundle0 == null) {
            this.aJ().c.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        return bundle0.containsKey(s) ? Boolean.valueOf(bundle0.getBoolean(s)) : null;
    }

    public final String p() {
        return this.H("debug.firebase.analytics.app");
    }

    final String q() {
        return this.al().a ? "FA-SVC" : "FA";
    }

    public final String r(String s, crie crie0) {
        return TextUtils.isEmpty(s) ? ((String)crie0.a()) : ((String)crie0.b(this.a.a(s, crie0.a)));
    }

    public final boolean s() {
        this.m();
        Boolean boolean0 = this.o("google_analytics_adid_collection_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean t(crie crie0) {
        return this.u(null, crie0);
    }

    public final boolean u(String s, crie crie0) {
        if(TextUtils.isEmpty(s)) {
            return ((Boolean)crie0.a()).booleanValue();
        }
        String s1 = this.a.a(s, crie0.a);
        return TextUtils.isEmpty(s1) ? ((Boolean)crie0.a()).booleanValue() : ((Boolean)crie0.b(Boolean.valueOf("1".equals(s1)))).booleanValue();
    }

    public final boolean v(String s) {
        return "1".equals(this.a.a(s, "gaia_collection_enabled"));
    }

    public final boolean w() {
        this.m();
        Boolean boolean0 = this.o("google_analytics_automatic_screen_reporting_enabled");
        return boolean0 == null || boolean0.booleanValue();
    }

    public final boolean x() {
        if(this.al().a) {
            return false;
        }
        Boolean boolean0 = this.o("firebase_analytics_collection_deactivated");
        return boolean0 != null && boolean0.booleanValue();
    }

    final boolean y() {
        if(this.c == null) {
            Boolean boolean0 = this.o("app_measurement_lite");
            this.c = boolean0;
            if(boolean0 == null) {
                this.c = Boolean.valueOf(false);
            }
        }
        return this.c.booleanValue() || !this.y.b;
    }

    public final boolean z() {
        this.m();
        Boolean boolean0 = this.o("google_analytics_sgtm_upload_enabled");
        return boolean0 == null ? false : boolean0.booleanValue();
    }
}

