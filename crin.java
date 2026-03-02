import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

public final class crin extends crbz {
    public final long a;
    public List b;
    private String c;
    private String d;
    private int e;
    private String f;
    private long g;
    private final long h;
    private String i;
    private int j;
    private String k;
    private String l;
    private long m;

    public crin(crkt crkt0, long v, long v1) {
        super(crkt0);
        this.m = 0L;
        this.h = v;
        this.a = v1;
    }

    @Override  // crbz
    protected final void d() {
        this.aJ().k.c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.a), Long.valueOf(this.h));
        PackageManager packageManager0 = this.aj().getPackageManager();
        String s = "";
        int v = 0x80000000;
        String s1 = "Unknown";
        String s2 = "unknown";
        if(packageManager0 == null) {
            this.aJ().c.b("PackageManager is null, app identity information might be inaccurate. appId", crji.a("com.google.android.gms"));
        }
        else {
            try {
                s2 = packageManager0.getInstallerPackageName("com.google.android.gms");
            }
            catch(IllegalArgumentException unused_ex) {
                this.aJ().c.b("Error retrieving app installer package name. appId", crji.a("com.google.android.gms"));
            }
            if(s2 == null) {
                s2 = "manual_install";
            }
            else if("com.android.vending".equals(s2)) {
                s2 = "";
            }
            try {
                PackageInfo packageInfo0 = packageManager0.getPackageInfo("com.google.android.gms", 0);
                if(packageInfo0 != null) {
                    boolean z = TextUtils.isEmpty(packageManager0.getApplicationLabel(packageInfo0.applicationInfo));
                    s1 = packageInfo0.versionName;
                    v = packageInfo0.versionCode;
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                this.aJ().c.c("Error retrieving package info. appId, appName", crji.a("com.google.android.gms"), "Unknown");
            }
        }
        this.c = "com.google.android.gms";
        this.f = s2;
        this.d = s1;
        this.e = v;
        this.g = 0L;
        crkt crkt0 = this.y;
        int v1 = crkt0.a();
        switch(v1) {
            case 0: {
                this.aJ().k.a("App measurement collection enabled");
                break;
            }
            case 1: {
                this.aJ().i.a("App measurement deactivated via the manifest");
                break;
            }
            case 3: {
                this.aJ().i.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                break;
            }
            case 4: {
                this.aJ().i.a("App measurement disabled via the manifest");
                break;
            }
            case 6: {
                this.aJ().h.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                break;
            }
            case 7: {
                this.aJ().i.a("App measurement disabled via the global data collection setting");
                break;
            }
            case 8: {
                this.aJ().i.a("App measurement disabled due to denied storage consent");
                break;
            }
            default: {
                this.aJ().i.a("App measurement disabled");
                this.aJ().d.a("Invalid scion state in identity");
            }
        }
        this.k = "";
        if(!this.al().a) {
            try {
                String s3 = crnr.a(this.aj(), crkt0.l);
                if(!TextUtils.isEmpty(s3)) {
                    s = s3;
                }
                this.k = s;
                if(v1 == 0) {
                    this.aJ().k.c("App measurement enabled for app package, google app id", this.c, this.k);
                }
            }
            catch(IllegalStateException illegalStateException0) {
                this.aJ().c.c("Fetching Google App Id failed with exception. appId", crji.a("com.google.android.gms"), illegalStateException0);
            }
        }
        this.b = null;
        if(!this.al().a) {
            List list0 = this.am().E();
            if(list0 == null) {
                this.b = null;
            }
            else if(list0.isEmpty()) {
                this.aJ().h.a("Safelisted event list is empty. Ignoring");
            }
            else {
                for(Object object0: list0) {
                    if(this.aq().V("safelisted event", ((String)object0))) {
                        continue;
                    }
                    goto label_74;
                }
                this.b = list0;
            }
        }
    label_74:
        if(packageManager0 != null) {
            this.j = bbsp.a(this.aj());
            return;
        }
        this.j = 0;
    }

    @Override  // crbz
    protected final boolean p() {
        return true;
    }

    final int q() {
        this.a();
        return this.j;
    }

    final int r() {
        this.a();
        return this.e;
    }

    final long s() {
        return this.am().i();
    }

    final AppMetadata t(String s) {
        int v12;
        long v11;
        boolean z4;
        String s11;
        long v10;
        String s10;
        long v7;
        long v6;
        Object object0;
        String s7;
        String s6;
        String s5;
        Class class0;
        this.n();
        this.m();
        String s1 = this.u();
        String s2 = this.v();
        this.a();
        String s3 = this.d;
        long v = (long)this.r();
        this.a();
        batl.s(this.f);
        String s4 = this.f;
        long v1 = this.s();
        this.a();
        this.n();
        long v2 = this.g;
        if(Long.compare(v2, 0L) == 0) {
            crqx crqx0 = this.y.p();
            Context context0 = this.aj();
            crqx0.n();
            batl.s(context0);
            batl.q("com.google.android.gms");
            PackageManager packageManager0 = context0.getPackageManager();
            MessageDigest messageDigest0 = crqx.D();
            long v3 = -1L;
            if(messageDigest0 == null) {
                crqx0.aJ().c.a("Could not get MD5 instance");
                v2 = -1L;
            }
            else if(packageManager0 == null) {
                v2 = 0L;
            }
            else {
                try {
                    if(crqx0.aa(context0, "com.google.android.gms")) {
                        v3 = 0L;
                    }
                    else {
                        PackageInfo packageInfo0 = bbsr.b(context0).e("com.google.android.gms", 0x40);
                        if(packageInfo0.signatures != null && packageInfo0.signatures.length > 0) {
                            v3 = crqx.s(messageDigest0.digest(packageInfo0.signatures[0].toByteArray()));
                        }
                        else {
                            crqx0.aJ().f.a("Could not get signatures");
                        }
                    }
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    crqx0.aJ().c.b("Package name not found", packageManager$NameNotFoundException0);
                    v2 = 0L;
                    goto label_44;
                }
                v2 = v3;
            }
        label_44:
            this.g = v2;
        }
        crkt crkt0 = this.y;
        boolean z = crkt0.v();
        int v4 = this.ap().q ^ 1;
        this.n();
        this.m();
        if(crkt0.v()) {
            try {
                class0 = this.aj().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            }
            catch(ClassNotFoundException unused_ex) {
                s5 = s1;
                s6 = s2;
                s7 = null;
                goto label_76;
            }
            if(class0 == null) {
                goto label_73;
            }
            else {
                try {
                    s5 = s1;
                    s6 = s2;
                    object0 = class0.getDeclaredMethod("getInstance", Context.class).invoke(null, this.aj());
                }
                catch(Exception unused_ex) {
                    this.aJ().g.a("Failed to obtain Firebase Analytics instance");
                    s7 = null;
                    goto label_76;
                }
                if(object0 == null) {
                    s7 = null;
                }
                else {
                    try {
                        s7 = (String)class0.getDeclaredMethod("getFirebaseInstanceId", null).invoke(object0, null);
                    }
                    catch(Exception unused_ex) {
                        this.aJ().h.a("Failed to retrieve Firebase Instance Id");
                        s7 = null;
                    }
                }
            }
        }
        else {
        label_73:
            s5 = s1;
            s6 = s2;
            s7 = null;
        }
    label_76:
        crkt crkt1 = this.y;
        long v5 = crkt1.g().d.a();
        if(v5 == 0L) {
            v6 = crkt1.w;
            v7 = v;
        }
        else {
            v7 = v;
            v6 = Math.min(crkt1.w, v5);
        }
        int v8 = this.q();
        crjx crjx0 = this.ap();
        crjx0.n();
        boolean z1 = crjx0.b().getBoolean("deferred_analytics_collection", false);
        boolean z2 = this.am().s();
        long v9 = this.h;
        List list0 = this.b;
        String s8 = this.ap().f().n();
        Boolean boolean0 = Boolean.valueOf(this.am().l("google_analytics_default_allow_ad_personalization_signals", true) != crly.d);
        if(this.i == null) {
            this.i = this.aq().A();
        }
        String s9 = this.i;
        if(this.ap().f().q()) {
            this.n();
            v10 = v9;
            if(this.m == 0L) {
                s10 = s9;
            }
            else {
                s10 = s9;
                if(this.l != null && System.currentTimeMillis() - this.m > 86400000L) {
                    this.w();
                }
            }
            if(this.l == null) {
                this.w();
            }
            s11 = this.l;
        }
        else {
            s10 = s9;
            v10 = v9;
            s11 = null;
        }
        boolean z3 = this.am().z();
        crqx crqx1 = this.aq();
        String s12 = this.u();
        if(crqx1.aj().getPackageManager() == null) {
            z4 = z3;
            v11 = 0L;
        }
        else {
            try {
                z4 = z3;
                v12 = bbsr.b(crqx1.aj()).d(s12, 0) == null ? 0 : 36;
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                if(!crqx1.al().a) {
                    crqx1.aJ().i.b("PackageManager failed to find running app: app_id", s12);
                }
                v12 = 0;
            }
            v11 = (long)v12;
        }
        int v13 = this.ap().f().c;
        String s13 = this.ap().d().c;
        hvhs.c();
        hvhs.c();
        long v14 = this.y.w;
        int v15 = this.i().r().m;
        return new AppMetadata(s5, s6, s3, v7, s4, v1, v2, s, z, ((boolean)v4), s7, v6, v8, z2, z1, boolean0, v10, list0, s8, s10, s11, z4, v11, v13, s13, (this.am().t(crif.aD) ? this.aq().j() : 0), (this.am().t(crif.aD) ? this.aq().r() : 0L), null, String.valueOf(crmb.a(new crbx(this.am().l("google_analytics_default_allow_ad_personalization_signals", true)).a)), v14, v15);
    }

    final String u() {
        this.a();
        batl.s(this.c);
        return this.c;
    }

    final String v() {
        this.n();
        this.a();
        batl.s(this.k);
        return this.k;
    }

    final void w() {
        String s;
        this.n();
        this.m();
        if(this.ap().f().p(crma.b)) {
            byte[] arr_b = new byte[16];
            this.aq().E().nextBytes(arr_b);
            s = String.format(Locale.US, "%032x", new BigInteger(1, arr_b));
        }
        else {
            this.aJ().j.a("Analytics Storage consent is not granted");
            s = null;
        }
        this.aJ().j.a(String.format("Resetting session stitching token to %s", (s == null ? "null" : "not null")));
        this.l = s;
        this.m = System.currentTimeMillis();
    }
}

