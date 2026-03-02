import j..util.Objects;

public final class fmmk {
    private fmml a;
    private int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private byte g;

    public final fmmo a() {
        if(this.g == 0x1F && this.a != null) {
            return new fmmo(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.a == null) {
            stringBuilder0.append(" element");
        }
        if((this.g & 1) == 0) {
            stringBuilder0.append(" paddingStart");
        }
        if((this.g & 2) == 0) {
            stringBuilder0.append(" paddingTop");
        }
        if((this.g & 4) == 0) {
            stringBuilder0.append(" paddingEnd");
        }
        if((this.g & 8) == 0) {
            stringBuilder0.append(" paddingBottom");
        }
        if((this.g & 16) == 0) {
            stringBuilder0.append(" useIncomingOutgoingColors");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(int v) {
        this.e = v;
        this.g = (byte)(this.g | 8);
    }

    public final void c(int v) {
        this.d = v;
        this.g = (byte)(this.g | 4);
    }

    public final void d(int v) {
        this.b = v;
        this.g = (byte)(this.g | 1);
    }

    public final void e(int v) {
        this.c = v;
        this.g = (byte)(this.g | 2);
    }

    public final void f(boolean z) {
        this.f = z;
        this.g = (byte)(this.g | 16);
    }

    public final void g() {
        this.a = fmkz.a;
    }

    public final void h(fmln fmln0) {
        Objects.requireNonNull(fmln0);
        this.a = new fmla(fmln0);
    }

    public final void i(fmlp fmlp0) {
        Objects.requireNonNull(fmlp0);
        this.a = new fmlb(fmlp0);
    }

    public final void j(fmlr fmlr0) {
        Objects.requireNonNull(fmlr0);
        this.a = new fmlc(fmlr0);
    }

    public final void k(fmlt fmlt0) {
        Objects.requireNonNull(fmlt0);
        this.a = new fmld(fmlt0);
    }

    public final void l(fmgu fmgu0) {
        Objects.requireNonNull(fmgu0);
        this.a = new fmle(fmgu0);
    }

    public final void m(fmhm fmhm0) {
        Objects.requireNonNull(fmhm0);
        this.a = new fmlf(fmhm0);
    }

    public final void n(fmmf fmmf0) {
        Objects.requireNonNull(fmmf0);
        this.a = new fmlg(fmmf0);
    }
}

