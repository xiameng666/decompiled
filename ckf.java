public final class ckf implements cid {
    private final int a;

    public ckf() {
        this(null);
    }

    public ckf(int v) {
        this.a = v;
    }

    public ckf(byte[] arr_b) {
        this(0);
    }

    @Override  // chl
    public final cmx a(cmc cmc0) {
        return this.b(cmc0);
    }

    @Override  // cid
    public final cnc b(cmc cmc0) {
        return new cnl(this.a);
    }

    @Override  // cii
    public final cnd c(cmc cmc0) {
        return this.b(cmc0);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ckf) && ((ckf)object0).a == this.a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }
}

