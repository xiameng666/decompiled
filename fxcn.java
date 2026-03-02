import j..util.Objects;

class fxcn {
    private final Runnable a;
    private final boolean b;
    public final fwzh c;
    public final fwze d;
    public final fvtz e;
    public boolean f;
    final fxcq g;

    public fxcn(fxcq fxcq0, fwzh fwzh0, fwze fwze0, fvtz fvtz0, boolean z, Runnable runnable0) {
        Objects.requireNonNull(fxcq0);
        this.g = fxcq0;
        super();
        this.c = fwzh0;
        this.d = fwze0;
        this.e = fvtz0;
        this.b = z;
        this.a = runnable0;
    }

    public void a(fvtd fvtd0, int v) {
        fxcq fxcq0 = this.g;
        fxcq0.b(fvtd0, v, 1);
        if(fxcq0.g) {
            return;
        }
        fxcq0.b.a(fvtd0, v);
        this.d(fvtd0, false, this.a);
    }

    public fwzi b(fvtz fvtz0, boolean z) {
        long v7;
        long v6;
        long v5;
        long v = this.d.f().b();
        long v1 = this.d.m().i();
        long v2 = fvtz0.a;
        long v3 = 0x7FFFFFFFFFFFFFFFL;
        if(!z && v1 != 0x8000000000000000L) {
            try {
                long v4 = v1 + v2;
                if((((v1 ^ v2) >= 0L ? 0 : 1) | ((v1 ^ v4) < 0L ? 0 : 1)) == 0) {
                    throw new ArithmeticException();
                }
                v5 = Math.max(v4, v);
            }
            catch(ArithmeticException unused_ex) {
                v6 = 0x7FFFFFFFFFFFFFFFL;
                v7 = 0x7FFFFFFFFFFFFFFFL;
                goto label_16;
            }
        }
        else {
            v5 = v;
        }
        v6 = v2 == 0x7FFFFFFFFFFFFFFFL ? 0x7FFFFFFFFFFFFFFFL : v5 - v;
        v7 = v5;
    label_16:
        long v8 = v7 - v1;
        if((((v7 ^ v1) < 0L ? 0 : 1) | ((v7 ^ v8) < 0L ? 0 : 1)) == 0) {
            try {
                throw new ArithmeticException();
            }
            catch(ArithmeticException unused_ex) {
            }
        }
        else {
            v3 = v8;
        }
        int v9 = (int)Math.min(Math.min(v3, 20000L), v2);
        ffsb ffsb0 = this.g.a.mG();
        long v10 = this.g.a.m().j();
        fwzk fwzk0 = new fwzk(true, v9, (fvrx.a(fvtz0.f, ffsb0 == ffsb.b, v10, v7) ? 2 : 1));
        fwzj fwzj0 = new fwzj(true, v9);
        fwrm.a(this.d.mH(), 19, ((int)v6), v9);
        fwzi fwzi0 = new fwzi(fwzk0, fwzj0);
        fwzi0.a = v2;
        fwzi0.e = fvtz0.f;
        fwzi0.b = fvtz0.c;
        fwzi0.c = v6;
        return fwzi0;
    }

    public void c() {
        fwyz fwyz0 = this.d.m();
        fvvc fvvc0 = fvvc.q(this.d.f().b());
        fwyz0.mR(ggna.a, fvvc0);
    }

    public final void d(fvtd fvtd0, boolean z, Runnable runnable0) {
        fwze fwze0 = this.d;
        fwze0.mJ().a();
        fxcq fxcq0 = this.g;
        if(fxcq0.g) {
            return;
        }
        fwze0.s().i(fwzf.a, 60000L, this.e.d);
        fxcq0.f = true;
        gmcd gmcd0 = fxcs.a(fwze0, fxcq0.c, this.e.d, z, this.b, fvtd0);
        fwze0.g().b(glzd.f(gmcd0, new fxcm(this, runnable0), fwze0.mJ().a));
    }
}

