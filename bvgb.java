public final class bvgb {
    public final bvfm a;
    public final bvge b;

    public bvgb() {
        this(null, null);
    }

    public bvgb(bvfm bvfm0, bvge bvge0) {
        this.a = bvfm0;
        this.b = bvge0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof bvgb)) {
            return false;
        }
        return ibuq.m(this.a, ((bvgb)object0).a) ? ibuq.m(this.b, ((bvgb)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        bvge bvge0 = this.b;
        if(bvge0 != null) {
            v = bvge0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "GoogleAccountInfoUiModel(accountSelector=" + this.a + ", manageAccountButton=" + this.b + ")";
    }
}

