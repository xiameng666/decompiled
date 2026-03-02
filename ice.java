public final class ice extends hfb implements ifk, ijm {
    public hze a;
    private final ibts b;

    public ice(hze hze0) {
        this.a = hze0;
        this.b = new icd(this, hze0);
    }

    public final bzd a() {
        return this.a.d;
    }

    @Override  // ifk
    public final iav b(iax iax0, ias ias0, long v) {
        ibq ibq0 = ias0.e(v);
        int v1 = ibq0.a;
        int v2 = ibq0.b;
        icc icc0 = new icc(ibq0);
        return iaw.c(iax0, v1, v2, this.b, icc0);
    }

    @Override  // ijm
    public final Object dK() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override  // ifk
    public final int e(hzg hzg0, hzf hzf0, int v) {
        return ifj.a(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int f(hzg hzg0, hzf hzf0, int v) {
        return ifj.b(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int g(hzg hzg0, hzf hzf0, int v) {
        return ifj.c(this, hzg0, hzf0, v);
    }

    @Override  // ifk
    public final int h(hzg hzg0, hzf hzf0, int v) {
        return ifj.d(this, hzg0, hzf0, v);
    }
}

