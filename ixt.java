public final class ixt {
    public final ixs a;
    public final ixr b;

    public ixt() {
        this(null, new ixr(null));
    }

    public ixt(ixs ixs0, ixr ixr0) {
        this.a = ixs0;
        this.b = ixr0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ixt)) {
            return false;
        }
        return ibuq.m(this.b, ((ixt)object0).b) ? ibuq.m(this.a, ((ixt)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        ixr ixr0 = this.b;
        if(ixr0 != null) {
            v = ixr0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}

