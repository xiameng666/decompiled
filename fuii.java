public final class fuii extends fuij {
    public final fuip a;

    public fuii() {
        this(null);
    }

    public fuii(fuip fuip0) {
        ibuq.f(fuip0, "status");
        super();
        this.a = fuip0;
    }

    public fuii(byte[] arr_b) {
        this(fuip.a);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof fuii) ? this.a == ((fuii)object0).a : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Defaults(status=" + this.a + ")";
    }
}

