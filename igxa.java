import java.util.Locale;

final class igxa extends igvx {
    final int e;

    public igxa(igvt igvt0, String s, int v) {
        super(igvt0, s);
        this.e = v;
        if(v > 0x20) {
            igvt0.d(((long)v));
        }
        else {
            igvt0.c(v);
        }
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return (int)this.e;
    }

    @Override  // igvx
    public final String toString() {
        return String.format(Locale.UK, "(%1$d bits)", ((int)this.e));
    }
}

