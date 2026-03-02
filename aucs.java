import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class aucs extends aubi {
    public static final avjh h;
    public final auhn i;
    public final String j;
    public final String k;
    final aubj l;
    public aucd m;
    public final Set n;
    private final auca o;

    static {
        aucs.h = new avjh("CSC_GAC");
    }

    public aucs(CastDevice castDevice0, CastDevice castDevice1, String s, String s1, String s2, String s3, aubj aubj0, ScheduledExecutorService scheduledExecutorService0, auhn auhn0, auca auca0) {
        super(castDevice0, null, scheduledExecutorService0, (TextUtils.isEmpty(aubj0.d) ? "CSC_GAC" : String.format("%s-%s", aubj0.d, "CSC_GAC")), aubj0.a);
        this.n = new HashSet();
        this.v(aubj0);
        this.i = auhn0;
        this.o = auca0;
        this.j = s;
        this.k = s1;
        aucq aucq0 = new aucq(this);
        aubj aubj1 = new aubj(aubj0.a, aubj0.b, aubj0.c, aubj0.d, aucq0);
        this.l = aubj1;
        this.m = auca0.a(castDevice1, this.g, s2, s3, aubj1);
    }

    @Override  // aubi
    public final CastDevice a() {
        return this.e;
    }

    @Override  // aubi
    public final String b() {
        return this.m == null ? "" : this.m.b();
    }

    @Override  // aubi
    public final void c() {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.c();
        }
    }

    @Override  // aubi
    public final void d(boolean z) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.d(z);
        }
    }

    @Override  // aubi
    public final void e(String s, String s1, JoinOptions joinOptions0) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.e(s, s1, joinOptions0);
        }
    }

    @Override  // aubi
    public final void f(String s, LaunchOptions launchOptions0) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.f(s, launchOptions0);
        }
    }

    @Override  // aubi
    public final void g() {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.g();
        }
    }

    @Override  // aubi
    public final void h(String s, String s1) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.h(s, s1);
        }
    }

    @Override  // aubi
    public final void i(String s) {
        aucd aucd0 = this.m;
        if(aucd0 != null && s != null) {
            aucd0.i(s);
        }
    }

    @Override  // aubi
    public final void j() {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.j();
        }
    }

    @Override  // aubi
    public final void k(String s, byte[] arr_b, long v) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.k(s, arr_b, v);
        }
    }

    @Override  // aubi
    public final void l(String s, String s1, long v) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.l(s, s1, v);
        }
    }

    @Override  // aubi
    public final void m(String s, String s1, long v, String s2) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.m(s, s1, v, s2);
        }
    }

    @Override  // aubi
    public final void n(String s) {
        aucd aucd0 = this.m;
        if(aucd0 != null) {
            aucd0.n(s);
        }
    }

    @Override  // aubi
    public final void o(String s) {
        aucd aucd0 = this.m;
        if(aucd0 != null && s != null) {
            aucd0.o(s);
        }
    }

    @Override  // aubi
    public final boolean p() {
        return this.m == null ? false : this.m.p();
    }

    @Override  // aubi
    public final boolean q() {
        return this.m == null ? false : this.m.q();
    }

    @Override  // aubi
    public final boolean r() {
        return this.m == null ? false : this.m.r();
    }

    @Override  // aubi
    public final boolean s(boolean z, double f, boolean z1) {
        return this.m == null ? false : this.m.s(z, f, z1);
    }

    @Override  // aubi
    public final boolean t(double f, double f1, boolean z) {
        return this.m == null ? false : this.m.t(f, f1, z);
    }

    @Override  // aubi
    public final void u(EqualizerSettings equalizerSettings0) {
        aucd aucd0 = this.m;
        if(aucd0 == null) {
            return;
        }
        aucd0.u(equalizerSettings0);
    }

    public final void v(aubj aubj0) {
        this.n.add(aubj0);
    }
}

