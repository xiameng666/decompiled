import android.content.Context;
import java.util.Locale;

public final class fxbl implements fwzd {
    private final fxbd a;
    private final cmdb b;

    public fxbl(Context context0) {
        ayud ayud0 = new aytt(context0, "STREAMZ_LOCATION").a();
        cdbi cdbi0 = hutj.a.d().c() ? new cdbi(cgtz.b) : new froz(ayud0, "STREAMZ_LOCATION");
        this.a = new fxbd(clhl.b.h(1, clhr.b), cdbi0);
        this.b = cmdb.b(ayud0, context0);
    }

    @Override  // fwzd
    public final void a() {
        this.a.a("download");
    }

    @Override  // fwzd
    public final void b(String s, String s1, String s2) {
        ((frpe)this.a.c.mr()).b(new Object[]{s, s1, s2});
    }

    @Override  // fwzd
    public final void c() {
        this.b.c(16);
    }

    @Override  // fwzd
    public final void d(long v, String s) {
        ((frpb)this.a.d.mr()).b(((double)v), new Object[]{"frewle", s});
    }

    @Override  // fwzd
    public final void e(fwzc fwzc0) {
        ((frpe)this.a.f.mr()).b(new Object[]{Boolean.valueOf(fwzc0.a), Boolean.valueOf(fwzc0.b), ((int)fwzc0.c), Boolean.valueOf(fwzc0.d), Boolean.valueOf(fwzc0.e), ((int)fwzc0.f), Boolean.valueOf(fwzc0.g), Boolean.valueOf(fwzc0.h)});
    }

    @Override  // fwzd
    public final void f(double f, String s, String s1) {
        ((frpb)this.a.b.mr()).b(f, new Object[]{s, s1});
    }

    @Override  // fwzd
    public final void g(int v) {
        this.a.a("clear_" + (v == 1 ? "PARAM_CHANGE" : "ERROR"));
    }

    @Override  // fwzd
    public final void h(int v) {
        this.a.a("eviction_" + (v == 1 ? "TTL" : "CAPACITY_EXCEEDED"));
    }

    @Override  // fwzd
    public final void i(int v, boolean z, boolean z1, boolean z2) {
        ((frpe)this.a.g.mr()).b(new Object[]{(v == 1 ? "FREWLE" : "RTT"), Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(z2)});
    }

    @Override  // fwzd
    public final void j(int v, int v1) {
        Locale locale0 = Locale.US;
        ((frpb)this.a.e.mr()).b(((double)v), new Object[]{String.format(locale0, "%s_%s", "frewle", (v1 == 1 ? "AP" : "BUILDING"))});
    }

    @Override  // fwzd
    public final void k() {
    }
}

