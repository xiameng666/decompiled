import androidx.compose.runtime.ParcelableSnapshotMutableState;

public final class cbm implements cld {
    public final clj a;
    public hel b;
    public jlm c;
    public final gra d;
    public gui e;
    public final bzk f;

    public cbm(clj clj0, hel hel0, jlm jlm0) {
        this.a = clj0;
        this.b = hel0;
        this.c = jlm0;
        this.d = new ParcelableSnapshotMutableState(new jlk(0L), gul.a);
        this.f = new bzk(null);
    }

    public final long a(long v, long v1) {
        return this.b.a(v, v1, jlm.a);
    }

    public final long b() {
        gui gui0 = this.e;
        return gui0 == null ? ((jlk)this.d.a()).a : ((jlk)gui0.a()).a;
    }

    public final ceq c(int v, cii cii0, ibts ibts0) {
        if(this.i(v)) {
            return cef.b(cii0, new cbe(ibts0, this));
        }
        if(this.j(v)) {
            return cef.b(cii0, new cbf(ibts0, this));
        }
        if(cay.a(v, 2)) {
            return cef.c(cii0, new cbg(ibts0, this));
        }
        return cay.a(v, 3) ? cef.c(cii0, new cbh(ibts0, this)) : ceq.a;
    }

    public final cer d(int v, cii cii0, ibts ibts0) {
        if(this.i(v)) {
            return cef.f(cii0, new cbi(this, ibts0));
        }
        if(this.j(v)) {
            return cef.f(cii0, new cbj(this, ibts0));
        }
        if(cay.a(v, 2)) {
            return cef.g(cii0, new cbk(this, ibts0));
        }
        return cay.a(v, 3) ? cef.g(cii0, new cbl(this, ibts0)) : cer.a;
    }

    @Override  // cld
    public final Object e() {
        return this.a.e().e();
    }

    @Override  // cld
    public final Object f() {
        return this.a.e().f();
    }

    public static final void g(gra gra0, boolean z) {
        gra0.b(Boolean.valueOf(z));
    }

    @Override  // cld
    public final boolean h(Object object0, Object object1) {
        return clc.a(this, object0, object1);
    }

    private final boolean i(int v) {
        switch(v) {
            case 0: {
                return true;
            }
            case 4: {
                return this.c == jlm.a ? true : false;
            }
            default: {
                return v == 5 && this.c == jlm.b;
            }
        }
    }

    private final boolean j(int v) {
        if(!cay.a(v, 1)) {
            return !cay.a(v, 4) || this.c != jlm.b ? cay.a(v, 5) && this.c == jlm.a : true;
        }
        return true;
    }
}

