public final class ethj {
    public final gged_interceptors a;

    public ethj() {
        this(null);
    }

    public ethj(gged_interceptors gged0) {
        ibuq.f(gged0, "devices");
        super();
        this.a = gged0;
    }

    public ethj(byte[] arr_b) {
        this(ggna.a);
    }

    public static final ethj a(gged_interceptors gged0) {
        ibuq.f(gged0, "devices");
        return new ethj(gged0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ethj) ? ibuq.m(this.a, ((ethj)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceListState(devices=" + this.a + ")";
    }
}

