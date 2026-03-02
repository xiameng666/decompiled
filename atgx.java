public final class atgx {
    public final int a;
    public final gfsx b;
    private static final aram c;

    static {
        atgx.c = aram.c;
    }

    public atgx() {
        throw null;
    }

    public atgx(int v, gfsx gfsx0) {
        this.a = v;
        this.b = gfsx0;
    }

    public static atgx a(int v, boolean z) {
        if(v > 0) {
            int v1 = Math.min(v, 2);
            switch(v1) {
                case 0: 
                case 1: {
                    return new atgx(v1, gfqx.a);
                }
                case 2: {
                    return z ? new atgx(2, gfsx.m(atgx.c)) : new atgx(2, gfsx.m(aram.b));
                }
                default: {
                    throw new IllegalArgumentException(String.format("unknown code level: %d", v1));
                }
            }
        }
        throw new IllegalArgumentException(String.format("Max code level to write (%d) is lower than the minimum code level that is supported (%d)", v, ((int)1)));
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof atgx) && this.a == ((atgx)object0).a && this.b.equals(((atgx)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "BackupCodeLevelParams{codeLevel=" + this.a + ", compressionMethod=" + this.b.toString() + "}";
    }
}

