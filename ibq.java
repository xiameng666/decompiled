public abstract class ibq implements iay {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    public ibq() {
        this.c = 0L;
        this.d = ibs.b;
        this.e = 0L;
    }

    public abstract void dZ(long arg1, float arg2, ibts arg3);

    protected final void eq(long v) {
        if(!jkp.h(this.d, v)) {
            this.d = v;
            this.er();
        }
    }

    private final void er() {
        this.a = ibwt.j(((int)(this.c >> 0x20)), jkp.d(this.d), jkp.b(this.d));
        int v = ibwt.j(((int)(this.c & 0xFFFFFFFFL)), jkp.c(this.d), jkp.a(this.d));
        this.b = v;
        this.e = ((long)((this.a - ((int)(this.c >> 0x20))) / 2)) << 0x20 | ((long)((v - ((int)(this.c & 0xFFFFFFFFL))) / 2)) & 0xFFFFFFFFL;
    }

    public Object f() {
        return null;
    }

    public final int u() {
        return this.b;
    }

    public int v() {
        return (int)(this.c & 0xFFFFFFFFL);
    }

    public int w() {
        return (int)(this.c >> 0x20);
    }

    public final int x() {
        return this.a;
    }

    public void y(long v, float f, hpn hpn0) {
        this.dZ(v, f, null);
    }

    protected final void z(long v) {
        if(!jlk.c(this.c, v)) {
            this.c = v;
            this.er();
        }
    }
}

