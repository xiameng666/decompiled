import android.os.Build.VERSION;
import android.view.View;
import android.view.WindowInsets;
import j..util.Objects;

class kgg extends kgn {
    final WindowInsets a;
    jxn b;
    int c;
    private jxn d;
    private kgq e;

    public kgg(kgq kgq0, WindowInsets windowInsets0) {
        super(kgq0);
        this.d = null;
        this.a = windowInsets0;
    }

    public kgg(kgq kgq0, kgg kgg0) {
        this(kgq0, new WindowInsets(kgg0.a));
    }

    private jxn A(View view0) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override  // kgn
    public jxn a(int v) {
        return this.y(v, false);
    }

    protected jxn b(int v, boolean z) {
        switch(v) {
            case 1: {
                if(z) {
                    return jxn.e(0, Math.max(this.z().c, this.d().c), 0, 0);
                }
                return (this.c & 4) == 0 ? jxn.e(0, this.d().c, 0, 0) : jxn.a;
            }
            case 2: {
                if(z) {
                    jxn jxn0 = this.z();
                    jxn jxn1 = this.p();
                    return jxn.e(Math.max(jxn0.b, jxn1.b), 0, Math.max(jxn0.d, jxn1.d), Math.max(jxn0.e, jxn1.e));
                }
                if((this.c & 2) != 0) {
                    return jxn.a;
                }
                jxn jxn2 = this.d();
                jxn jxn3 = this.e == null ? null : this.e.h();
                return jxn.e(jxn2.b, 0, jxn2.d, (jxn3 == null ? jxn2.e : Math.min(jxn2.e, jxn3.e)));
            }
            case 8: {
                jxn jxn4 = this.d();
                jxn jxn5 = this.z();
                int v1 = jxn4.e;
                int v2 = jxn5.e;
                if(v1 <= v2) {
                    if(this.b != null && !this.b.equals(jxn.a)) {
                        v1 = this.b.e;
                        return v1 <= v2 ? jxn.a : jxn.e(0, 0, 0, v1);
                    }
                    return jxn.a;
                }
                return jxn.e(0, 0, 0, v1);
            }
            case 16: {
                return this.w();
            }
            case 0x20: {
                return this.v();
            }
            case 0x40: {
                return this.x();
            }
            case 0x80: {
                kgq kgq0 = this.e;
                kdp kdp0 = kgq0 == null ? this.t() : kgq0.l();
                return kdp0 == null ? jxn.a : jxn.e(kdp0.a.getSafeInsetLeft(), kdp0.a.getSafeInsetTop(), kdp0.a.getSafeInsetRight(), kdp0.a.getSafeInsetBottom());
            }
            default: {
                return jxn.a;
            }
        }
    }

    @Override  // kgn
    public jxn c(int v) {
        return this.y(v, true);
    }

    @Override  // kgn
    public final jxn d() {
        if(this.d == null) {
            this.d = jxn.e(this.a.getSystemWindowInsetLeft(), this.a.getSystemWindowInsetTop(), this.a.getSystemWindowInsetRight(), this.a.getSystemWindowInsetBottom());
        }
        return this.d;
    }

    @Override  // kgn
    public kgq e(int v, int v1, int v2, int v3) {
        kgq kgq0 = kgq.r(this.a);
        kgd kgd0 = Build.VERSION.SDK_INT >= 34 ? new kge(kgq0) : new kgd(kgq0);
        kgd0.c(kgq.k(this.d(), v, v1, v2, v3));
        kgd0.b(kgq.k(this.p(), v, v1, v2, v3));
        return kgd0.a();
    }

    @Override  // kgn
    public boolean equals(Object object0) {
        return super.equals(object0) ? Objects.equals(this.b, ((kgg)object0).b) && kgg.o(this.c, ((kgg)object0).c) : false;
    }

    @Override  // kgn
    public void f(View view0) {
        jxn jxn0 = this.A(view0);
        if(jxn0 == null) {
            jxn0 = jxn.a;
        }
        this.i(jxn0);
    }

    @Override  // kgn
    public void g(kgq kgq0) {
        kgq0.u(this.e);
        kgq0.b.i(this.b);
        kgq0.v(this.c);
    }

    @Override  // kgn
    public void h(jxn[] arr_jxn) {
    }

    @Override  // kgn
    public void i(jxn jxn0) {
        this.b = jxn0;
    }

    @Override  // kgn
    public void j(kgq kgq0) {
        this.e = kgq0;
    }

    @Override  // kgn
    public void k(int v) {
        this.c = v;
    }

    @Override  // kgn
    public boolean l() {
        return this.a.isRound();
    }

    protected boolean m(int v) {
        switch(v) {
            case 4: {
                return false;
            }
            case 1: 
            case 2: 
            case 8: 
            case 0x80: {
                return !this.b(v, false).equals(jxn.a);
            }
            default: {
                return true;
            }
        }
    }

    @Override  // kgn
    public boolean n(int v) {
        for(int v1 = 1; v1 <= 0x200; v1 += v1) {
            if((v & v1) != 0 && !this.m(v1)) {
                return false;
            }
        }
        return true;
    }

    static boolean o(int v, int v1) {
        return (v & 6) == (v1 & 6);
    }

    private jxn y(int v, boolean z) {
        jxn jxn0 = jxn.a;
        for(int v1 = 1; v1 <= 0x200; v1 += v1) {
            if((v & v1) != 0) {
                jxn0 = jxn.c(jxn0, this.b(v1, z));
            }
        }
        return jxn0;
    }

    private jxn z() {
        return this.e == null ? jxn.a : this.e.h();
    }
}

