import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.SystemClock;
import j..util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class hbqy {
    public final String a;
    public final String b;
    public final hbqo c;
    public final haws d;
    public final evql e;
    public final String f;
    public final int g;
    public final Map h;
    public final Map i;
    private static gged_interceptors j;
    private static final ggeo k;
    private final evql l;

    static {
        hbqy.k = ggeo.l("optional-module-barcode", "com.google.android.gms.vision.barcode");
    }

    public hbqy(Context context0, haws haws0, hbqo hbqo0, String s) {
        String s1;
        this.h = new HashMap();
        this.i = new HashMap();
        this.a = "com.google.android.gms";
        try {
            s1 = String.valueOf(context0.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            havw.a.b("CommonUtils", "Exception thrown when trying to get app version " + packageManager$NameNotFoundException0.toString());
            s1 = "";
        }
        this.b = s1;
        this.d = haws0;
        this.c = hbqo0;
        hbrm.a();
        this.f = s;
        this.l = hawc.b().a(new hbqt(this));
        hawc hawc0 = hawc.b();
        Objects.requireNonNull(haws0);
        this.e = hawc0.a(new hbqu(haws0));
        this.g = hbqy.k.containsKey(s) ? bjia.b(context0, ((String)hbqy.k.get(s))) : -1;
    }

    static long a(List list0, double f) {
        return (long)(((Long)list0.get(Math.max(((int)Math.ceil(((long)f) / 0x4059000000000000L * ((double)list0.size()))) - 1, 0))));
    }

    public static gged_interceptors b() {
        gged_interceptors gged1;
        synchronized(hbqy.class) {
            gged_interceptors gged0 = hbqy.j;
            if(gged0 != null) {
                return gged0;
            }
            jzd jzd0 = jyw.a(Resources.getSystem().getConfiguration());
            ggdy ggdy0 = new ggdy();
            for(int v1 = 0; v1 < jzd0.a(); ++v1) {
                ggdy0.i(jzd0.g(v1).toLanguageTag());
            }
            gged1 = ggdy0.h();
            hbqy.j = gged1;
        }
        return gged1;
    }

    public final void c(hbqx hbqx0, hbko hbko0) {
        long v = SystemClock.elapsedRealtime();
        if(!this.f(hbko0, v)) {
            return;
        }
        this.h.put(hbko0, Long.valueOf(v));
        this.e(hbqx0.a(), hbko0);
    }

    public final void d(Object object0, long v, hbko hbko0, hbqw hbqw0) {
        hbqv hbqv0 = new hbqv(this, hbko0, object0, v, hbqw0);
        hawb.a.execute(hbqv0);
    }

    public final void e(hbrb hbrb0, hbko hbko0) {
        hbqr hbqr0 = new hbqr(this, hbrb0, hbko0, (this.l.n() ? ((String)this.l.j()) : basx.a.a(this.f)));
        hawb.a.execute(hbqr0);
    }

    public final boolean f(hbko hbko0, long v) {
        return this.h.get(hbko0) == null ? true : v - ((long)(((Long)this.h.get(hbko0)))) > TimeUnit.SECONDS.toMillis(30L);
    }
}

