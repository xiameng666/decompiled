import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import j..util.Objects;

public final class kgq {
    public static final kgq a;
    public final kgn b;

    static {
        if(Build.VERSION.SDK_INT >= 34) {
            kgq.a = kgm.e;
            return;
        }
        kgq.a = kgk.d;
    }

    private kgq(WindowInsets windowInsets0) {
        if(Build.VERSION.SDK_INT >= 34) {
            this.b = new kgm(this, windowInsets0);
            return;
        }
        this.b = new kgl(this, windowInsets0);
    }

    public kgq(kgq kgq0) {
        if(kgq0 != null) {
            kgn kgn0 = kgq0.b;
            if(Build.VERSION.SDK_INT >= 34 && (kgn0 instanceof kgm)) {
                this.b = new kgm(this, ((kgm)kgn0));
            }
            else if((kgn0 instanceof kgl)) {
                this.b = new kgl(this, ((kgl)kgn0));
            }
            else if((kgn0 instanceof kgk)) {
                this.b = new kgk(this, ((kgk)kgn0));
            }
            else if((kgn0 instanceof kgj)) {
                this.b = new kgj(this, ((kgj)kgn0));
            }
            else if((kgn0 instanceof kgi)) {
                this.b = new kgi(this, ((kgi)kgn0));
            }
            else if((kgn0 instanceof kgh)) {
                this.b = new kgh(this, ((kgh)kgn0));
            }
            else if((kgn0 instanceof kgg)) {
                this.b = new kgg(this, ((kgg)kgn0));
            }
            else {
                this.b = new kgn(this);
            }
            kgn0.g(this);
            return;
        }
        this.b = new kgn(this);
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        return (this.b instanceof kgg) ? ((kgg)this.b).a : null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof kgq) ? Objects.equals(this.b, ((kgq)object0).b) : false;
    }

    public final jxn f(int v) {
        return this.b.a(v);
    }

    public final jxn g(int v) {
        return this.b.c(v);
    }

    @Deprecated
    public final jxn h() {
        return this.b.p();
    }

    @Override
    public final int hashCode() {
        return this.b == null ? 0 : this.b.hashCode();
    }

    @Deprecated
    public final jxn i() {
        return this.b.w();
    }

    @Deprecated
    public final jxn j() {
        return this.b.d();
    }

    public static jxn k(jxn jxn0, int v, int v1, int v2, int v3) {
        int v4 = Math.max(0, jxn0.b - v);
        int v5 = Math.max(0, jxn0.c - v1);
        int v6 = Math.max(0, jxn0.d - v2);
        int v7 = Math.max(0, jxn0.e - v3);
        return v4 != v || v5 != v1 || v6 != v2 || v7 != v3 ? jxn.e(v4, v5, v6, v7) : jxn0;
    }

    public final kdp l() {
        return this.b.t();
    }

    @Deprecated
    public final kgq m() {
        return this.b.u();
    }

    @Deprecated
    public final kgq n() {
        return this.b.q();
    }

    @Deprecated
    public final kgq o() {
        return this.b.r();
    }

    public final kgq p(int v, int v1, int v2, int v3) {
        return this.b.e(v, v1, v2, v3);
    }

    @Deprecated
    public final kgq q(int v, int v1, int v2, int v3) {
        kgd kgd0 = Build.VERSION.SDK_INT >= 34 ? new kge(this) : new kgd(this);
        kgd0.c(jxn.e(v, v1, v2, v3));
        return kgd0.a();
    }

    public static kgq r(WindowInsets windowInsets0) {
        return kgq.s(windowInsets0, null);
    }

    public static kgq s(WindowInsets windowInsets0, View view0) {
        kay.i(windowInsets0);
        kgq kgq0 = new kgq(windowInsets0);
        if(view0 != null && view0.isAttachedToWindow()) {
            kgq0.u(key.a(view0));
            kgq0.t(view0.getRootView());
            kgq0.v(view0.getWindowSystemUiVisibility());
        }
        return kgq0;
    }

    final void t(View view0) {
        this.b.f(view0);
    }

    final void u(kgq kgq0) {
        this.b.j(kgq0);
    }

    final void v(int v) {
        this.b.k(v);
    }

    public final boolean w() {
        return this.b.s();
    }

    public final boolean x(int v) {
        return this.b.n(v);
    }
}

